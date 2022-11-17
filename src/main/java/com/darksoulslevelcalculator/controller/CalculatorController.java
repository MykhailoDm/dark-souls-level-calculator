package com.darksoulslevelcalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class CalculatorController {

    @GetMapping
    private String getCalculatorPage() {
        return "index.html";
    }
}
