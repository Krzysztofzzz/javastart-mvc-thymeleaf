package com.example.services;

import com.example.dto.VatDto;
import org.springframework.stereotype.Service;

@Service
public class VatCalculatorService {

    public VatDto calculateVat(double nettoPrice, String category) {
        double vat = calculateVatAmount(nettoPrice, category);
        double bruttoPrice = nettoPrice + vat;
        return new VatDto(nettoPrice,vat,bruttoPrice);
    }

    private double calculateVatAmount(double nettoPrice, String category) {
        double vatRate = switch (category) {
            case "service" -> 0.23;
            case "food" -> 0.05;
            default -> 0.15;
        };
        return nettoPrice * vatRate;
    }


}
