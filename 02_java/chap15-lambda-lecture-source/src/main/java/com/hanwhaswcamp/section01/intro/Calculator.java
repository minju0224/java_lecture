package com.hanwhaswcamp.section01.intro;
/* 내우베 하나의 추산 메소드가 선언 된 인터ㅓ페이스만 람다식의 타깃이 될 수 있다.
* => 함수적 인터페이스(Function Interface)라고 하며 어노테이션으로 체크할 수 있다 */
@FunctionalInterface
public interface Calculator {
    int sumTwoNumbers(int a, int b);
//    int minusTwoNumbers(int a, int b);
}
