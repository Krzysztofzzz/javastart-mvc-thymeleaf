package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExampleController {

    @GetMapping("/")
    String example(Model model){
        List<Person> people = List.of(
                new Person("Jan", "Kowalski"),
                new Person("Piotr", "Zalewski"),
                new Person("Anna", "Nowak"),
                new Person("Marta", "Cybulska")
        );
        model.addAttribute("size", 5);
        model.addAttribute("people", people);
        return "example";
    }
}
