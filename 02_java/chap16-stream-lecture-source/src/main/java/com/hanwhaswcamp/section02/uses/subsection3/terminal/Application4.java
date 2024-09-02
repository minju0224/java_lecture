package com.hanwhaswcamp.section02.uses.subsection3.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /* 최종 연산 중 하나인 match에 대해 이해하고 사용하 수 있다 */
        List<String> stringList = Arrays.asList("Java","Spring","SpringBoot");

        boolean anyMatch = stringList.stream().anyMatch(str -> str.contains("p"));
        boolean allMatch = stringList.stream().allMatch(str -> str.length()>3);
        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("c"));

        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);
    }
}
