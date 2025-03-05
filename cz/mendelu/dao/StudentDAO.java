package cz.mendelu.dao;

import cz.mendelu.dao.domain.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getStudents();
    Student getStudentById(int id);
    void save(Student student);
    void delete(Student student);
}