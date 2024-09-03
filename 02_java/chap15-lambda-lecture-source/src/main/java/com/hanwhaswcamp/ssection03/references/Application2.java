package com.hanwhaswcamp.ssection03.references;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        /* 생성자 메소드 참조를 이해하고 상요할 수 있다 */
        Function<String, Member> function = Member::new;
        Member member1 = function.apply("user01");
        Member member2 = function.apply("user02");
        System.out.println(member1);
        System.out.println(member2);
    }
}
