package cz.mendelu.service;

import cz.mendelu.dao.StudentDAO;
import cz.mendelu.dao.StudentDAOImpl;
import cz.mendelu.dao.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentDAO studentDAO;

    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public List<Student> getAllStudents() {
        return studentDAO.getStudents();
    }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public void save(Student student) {
    studentDAO.save(student);
    }

    @Override
    public void delete(Student student) {
        studentDAO.delete(student);

    }
}
