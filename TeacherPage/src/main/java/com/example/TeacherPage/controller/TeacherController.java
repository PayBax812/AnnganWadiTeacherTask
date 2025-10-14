package com.example.TeacherPage.controller;

import com.example.TeacherPage.model.teacher;
import com.example.TeacherPage.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/add")
    public String showAddTeacherForm(Model model) {
        model.addAttribute("teacher", new teacher());
        return "add-teacher";
    }

    @PostMapping("/add")
    public String addTeacher(@ModelAttribute teacher teachernew, Model model) {
        teacherService.saveTeacher(teachernew);
        model.addAttribute("message", "New Teacher Added Successfully!");
        return "index";
    }

    @GetMapping("/list")
    public String listTeachers(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "list-teachers";
    }
}
