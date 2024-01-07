package com.example.mappings.service;

import com.example.mappings.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

     Student addStudent(Student student);

     String deleteStudent(Long id);
}
