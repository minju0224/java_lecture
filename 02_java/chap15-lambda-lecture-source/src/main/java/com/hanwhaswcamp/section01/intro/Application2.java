package com.hanwhaswcamp.section01.intro;

public class Application2 {
    public static void main(String[] args) {
        /* 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다 */
        OuterInterface.Sum sum = (x,y) -> x+y;
        OuterInterface.Minus minus = (x,y) -> x-y;
        OuterInterface.Multuple multuple = (x,y) -> x*y;
        OuterInterface.Divide divide = (x,y) -> x/y;

        System.out.println(sum.sumTwoNumber(20,10));
        System.out.println(minus.minusTwoNumber(20,10));
        System.out.println(multuple.multipleTwoNumber(20,10));
        System.out.println(divide.divideTwoNumber(20,10));
    }
}
