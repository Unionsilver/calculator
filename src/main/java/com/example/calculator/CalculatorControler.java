package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorControler {
    private final CalculatorServicee calculatorServicee;

    public CalculatorControler(CalculatorServicee calculatorServicee) {
        this.calculatorServicee = calculatorServicee;
    }


    @GetMapping
    public String hello() {
        return calculatorServicee.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServicee.addTwoNum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServicee.minusTwoNum(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {

        return calculatorServicee.multiplyTwoNum(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "На ноль  делить нельзя";
        }
        return calculatorServicee.divideTwoNum(num1, num2);
    }
}

