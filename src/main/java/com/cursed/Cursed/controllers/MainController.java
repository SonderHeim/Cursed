package com.cursed.Cursed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/home")
    public String MainPage(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/auth")
    public String Auth(Model model) {
        model.addAttribute("title", "Главная страница");
        return "auth";
    }
    @GetMapping("/WR")
    public String WR(Model model) {
        model.addAttribute("title", "Главная страница");
        return "WR";
    }
    @GetMapping("/RR")
    public String RR(Model model) {
        model.addAttribute("title", "Главная страница");
        return "RR";
    }
    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("title", "Главная страница");
        return "reg";
    }
}