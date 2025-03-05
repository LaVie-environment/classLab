package cz.mendelu.dao;

import cz.mendelu.dao.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    private List<Student> students=new ArrayList<>();

    public StudentDAOImpl(){
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Jane"));
        students.add(new Student(3, "Jack"));


    }

    public List<Student> getStudents(){

        return students;
    }

    public Student getStudentById(int id){
        for(int i=0;i< students.size();i=i+1){
            if(students.get(i).getId()==id){
                return students.get(i);
            }

        }
        return null;
        // return new Student(1, "John");
    }

    public void save(Student student){
        student.setId(students.size()+1);
        students.add(student);
    }

    public void delete(Student student){
        students.remove(student);

    }
}