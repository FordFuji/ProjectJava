package main;

import model.Student;
import dao.StudentDAO; 

public class Main {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        Student s = new Student("สมชาย", 20);

        dao.addStudent(s);

        dao.showStudent();

        dao.updateStudent(1,25);

        dao.deleteStudent(2);
    }
}
