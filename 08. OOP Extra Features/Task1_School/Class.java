package Task1_School;

import java.util.ArrayList;

public class Class {

    private Student[] _students;
    private Teacher[] _teachers;

    public Class(Student[] students, Teacher[] teachers) {
        this._students = students;
        this._teachers = teachers;
    }

    public void setStudents(Student[] student) {
        this._students = student;
    }

    public void setTeachers(Teacher[] teacher) {
        this._teachers = teacher;
    }

    public Student[] getStudents() {
        return _students;
    }

    public Teacher[] getTeachers() {
        return _teachers;
    }
}
