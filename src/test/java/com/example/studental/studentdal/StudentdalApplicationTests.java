package com.example.studental.studentdal;

import com.example.studental.studentdal.entity.Student;
import com.example.studental.studentdal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

    @Autowired
    StudentRepository studentRepository;
    public int pem = 3;

    @Test
    public void testCreateStudent(){

        Student student = new Student();
        student.setName("Florian");
        student.setCourse("Java");
        student.setFee(30d);

        studentRepository.save(student);
    }

    @Test
    public void testFindStudentById(){
        studentFind();
    }

    @Test
    public void testUpdateStudent(){
        if(studentFind() == null){
        }else{
            Student student = studentFind();
            student.setName("Sla");
            studentRepository.save(student);
        }
    }

    @Test
    public void testDeleteStudent(){
        if(studentFind() == null){
        }else{
            studentRepository.delete(studentFind());
        }
    }

    public Student studentFind(){
        Optional<Student> studentOptional = studentRepository.findById(1l);
        if(studentOptional.isPresent()){
            Student student = studentOptional.get();
            System.out.println(student);
            return student;
        }else{
            System.out.println("Keinen Student mit dieser ID gefunden");
            return null;
        }


    }

}