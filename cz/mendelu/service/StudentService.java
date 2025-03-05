package cz.mendelu.service;

import cz.mendelu.dao.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    void save(Student student);
    void delete(Student student);
}