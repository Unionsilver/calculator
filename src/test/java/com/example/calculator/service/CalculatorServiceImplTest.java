package com.example.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorServiceImplTest {

CalculatorServicee underTest = new CalculatorServiceImpl();
    @Test
    void hello__WelcomeString() {
        String result = underTest.hello();
        assertEquals("Добро пожаловать в калькулятор", result);
    }

    @Test
    void add_num1PlusNum2_integerResult() {
        int result = underTest.addTwoNum(2, 2);
        assertEquals(4,result);
    }
    @Test
    void add_num1PlusNum2_integerResult2() {
        int result = underTest.addTwoNum(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(-2,result);
    }
    @Test
    void add_num1PlusNum2_integerResult3() {
        int result = underTest.addTwoNum(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertEquals(-1,result);
    }

    @Test
    void minus_num1MinusNum2_integerResult() {
        int result = underTest.minusTwoNum(4, 2);
        assertEquals(2,result);
    }
    @Test
    void minus_num1MinusNum2_integerResult2() {
        int result = underTest.minusTwoNum(4, 6);
        assertEquals(-2,result);
    }
    @Test
    void minus_num1MinusNum2_integerResult3() {
        int result = underTest.minusTwoNum(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(0,result);
    }
    @Test
    void minus_num1MinusNum2_integerResult4() {
        int result = underTest.minusTwoNum(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(1,result);
    }

    @Test
    void multiply_num1MultiplyNum2_integerResult() {
        int result = underTest.multiplyTwoNum(2, 2);
        assertEquals(4,result);
    }
    @Test
    void multiply_num1MultiplyNum2_integerResult2() {
        int result = underTest.multiplyTwoNum(2, 2);
        assertEquals(4,result);
    }

    @Test
    void divide_num1DividedNum2_integerResultWithoutFraction() {
        double result = underTest.divideTwoNum(6, 3);
        assertEquals(2,result);
    }
    @Test
    void divide_num1DividedNum2_integerResultWithFraction2() {
        double result = underTest.divideTwoNum(10, 9);
        assertEquals(1.1111111111111112, result);
    }
    @Test
    void divide_num2IsNull_throwIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,() -> underTest.divideTwoNum(1,0));
    }
    @ParameterizedTest
    @MethodSource("dataForDivide")
    void divide__returnDouble(int num1, int num2 , double expectedResult){
        double result = underTest.divideTwoNum(num1, num2);
        assertEquals(expectedResult, result);

    }
    private Stream<Arguments> dataForDivide (){
        return  Stream.of(
                Arguments.of(6,3,2),
                Arguments.of(10,9,1.1111111111111112)
        );
    }
}