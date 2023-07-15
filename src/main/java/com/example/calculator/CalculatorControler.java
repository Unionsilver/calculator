package com.example.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorControler {
    private final CalculatorServicee calculatorServicee;

    public CalculatorControler(CalculatorServicee calculatorServicee) {
        this.calculatorServicee = calculatorServicee;
    }


    @RequestMapping("/calculator")
    public String hello() {
        return calculatorServicee.hello();
    }

    @RequestMapping(path = "/calculator/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "+" + num2 + "=" + calculatorServicee.addTwoNum();
    }

    @RequestMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "-" + num2 + "=" + calculatorServicee.minusTwoNum();
    }

    @RequestMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {

        return num1 + "*" + num2 + "=" + calculatorServicee.multiplyTwoNum();
    }

    @RequestMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "/" + num2 + "=" + calculatorServicee.divideTwoNum();
    }
}
