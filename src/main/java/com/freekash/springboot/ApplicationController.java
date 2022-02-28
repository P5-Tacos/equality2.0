package com.freekash.springboot;

import com.freekash.springboot.database.StudentSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.freekash.springboot.database.Student;


import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ApplicationController {
    @Autowired
    private StudentSqlRepository studentSqlRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("students", studentSqlRepository.listAllStudents());
        return "index.html";
    }


    @PostMapping("/students")
    public String playerSave(@Valid Student student, BindingResult bindingResult) {
        // Validation of Decorated PlayerForm attributes
        if (bindingResult.hasErrors()) {
            return "students";
        }
        studentSqlRepository.save(student);
        // Redirect to next step
        return "redirect:/";
    }
}
