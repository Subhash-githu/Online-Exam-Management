package com.exam.onlineexamsystem.controller;

import com.exam.onlineexamsystem.dto.StudentAnswerRequest;
import com.exam.onlineexamsystem.entity.StudentArray;
import com.exam.onlineexamsystem.service.StudentArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentanswers")
public class StudentArrayController {

    @Autowired
    private StudentArrayService studentArrayService;

    @PostMapping
    public StudentArray saveStudentAnswer(@RequestBody StudentAnswerRequest request) {
        return studentArrayService.saveStudentAnswer(
                request.getStudentId(),
                request.getQuestionId(),
                request.getSelectedAnswer()
        );
    }

    @GetMapping
    public List<StudentArray> getAllStudentAnswers() {
        return studentArrayService.getAllStudentAnswers();
    }

    @GetMapping("/{id}")
    public Optional<StudentArray> getStudentAnswerById(@PathVariable Long id) {
        return studentArrayService.getStudentAnswerById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentAnswer(@PathVariable Long id) {
        studentArrayService.deleteStudentAnswer(id);
        return "Student answer deleted successfully";
    }
}