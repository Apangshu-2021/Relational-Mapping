package com.example.mappings.serviceImpl;

import com.example.mappings.entity.Student;
import com.example.mappings.entity.Subject;
import com.example.mappings.entity.Teacher;
import com.example.mappings.repository.StudentRepository;
import com.example.mappings.repository.SubjectRepository;
import com.example.mappings.repository.TeacherRepository;
import com.example.mappings.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;

    @Override
    public Subject addSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject addStudentToSubject(Long subjectId, Long studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow();
        Subject subject = subjectRepository.findById(subjectId).orElseThrow();

        subject.getEnrolledStudents().add(student);
        return subjectRepository.save(subject);
    }

    @Override
    public Subject addTeacherToSubject(Long subjectId, Long teacherId) {
        Teacher teacher = teacherRepository.findById(teacherId).orElseThrow();
        Subject subject = subjectRepository.findById(subjectId).orElseThrow();

        subject.setTeacher(teacher);
        return subjectRepository.save(subject);
    }
}
