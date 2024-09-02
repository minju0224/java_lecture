package com.hanwhaswcamp.section02.uses.subsection02.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        /* 스트림의 중계 연산 중 sorted에 대해 이해하고 사용할 수 있다 */

        List<Integer> integerList = IntStream.of(5,10,99,2,1,35)
                .boxed()
                .sorted((a,b)->b-a)
                .toList();

        /* boxed() : IntStream을 Stream<Integer>로 변경
        * sorted() : 함수메소드이므로 compare에 람다식으로 값을 보내 내림차순으로 변경 가능 */
        System.out.println(integerList);
    }
}
