package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextController {

    @GetMapping("/")
    String home(Model model){
        model.addAttribute("dangerousCode", "<script>alert('Masz wirusa!');</script>");
        return "index";
    }
}
