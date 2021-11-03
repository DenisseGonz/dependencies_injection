package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImplMap implements StudentService{

    final Map<Integer, Student> studentMap = new HashMap<>();
    public StudentServiceImplMap(){
        addStudents();
        System.out.println("Estoy usando el hashmap wuuu");
    }

    @Override
    public void add(Student student) {
        studentMap.put(Integer.parseInt(student.getIdStudent()), student);
    }

    @Override
    public void delete(Student student) {
        studentMap.remove(Integer.parseInt(student.getIdStudent()));
    }

    @Override
    public Map<Integer, Student> all() {
        return studentMap;
    }

    @Override
    public Student findById(String id) {
        return studentMap.get(Integer.parseInt(id));
    }

    private void addStudents(){
        studentMap.put(1,new Student("1",1,"Denisse","Gonzalez",0));
        studentMap.put(2,new Student("2",2,"Corinne","Crowford",1));
        studentMap.put(3,new Student("3",3,"Pedrito","Sola",2));
    }
}
