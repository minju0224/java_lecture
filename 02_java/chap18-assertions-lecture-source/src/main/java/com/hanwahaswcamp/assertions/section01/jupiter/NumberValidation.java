package com.hanwahaswcamp.assertions.section01.jupiter;

public class NumberValidation {
    public void checkDividableNumber(int firstNumber, int secondNumber) {
        if(secondNumber == 0) throw new IllegalArgumentException("0으로 나눌 수 없음");
    }
}
