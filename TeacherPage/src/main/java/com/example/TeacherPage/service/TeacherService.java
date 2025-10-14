package com.example.TeacherPage.service;

import com.example.TeacherPage.model.teacher;
import com.example.TeacherPage.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public teacher saveTeacher(teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
}
