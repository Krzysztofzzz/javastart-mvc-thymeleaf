package com.example.controllers;

import com.example.services.VatCalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VatController {

    private final VatCalculatorService vatService;

    public VatController(VatCalculatorService vatService) {
        this.vatService = vatService;
    }

    @PostMapping("/calculate")
    String calculate(double nettoPrice, String category, Model model) {
        double vat = vatService.calculateVat(nettoPrice, category);
        double bruttoPrice = vatService.calculateBruttoPrice(nettoPrice, category);
        model.addAttribute("nettoPrice", nettoPrice);
        model.addAttribute("bruttoPrice", bruttoPrice);
        model.addAttribute("vat", vat);
        return "result";
    }
}
