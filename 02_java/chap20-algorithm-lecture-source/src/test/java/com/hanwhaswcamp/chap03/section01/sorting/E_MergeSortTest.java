package com.hanwhaswcamp.chap03.section01.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class E_MergeSortTest {

    static int[] act1, act2, exp1, exp2;

    @BeforeAll
    static void setUp() {
        act1 = new int[]{7,25,33,8,12,5,29,31};
        exp1 = new int[]{5,7,8,12,25,29,31,33};
        act2 = new int[]{46,13,14,23,28,31,32,17,3};
        exp2 = new int[]{3,13,14,17,23,28,31,32,46};
    }

    static Stream<Arguments> provideAscendingSource() {
        return Stream.of(
                Arguments.of(act1,exp1),
                Arguments.of(act2,exp2)
        );
    }

    @DisplayName("병합 정렬 테스트")
    @ParameterizedTest
    @MethodSource("provideAscendingSource")
    void testSelectionSort(int[] actual, int[] excepted) {
        E_MergeSort.solution(actual);
        Assertions.assertArrayEquals(excepted, actual);
    }
}