package com.example.mappings.service;
import com.example.mappings.entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {

    Teacher addTeacher(Teacher teacher);

}
