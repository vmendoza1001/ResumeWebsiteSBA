package com.example.Resume;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeController {

    @Value("${spring.application.name}")
    String Resume;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("appName", Resume);
        return "home";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping("/experience")
    public String experience(Model model) {
        return "experience";
    }
}
