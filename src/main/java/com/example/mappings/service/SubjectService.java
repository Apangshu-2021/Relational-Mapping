package com.example.mappings.service;

import com.example.mappings.entity.Subject;
import org.springframework.stereotype.Service;

@Service
public interface SubjectService {

    Subject addSubject(Subject subject);

    Subject addStudentToSubject(Long subjectId, Long studentId);

    Subject addTeacherToSubject(Long subjectId, Long teacherId);
}
