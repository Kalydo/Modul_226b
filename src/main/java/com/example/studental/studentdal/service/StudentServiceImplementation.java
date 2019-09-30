package com.example.studental.studentdal.service;

import com.example.studental.studentdal.entity.Student;
import com.example.studental.studentdal.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class StudentServiceImplementation implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(Long id){
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }

    @Override
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

}
