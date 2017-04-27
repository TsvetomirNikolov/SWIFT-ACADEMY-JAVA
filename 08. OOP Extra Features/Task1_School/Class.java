package Task1_School;

import java.util.ArrayList;

public class Class {

    Student[] student;
    Teacher[] teacher;

    public Class(Student[] student, Teacher[] teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }
}
