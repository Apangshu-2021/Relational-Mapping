package com.example.mappings.serviceImpl;

import com.example.mappings.entity.Teacher;
import com.example.mappings.repository.TeacherRepository;
import com.example.mappings.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Teacher addTeacher(Teacher teacher) {
       return teacherRepository.save(teacher);
    }
}
