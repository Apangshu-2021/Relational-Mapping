package com.example.mappings.serviceImpl;

import com.example.mappings.entity.Student;
import com.example.mappings.repository.StudentRepository;
import com.example.mappings.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);

        return "Student deleted successfully";
    }
}
