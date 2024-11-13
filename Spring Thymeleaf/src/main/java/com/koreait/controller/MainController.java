package com.koreait.controller;

import com.koreait.dto.Computer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/view1112_1")
    public void get_view1112_1(Model model){
        model.addAttribute("text", "This is Server Text");
        model.addAttribute("welcome", "<b>Welcome thymeleaf!</b>");
    }

    @GetMapping("/view1112_2")
    public void get_view1112_2(Model model){
        int[] numbers = new int[]{10,20,30,40};
        List<String> strings = List.of("A", "B", "C", "D", "E", "F", "G");
        model.addAttribute("numbers", numbers);
        model.addAttribute("strings", strings);
    }

    @GetMapping("/view1112_3")
    public void get_view1112_3(Model model){
        Computer computer = new Computer("com-1", 5000000, LocalDateTime.now());
        model.addAttribute("computer", computer);

    }
    @GetMapping("/view1112_4")
    public void get_view1112_4(
            Model model,
            Computer computer
    ){
        model.addAttribute("data", "This is Model data");
        System.out.println(computer);
    }

    @GetMapping("/view1113_1")
    public void get_view1113_1(){}

    @GetMapping("/view1113_2")
    public void get_view1113_2(){}

    @GetMapping("/view1113_3")
    public void get_view1113_3(){}


}
