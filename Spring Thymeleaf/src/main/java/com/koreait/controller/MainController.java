package com.koreait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/view1112_1")
    public void get_view1112_1(Model model){
        model.addAttribute("text", "This is Server Text");
        model.addAttribute("welcome", "<b>Welcome thymeleaf!</b>");
    }




}
