package com.hanwhaswcamp.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {
    public static void main(String[] args) {
        /* 스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다
        * 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어 준다 => 플래트닝(flatting)*/
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA","SPRING","SPRINGBOOT"),
                Arrays.asList("java","spring","springboot")
        );

        System.out.println(list);

        List<String> flatList = list.stream() // List<List<String>>  스트림 화
                .flatMap(Collection::stream) // Stream<String>  중첩 구조 풀림
                .collect(Collectors.toList()); // 다시 list의 형태로 바꿈

        System.out.println(flatList);


        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Stream API",
                "flatMap Example"
        );
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // 각줄마다 split, stream화 하고 전체를 다시 stream화 함
                .collect(Collectors.toList());
//              .toList();
        /* toList() : 읽기 전용, 추후 수정 불가*/

        words.add("단어 추가");
        System.out.println(words);

        /* Unmodifiable list (수정 불가 읽기 전용 리스트 -> 불변성 보장) */
        List<String> unmodifiableList = Collections.unmodifiableList(flatList);
        List<String> unmodifiableList2 = List.of("a", "b", "c");
        List<String> unmodifiableList3 = Stream.of("a", "b", "c").toList();
    }
}
