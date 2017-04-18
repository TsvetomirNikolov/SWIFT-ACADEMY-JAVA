package Task2_UniversityManagement;

import java.util.Scanner;

public class Task2_UniversityManagement {

    private static Person[] person = new Person[500];
    private static Person luckless;
    private static double budget = 500;
    private static int personCounter;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] command = input.split(" ");
            if (input.equals("END")) {
                break;
            }
            switch (command[0]) {
                case "NEW":
                    person[personCounter++] = commands(command);
                    break;
                case "WORK":
                    work(command);
                    break;
                case "IDLE":
                    idle();
                    break;
            }
            if (luckless != null) {
                System.out.println(luckless.getName() + " is not happy.");
                return;
            }
            if (budget <= 0) {
                System.out.println("Bankrupcy");
                return;
            }
        }
        for (Person p : person) {
            if (p == null) {
                break;
            }
            System.out.println(p);
        }

    }

    private static Person commands(String[] command) {
        String[] object;
        switch (command[1]) {
            case "MAINT":
                return new MaintenanceEmployee(command[2], command[3]);
            case "ADMIN":
                object = new String[command.length - 4];
                System.arraycopy(command, 3, object, 0, command.length - 4);
                return new AdministrationEmployee(command[2], command[3], object);
            case "TEACH":
                object = new String[command.length - 4];
                System.arraycopy(command, 3, object, 0, command.length - 4);
                return new Teacher(command[2], command[3], object);
            case "STUD":
                object = new String[command.length - 5];
                System.arraycopy(command, 3, object, 0, command.length - 5);
                return new Student(command[2], command[3], command[4], object);
            default:
                return null;
        }
    }

    private static void work(String[] command) {
        for (Person p : person) {
            if (p != null && p.getName().equals(command[1])) {
                p.work();
                if (luckless != null) {
                    return;
                }
                if (!(p instanceof Student)) {
                    budget -= ((Employee) p).getSalaryPerHour();
                }
                return;
            }
        }
    }

    private static void idle() {
        for (Person p : person) {
            if (p == null) {
                return;
            }

            p.increaseToleration(-5);
            if (p.getToleraion() <= 0) {
                luckless = p;
                return;
            }
        }
    }

    static Person[] getPeople() {
        return person;
    }

    static void increaseBudget(int i) {
        budget += i;
    }

    static void setluckless(Person unhappyPerson) {
        Task2_UniversityManagement.luckless = unhappyPerson;
    }
}
