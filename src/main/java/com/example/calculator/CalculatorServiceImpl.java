package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServicee {
    @Override
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public int addTwoNum() {
        int num1 = 5;
        int num2 = 5;
        return num1 + num2;
    }

    @Override
    public int minusTwoNum() {
        int num1 = 5;
        int num2 = 5;
        return num1 - num2;
    }

    @Override
    public int multiplyTwoNum() {
        int num1 = 5;
        int num2 = 5;
        return num1 * num2;
    }

    @Override
    public int divideTwoNum() {
        int num1 = 5;
        int num2 = 5;
        if (num1 == 0 || num2 == 0)
           throw new IllegalArgumentException("На ноль делить нельзя");
        return num1 / num2;
    }
}

