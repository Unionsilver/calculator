package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServicee {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public long addTwoNum(long num1, long num2) {
        return num1 + num2;
    }

    @Override
    public long minusTwoNum(long num1, long num2) {
        return num1 - num2;
    }

    @Override
    public long multiplyTwoNum(long num1, long num2) {
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

