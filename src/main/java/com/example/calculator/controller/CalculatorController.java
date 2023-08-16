package com.example.calculator.controller;

import com.example.calculator.service.CalculatorServicee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServicee calculatorServicee;

    public CalculatorController(CalculatorServicee calculatorServicee) {
        this.calculatorServicee = calculatorServicee;
    }


    @GetMapping
    public String hello() {
        return calculatorServicee.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorServicee.addTwoNum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorServicee.minusTwoNum(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {

        return num1 + " * " + num2 + " = " +  calculatorServicee.multiplyTwoNum(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " +  calculatorServicee.divideTwoNum(num1, num2);
    }
}

