package com.Class;

public interface StudentDAO {
    void saveStudent(Student student);
    Student findStudentById(int id);
    void deleteStudent(int id);
    void updateStudent(Student student);
}
