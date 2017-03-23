package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task5_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personCharacteristic = Integer.parseInt(scanner.nextLine());
        double[] gradesOfStudents = new double[4]; // Make an array for grades.
        for (int i = 0; i < personCharacteristic; i++) {
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            char gender = scanner.nextLine().charAt(0);
            Short dateOfBirth = Short.parseShort(scanner.nextLine());
            Double weight = Double.parseDouble(scanner.nextLine());
            Short height = Short.parseShort(scanner.nextLine());
            String proffesion = scanner.nextLine();
            for (int j = 0; j < 4; j++) { // Make a for loop to read the grades.
                gradesOfStudents[j] = Double.parseDouble(scanner.nextLine());
            }
            double total = 0.0;
            for (double gradesOfStudent : gradesOfStudents) { // Make this manipulation because with Arrays.stream.average can't format and print the result.
                total += gradesOfStudent;
            }
            double average = total / gradesOfStudents.length; 
            if (2017 - dateOfBirth < 18) {
                if (gender == 'M') {
                    System.out.println(String.format("%s %s is %d years old. He was born in %d."
                            + "His weight is %.1f and he is %d cm tall. He is a %s with an average grade of %.3f.%s %s is under-aged.",
                            firstName, lastName, 2017 - dateOfBirth, dateOfBirth, weight, height, proffesion, average, firstName, lastName));
                } else {
                    System.out.println(String.format("%s %s is %d years old. She was born in %d."
                            + "Her weight is %.1f and he is %d cm tall. She is a %s with an average grade of %.3f.%s %s is under-aged.",
                            firstName, lastName, 2017 - dateOfBirth, dateOfBirth, weight, height, proffesion, average, firstName, lastName));
                }

            } else {
                if (gender == 'M') {
                    System.out.println(String.format("%s %s is %d years old. He was born in %d."
                            + "His weight is %.1f and he is %d cm tall. He is a %s with an average grade of %.3f.",
                            firstName, lastName, 2017 - dateOfBirth, dateOfBirth, weight, height, proffesion, average));
                } else {
                    System.out.println(String.format("%s %s is %d years old. She was born in %d."
                            + "Her weight is %.1f and he is %d cm tall. She is a %s with an average grade of %.3f.",
                            firstName, lastName, 2017 - dateOfBirth, dateOfBirth, weight, height, proffesion, average));
                }
            }
        }
    }
}
