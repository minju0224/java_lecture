package com.hanwhaswcamp.section02.uses.subsection3.terminal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Applicationn3 {
    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 collect에 대해 이해하고 사용할 수 있다. */
        List<Member> memberList = Arrays.asList(
                new Member("test01","홍길동"),
                new Member("test02","유관순"),
                new Member("test03","신사임당")
        );

        List<String> memberNameList = memberList.stream()
//                .map(member -> member.getMemberName())
                .map(Member::getMemberName)
                .collect(Collectors.toList());
//                .toList()

        System.out.println("memberNameList: " + memberNameList);

        String str = memberList.stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining(","));

        System.out.println(str);

        String str1 = memberList.stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining("||","**","**"));
        System.out.println(str1);

        Map<Integer, Long> countByNamelength = memberList.stream()
                .collect(Collectors.groupingBy(m -> m.getMemberName().length(),Collectors.counting()));
        System.out.println(countByNamelength);
    }
}
