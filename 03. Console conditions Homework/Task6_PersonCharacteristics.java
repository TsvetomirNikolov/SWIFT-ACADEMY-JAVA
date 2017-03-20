package pkg03.console.applications;

import java.util.Scanner;

public class Task6_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personCharacteristic = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < personCharacteristic; i++) {
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            Short dateOfBirth = Short.parseShort(scanner.nextLine());
            Double weight = Double.parseDouble(scanner.nextLine());
            Short height = Short.parseShort(scanner.nextLine());
            String proffesion = scanner.nextLine();
            
            if (2017 - dateOfBirth < 18) {
                System.out.println(String.format("%s %s is %d years old. "
                        + "His weight is %.1f and he is %d cm tall. He is %s.%s %s is under-aged.",
                        firstName, lastName, 2017 - dateOfBirth, weight, height, proffesion, firstName, lastName));
            } else {
                System.out.println(String.format("%s %s is %d years old. "
                        + "His weight is %.1f and he is %d cm tall. He is %s.", firstName, lastName, 2017 - dateOfBirth, weight, height, proffesion));
            }
        }
    }
}
