package cz.mendelu;

import cz.mendelu.dao.StudentDAO;
import cz.mendelu.dao.StudentDAOImpl;
import cz.mendelu.dao.domain.Student;
import cz.mendelu.service.StudentService;
import cz.mendelu.service.StudentServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO=new StudentDAOImpl();
        StudentService studentService=new StudentServiceImpl(studentDAO);

        System.out.println(studentService.getAllStudents());
        System.out.println(studentService.getStudentById(2).getName());
        studentService.save(new Student("Thomas"));
        System.out.println(studentService.getAllStudents());


    }
}