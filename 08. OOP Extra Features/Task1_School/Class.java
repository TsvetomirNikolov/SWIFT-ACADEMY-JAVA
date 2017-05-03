package Task1_School;

import java.util.ArrayList;

public class Class {

    private Student[] _students;
    private Teacher[] _teacher;

    public Class(Student[] student, Teacher[] teacher) {
        this._students = student;
        this._teacher = teacher;
    }

    public void setStudents(Student[] student) {
        this._students = student;
    }

    public void setTeacher(Teacher[] teacher) {
        this._teacher = teacher;
    }

    public Student[] getStudent() {
        return _students;
    }

    public Teacher[] getTeacher() {
        return _teacher;
    }
}
