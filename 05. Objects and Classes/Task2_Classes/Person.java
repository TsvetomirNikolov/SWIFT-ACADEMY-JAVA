package pkg05.objects.and.classess.Task2_Classes;

import java.util.Scanner;

public class Person {

    String name;
    int age;

    Person() {
        this.name = "No name";
        this.age = -1;
    }

    Person(String name) {
        setName(name);
        this.age = -1;
    }

    Person(String newName, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("Enter valid name: ");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("ERROR");
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
//        I think this is not needed, because I dont see any input parameters
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        Person pers = new Person(name, age);
       
    }

    public String introduce() {
        String greeting = "";
        if (name.equals("no name")) {
            greeting = "I am John Doe";
            return greeting;
        }
        if (age < 0) {
            greeting += String.format("Hello I am %s\n", name);
            return greeting;
        } else {
            greeting += String.format("Hello, I am %s. I am %d years old.", name, age);
            return greeting;
        }
    }
}
