package Task4_PersonCharacteristics;

import Task4_PersonCharacteristics.Education.Education;
import Task4_PersonCharacteristics.Education.PrimaryEducation;
import Task4_PersonCharacteristics.Education.HigherEducation;
import Task4_PersonCharacteristics.Education.SecondaryEducation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task4_PersonCharacteristics {

    private DateTimeFormatter _formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
    private Person[] _person;

    public Task4_PersonCharacteristics(int number) {
        _person = new Person[number];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Task4_PersonCharacteristics educationInfo = new Task4_PersonCharacteristics(input);
        for (int i = 0; i < input; i++) {
            String information = scanner.nextLine();
            String[] arrayInput = information.split(";");
            Education education = educationInfo.gradesOfEducation(arrayInput);
            educationInfo._person[i] = new Person(arrayInput[0],
                    arrayInput[1],
                    arrayInput[2].charAt(0),
                    Double.parseDouble(arrayInput[3]),
                    LocalDate.parse(arrayInput[4], educationInfo._formatter), education);
            System.out.println(educationInfo._person[i].toString());
        }
    }

    private Education gradesOfEducation(String[] education) {
        switch (education[5].charAt(0)) {
            case 'P':
                return new PrimaryEducation(education[6],
                        LocalDate.parse(education[7], _formatter),
                        LocalDate.parse(education[8], _formatter), "Primary");
            case 'S':
                return new SecondaryEducation(education[6],
                        LocalDate.parse(education[7], _formatter),
                        LocalDate.parse(education[8], _formatter),
                        "Secondary",
                        education.length == 10 ? Double.parseDouble(education[9]) : -1); // Ternary operator take from your previous solutions.
            case 'B':
                return new HigherEducation(education[6],
                        LocalDate.parse(education[7], _formatter),
                        LocalDate.parse(education[8], _formatter),
                        "Bachelor",
                        education.length == 10 ? Double.parseDouble(education[9]) : -1);
            case 'M':
                return new HigherEducation(education[6],
                        LocalDate.parse(education[7], _formatter),
                        LocalDate.parse(education[8], _formatter),
                        "Master",
                        education.length == 10 ? Double.parseDouble(education[9]) : -1);
            case 'D':
                return new HigherEducation(education[6],
                        LocalDate.parse(education[7], _formatter),
                        LocalDate.parse(education[8], _formatter),
                        "Doctorate",
                        education.length == 10 ? Double.parseDouble(education[9]) : -1);
        }
        return null;
    }
}
