package com.example.mappings.controller;

import com.example.mappings.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mappings.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/add")
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }

    @PutMapping("/{subjectId}/student/{studentId}")
    public Subject addStudentToSubject(@PathVariable Long subjectId, @PathVariable Long studentId) {
        return subjectService.addStudentToSubject(subjectId, studentId);
    }

    @PutMapping("/{subjectId}/teacher/{teacherId}")
    public Subject addTeacherToSubject(@PathVariable Long subjectId, @PathVariable Long teacherId) {
        return subjectService.addTeacherToSubject(subjectId, teacherId);
    }
}
