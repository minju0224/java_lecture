package com.hanwhaswcamp.section02.uses.subsection3.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 calculating에 대해 이해하고 사용할 수 있다 */
        long count = IntStream.rangeClosed(1,10).count();
        long sum = IntStream.rangeClosed(1,10).sum();

        System.out.println("sum = " + sum);
        System.out.println("count = " + count);

        /* 결과 없음을 나타내는 명확한 요구가 있는  메소드의 반환 형식으로는 OpionalInt 사용 */
        OptionalInt max = IntStream.rangeClosed(1,10).max();
        OptionalInt min = IntStream.rangeClosed(1,10).min();

        System.out.println("max = " + max);
        System.out.println("max = " + max.getAsInt());
        System.out.println("min = " + min);
        System.out.println("min = " + min.getAsInt());

        /* 중간 연산 이후 최종 연산을 수행 */
        int oddSum = IntStream.rangeClosed(1,10)
                .filter(i -> i%2==1)
                .sum();
        System.out.println("OddSum = " + oddSum);
    }
}
