package pl.basetest.basetestapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam")
public class ExamController {
    @GetMapping
    public ResponseEntity<String> getExam() {
        String response = "Response";
        return ResponseEntity.ok().body(response);
    }
}
