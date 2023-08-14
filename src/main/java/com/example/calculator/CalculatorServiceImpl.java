package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServicee {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String addTwoNum(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + sum ;
    }

    @Override
    public String minusTwoNum(int num1, int num2) {
        int sum = num1 - num2;
        return num1 + "-" + num2 + "=" + sum ;
    }

    @Override
    public String multiplyTwoNum(int num1, int num2) {
        int sum = num1 * num2;
        return num1 + "*" + num2 + "=" + sum ;
    }

    @Override
    public String divideTwoNum(int num1 , int num2) {
        double sum = (double) num1 / num2;
        return num1 + "/" + num2 + "=" + sum;
    }
}

