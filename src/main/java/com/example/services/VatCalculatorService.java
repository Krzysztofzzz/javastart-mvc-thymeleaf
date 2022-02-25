package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class VatCalculatorService {

    public double calculateBruttoPrice(double nettoPrice, String category) {
        return nettoPrice + calculateVat(nettoPrice, category);
    }

    private double calculateVat(double nettoPrice, String category) {
        double vatRate = switch (category) {
            case "service" -> 0.23;
            case "food" -> 0.05;
            default -> 0.15;
        };
        return nettoPrice * vatRate;
    }


}
