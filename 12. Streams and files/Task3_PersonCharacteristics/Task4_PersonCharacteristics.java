package Task4_PersonCharacteristics;

import Education.Education;
import Education.PrimaryEducation;
import Education.HigherEducation;
import Education.SecondaryEducation;
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
            Address address = new Address(
                    arrayInput[6],
                    arrayInput[7],
                    arrayInput[8],
                    Integer.parseInt(arrayInput[9]),
                    arrayInput[10],
                    arrayInput[11],
                    arrayInput[12],
                    arrayInput[13]);

            Education education = educationInfo.gradesOfEducation(arrayInput);
            educationInfo._person[i] = new Person(arrayInput[0],
                    arrayInput[1],
                    arrayInput[2],
                    arrayInput[3].charAt(0),
                    LocalDate.parse(arrayInput[4], educationInfo._formatter),
                    Double.parseDouble(arrayInput[5]), address, education);
            System.out.println(educationInfo._person[i].toString());
        }
    }

    private Education gradesOfEducation(String[] education) {
        switch (education[14].charAt(0)) {
            case 'P':
                return new PrimaryEducation(education[15],
                        LocalDate.parse(education[16], _formatter),
                        LocalDate.parse(education[17], _formatter), "primary");
            case 'S':
                return new SecondaryEducation(education[15],
                        LocalDate.parse(education[16], _formatter),
                        LocalDate.parse(education[17], _formatter),
                        "secondary",
                        education.length == 19 ? Double.parseDouble(education[18]) : -1); // Ternary operator take from your previous solutions.
            case 'B':
                return new HigherEducation(education[15],
                        LocalDate.parse(education[16], _formatter),
                        LocalDate.parse(education[17], _formatter),
                        "bachelor",
                        education.length == 14 ? Double.parseDouble(education[18]) : -1);
            case 'M':
                return new HigherEducation(education[15],
                        LocalDate.parse(education[16], _formatter),
                        LocalDate.parse(education[17], _formatter),
                        "master",
                        education.length == 19 ? Double.parseDouble(education[18]) : -1);
            case 'D':
                return new HigherEducation(education[15],
                        LocalDate.parse(education[16], _formatter),
                        LocalDate.parse(education[17], _formatter),,
                         education.length == 19 ? Double.parseDouble(education[18]) : -1);
        }
        throw new IllegalArgumentException("Unrecognized education code.");
    }
}
