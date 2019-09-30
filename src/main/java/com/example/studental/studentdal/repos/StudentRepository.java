package com.example.studental.studentdal.repos;

import com.example.studental.studentdal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
