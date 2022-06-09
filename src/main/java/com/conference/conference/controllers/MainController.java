package com.conference.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "main page");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "about page");
        return "about";
    }

//    @GetMapping("/login")
//    public String login(Model model) {
//        model.addAttribute("title", "login");
//        return "login";
//    }
}