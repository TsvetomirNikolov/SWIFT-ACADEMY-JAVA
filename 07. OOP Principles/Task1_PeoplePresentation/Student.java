
public class Student extends Person {

    private String _facultyNumber;
    private int _lectureCount;
    private int _exerciseCount;

    public Student(String firstName, String lastName, String facultyNumber, int lectureCount, int exerciseCount) {
        super(firstName, lastName);
        this._facultyNumber = facultyNumber;
        this._lectureCount = lectureCount;
        this._exerciseCount = exerciseCount;
    }

    void setFacultyNumber(String facultyN) {
        if (facultyN.length() < 5 || facultyN.length() > 10) {
            System.out.println("Expected length for faculty number is between 5 and 10 symbols.");
        } else {
            this._facultyNumber = facultyN;
        }
    }

    private void setLectureCount(int lectureC) {
        if (lectureC < 0) {
            System.out.println("Expected positive number for lecture.");
        } else if (lectureC % 1 != 0) {
            System.out.println("Expected integer for lecture.");
        } else {
            this._lectureCount = lectureC;
        }
    }

    void setExerciseCount(int exerciseC) {
        if (exerciseC < 0) {
            System.out.println("Expected positive number for exercise.");
        } else if (exerciseC % 1 != 0) {
            System.out.println("Expected integer for exercise.");
        } else {
            this._exerciseCount = exerciseC;
        }
    }

    String getFacultyNumber() {
        return this._facultyNumber;
    }

    int getLectureCount() {
        return this._lectureCount;
    }

    int getExerciseCount() {
        return this._exerciseCount;
    }

    void printInfo() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Occupation: Student");
        System.out.println("Faculty number: " + getFacultyNumber());
        System.out.printf("Hours per day: %.2f \n", (getLectureCount() * 2 + getExerciseCount() * 1.5) / 5.0);
    }
}
