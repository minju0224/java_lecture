package com.hanwhaswcamp.section02;

public class assignment {
    public static void main(String[] args) {
        /* 대입 연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다*/

        int num = 12;

        // 3 증가
        num = num +3;

        //  3 증가 산술 복합 대입 연산자
        num += 3;

        num -= 5;
        num *= 2;
        num /= 2;
        num %= 2;

        System.out.println(num);
    }
}
