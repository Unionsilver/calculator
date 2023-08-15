package com.example.calculator.service;

import com.example.calculator.service.CalculatorServicee;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServicee {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int addTwoNum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minusTwoNum(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplyTwoNum(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divideTwoNum(int num1 , int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("на ноль делить нельзя");
        }
        return (double) num1 / num2;
    }
}

