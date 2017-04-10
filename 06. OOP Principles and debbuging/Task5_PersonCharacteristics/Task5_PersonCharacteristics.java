package Task5_PersonCharacteristics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task5_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputPersons = Integer.parseInt(scanner.nextLine());
        Person[] persons = new Person[inputPersons];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        SecondaryEducation education = null;
        for (int i = 0; i < inputPersons; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(";");
            switch (inputArr.length) {
                case 8:
                    education = new SecondaryEducation(
                            inputArr[5],
                            LocalDate.parse(inputArr[6], formatter),
                            LocalDate.parse(inputArr[7], formatter));
                    break;
                case 9:
                    education = new SecondaryEducation(
                            inputArr[5],
                            LocalDate.parse(inputArr[6], formatter),
                            LocalDate.parse(inputArr[7], formatter),
                            Double.parseDouble(inputArr[8]));
                    break;
            }
            persons[i] = new Person(
                    inputArr[0],
                    inputArr[1],
                    inputArr[2].charAt(0),
                    Double.parseDouble(inputArr[3]),
                    LocalDate.parse(inputArr[4], formatter),
                    education);
            System.out.print(persons[i].toString());
        }
    }
}
