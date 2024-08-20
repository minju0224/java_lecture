package com.hanwhaswcamp.chap02.section06.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/* 절댓값 힙 - 백준 (11286) */
class Practice1Test {

    private Practice1 practice1;

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(
                        new Integer[]{1,-1,0,0,0,1,1,-1,-1,2,-2,0,0,0,0,0,0,0},
                        "-1 1 0 -1 -1 1 1 -2 2 0"
                )
        );
    }

    @BeforeEach
    void setUp() {
        practice1 = new Practice1();
    }


    @DisplayName("절댓값 힙 테스트")
    @ParameterizedTest
    @MethodSource("provideSource")
    public void testSolution(Integer[] input, String output)  {
        String result = practice1.solution(input);
        Assertions.assertEquals(output, result);
    }
}