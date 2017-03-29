package pkg05.objects.and.classess.Task6_PersonCharacteristics;

import java.util.Arrays;
import java.util.Scanner;

public class Person {

    String firstName;
    String lastName;
    char gender;
    int dateOfBirth;
    double weight;
    double height;
    double[] grades;
    String proffesion;
    double averageGrades;
    String genderSex;
    int currentYears;

    Person(String firstName, String lastName, char gender, int dateOfBirth, double weight, double height, String proffesion, double... grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.height = height;
        this.proffesion = proffesion;
        this.grades = grades;
        this.currentYears = 2017 - this.dateOfBirth;
        this.calculateGrades();
        this.gender();
    }

    private void calculateGrades() {
        double gradesOfStudents = 0.0;
        for (int i = 0; i < grades.length; i++) {
            gradesOfStudents += grades[i];
        }
        averageGrades = gradesOfStudents / grades.length;
    }

    private void gender() {
        if (gender == 'M') {
            genderSex = "He";
        } else if (gender == 'F') {
            genderSex = "She";
        }
    }

    @Override
    public String toString() {
        String endResult = String.format("%s %s is %d years old. %s was born in %d. "
                + "%s weight is %.1f and he is %.0f cm tall. %s is a %s with an average grade of %.3f.",
                firstName,
                lastName,
                currentYears,
                genderSex,
                dateOfBirth,
                genderSex,
                weight,
                height,
                genderSex,
                proffesion,
                averageGrades);
        if (currentYears < 18) {
            endResult += String.format("%s %s is under-aged.\n",
                    firstName,
                    lastName);
        } else {
            endResult += "\n";
        }
        return endResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personCharacteristic = Integer.parseInt(scanner.nextLine());
        Person[] persons = new Person[personCharacteristic];
        for (int i = 0; i < personCharacteristic; i++) {
            String[] inputArr = scanner.nextLine().split(",");
            persons[i] = new Person(
                    inputArr[0].trim(),
                    inputArr[1].trim(),
                    inputArr[2].charAt(0),
                    Integer.parseInt(inputArr[3]),
                    Double.parseDouble(inputArr[4]),
                    Double.parseDouble(inputArr[5]),
                    inputArr[6],
                    Double.parseDouble(inputArr[7]),
                    Double.parseDouble(inputArr[8]),
                    Double.parseDouble(inputArr[9]),
                    Double.parseDouble(inputArr[10]));
            System.out.println(Arrays.toString(persons));
        }
    }
}
