package com.Class;

public class StudentDAOTest {
    public static void main(String[] args) {
        //create a DAO object
        StudentDAO studentDAO = new StudentDAOImpl();

        //create a student object
        Student student = new Student(101, "Agnes", "java");
        Student student1 = new Student(102, "Nazie", "Python");

        //save student
        studentDAO.saveStudent(student);
        studentDAO.saveStudent(student1);

        //find student
        Student findStudent = studentDAO.findStudentById(101);
        System.out.println("Find student :" + findStudent);

        //delete student
        studentDAO.deleteStudent(101);

        //update student
        studentDAO.updateStudent(new Student(102, "Nazie", "code"));

    }
}
