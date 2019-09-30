package com.example.studental.studentdal.service;

import com.example.studental.studentdal.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudent(Long id);
    void deleteStudent(Student student);
    List<Student> getAllStudent();

}
