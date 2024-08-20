package com.hanwhaswcamp.chap02.section07.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class DirectedGraphTest {

    private DirectedGraph<Integer> graph;;

    @BeforeEach
    void setUp() {
        graph = new DirectedGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,5);
        graph.addEdge(2,6);
        graph.addEdge(3,4);
        graph.addEdge(4,6);
        graph.addEdge(7,3);
    }
    /*    1 → 2 → 5
     *     ↓     ↘
     * 7 → 3 → 4 → 6
     * */
    static Stream<Arguments> providerForDfsStack() {
        // 추가 된 값 -> pop된 값 (visited 저장)
        // 1 -> 1
        // 2 3 -> 3
        // 2 4 -> 4
        // 2 6 -> 6
        // 2 -> 2
        // 5 ->  5
        return Stream.of(
                Arguments.arguments(1, Arrays.asList(1, 3, 4, 6, 2, 5))
        );
    }

    @ParameterizedTest
    @MethodSource("providerForDfsStack")
    void testDfsStack(Integer start, List<Integer> expected) {
        List<Integer> result = graph.dfsUsingStack(start);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> providerForDfsRecursive() {
        // 추가 된 값 -> pop된 값 (visited 저장)

        return Stream.of(
                Arguments.arguments(1, Arrays.asList(1, 2, 5, 6, 3, 4))
        );
    }

    @ParameterizedTest
    @MethodSource("providerForDfsRecursive")
    void testDfsRecursive(Integer start, List<Integer> expected) {
        List<Integer> result = graph.dfsUsingRecursion(start);
        Assertions.assertEquals(expected, result);
    }


    static Stream<Arguments> providerForBFS() {
        // 추가 된 값 -> pop된 값 (visited 저장)

        return Stream.of(
                Arguments.arguments(1, Arrays.asList(1, 2, 3, 5, 6, 4))
        );
    }

    @ParameterizedTest
    @MethodSource("providerForBFS")
    void testBFS(Integer start, List<Integer> expected) {
        List<Integer> result = graph.bfsUsingQueue(start);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> providerForBFStest() {
        // 추가 된 값 -> pop된 값 (visited 저장)

        return Stream.of(
                Arguments.arguments(1,3,true ),
                Arguments.arguments(1,7,false )
        );
    }

    @ParameterizedTest
    @MethodSource("providerForBFStest")
    void testhasPath(Integer start, Integer end, boolean expected) {
        boolean result = graph.hasPath(start,end);
        Assertions.assertEquals(expected, result);
    }


    @ParameterizedTest
    @MethodSource("providerForBFStest")
    void testDFShasPath(Integer start, Integer end, boolean expected) {
        boolean result = graph.hasPath(start,end);
        Assertions.assertEquals(expected, result);
    }


    @ParameterizedTest
    @MethodSource("providerForBFStest")
    void testDFSRecursionhasPath(Integer start, Integer end, boolean expected) {
        boolean result = graph.hasPath(start,end);
        Assertions.assertEquals(expected, result);
    }
}