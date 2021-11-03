package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService{

    private final List<Student> studentList = new ArrayList<>();
    public StudentServiceImpl(){
        addStudents();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);
    }

    @Override
    public Map<Integer, Student> all() {
        return null;
    }

    @Override
    public Student findById(String id) {
        return studentList.get(Integer.parseInt(id));
    }

    private void addStudents(){
        studentList.add(new Student("1",1,"Denisse","Gonzalez",0));
        studentList.add(new Student("2",2,"Corinne","Crowford",1));
        studentList.add(new Student("3",3,"Pedrito","Sola",2));
    }
}
