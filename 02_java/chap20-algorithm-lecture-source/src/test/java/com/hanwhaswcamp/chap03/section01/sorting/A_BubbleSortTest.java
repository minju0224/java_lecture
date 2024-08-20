package com.hanwhaswcamp.chap03.section01.sorting;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class A_BubbleSortTest {

    static int[] act1, act2, exp1, exp2;

    @BeforeAll
    static void setUp() {
        act1 = new int[]{34, 23, 5, 24, 1, 9, 12};
        act2 = new int[]{40, 47, 38, 8, 33, 35};
        exp1 = new int[]{1, 5, 9, 12, 23, 24, 34};
        exp2 = new int[]{8, 33, 35, 38, 40, 47};
    }

    static Stream<Arguments> provideAscendingSource() {
        return Stream.of(
                Arguments.of(act1,exp1),
                Arguments.of(act2,exp2)
        );
    }

    @DisplayName("버블 정렬 테스트")
    @ParameterizedTest
    @MethodSource("provideAscendingSource")
    void testbubbleSort(int[] atual, int[] excepted) {
        A_BubbleSort.solution(atual);
        Assertions.assertArrayEquals(excepted, atual);
    }
}