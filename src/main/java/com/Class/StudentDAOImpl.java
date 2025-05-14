package com.Class;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    private List<Student> students = new ArrayList<>();


    @Override
    public void saveStudent(Student student) {
        //check if student already exist
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Student with ID " + student.getId() + "ALready exist");

            }
        }
        students.add(student);
        System.out.println("Save Student: " + student.getName());
    }

    @Override
    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return new Student(s.getId(), s.getName(), s.getCourse());
            }
        }
        throw new IllegalArgumentException("Student with ID " + id + " not found.");
    }

    @Override
    public void deleteStudent(int id) {
        Student toRemove = null;
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student deleted: " + toRemove);
        } else {
            System.out.println("No student found with ID " + id);
        }
    }

    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId() == student.getId()) {
                students.set(i, student);
                System.out.println("Updated student: " + student);
                return;
            }
        }
        System.out.println("No student found to update with ID: " + student.getId());
    }

}
