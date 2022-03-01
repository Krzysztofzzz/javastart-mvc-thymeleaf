package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextController {

    @GetMapping("/")
    String home(Model model){
        model.addAttribute("firstName", "Jan");
        model.addAttribute("lastName", "Dołek");
        return "index";
    }
}
