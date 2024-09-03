package com.hanwhaswcamp.chap06.section01.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    static Stream<Arguments> provideSource() {
        return Stream.of(
                Arguments.arguments(10, 55),
                Arguments.arguments(40, 102334155)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSource")
    @DisplayName("기본 피보나치 재귀 함수")
    void testGetFibonacciNumber(int input, int output) {
        Integer result = Fibonacci.getFibonacci(input);
        Assertions.assertEquals(output, result);
    }

    @ParameterizedTest
    @MethodSource("provideSource")
    @DisplayName("DP - TopDown")
    void testGetFibonacciNumberDp(int input, int output) {
        Integer result = Fibonacci.getFibnacciNumberDp(input);
        Assertions.assertEquals(output, result);
    }

    @ParameterizedTest
    @MethodSource("provideSource")
    @DisplayName("DP - BottomUp")
    void testGetFibonacciNumberIter(int input, int output) {
        Integer result = Fibonacci.getFibonacciNumberIter(input);
        Assertions.assertEquals(output, result);
    }
}