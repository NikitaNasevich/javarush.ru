package com.javarush.task.task29.task2909.human;

import javax.management.remote.SubjectDelegationPermission;
import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int age;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        Student studentToReturn = null;

        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) {
                studentToReturn = student;
                break;
            }
        }
        return studentToReturn;
    }

    public Student getStudentWithMaxAverageGrade() {
        if (students.size() > 0) {
            Student studentToReturn = students.get(0);
            double max = studentToReturn.getAverageGrade();

            for (Student student : students) {
                if (student.getAverageGrade() > max) {
                    studentToReturn = student;
                    max = studentToReturn.getAverageGrade();
                }
            }
            return studentToReturn;
        }
        return null;
    }

    public Student getStudentWithMinAverageGrade() {
        Student studentToReturn = students.get(0);

        for (int i = 1; i < students.size() - 1; i++) {
            if (students.get(i).getAverageGrade() < studentToReturn.getAverageGrade()) {
                studentToReturn = students.get(i);
            }
        }
        return studentToReturn;
    }

    public void expel(Student student) {
        students.remove(student);
    }
}