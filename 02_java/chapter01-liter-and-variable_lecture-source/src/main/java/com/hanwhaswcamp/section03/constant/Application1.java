package com.hanwhaswcamp.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        // 상수 선언
        final int AGE;
        AGE = 18;
        // AGE = 19;       // Variable 'age' might already have been assigned to

        // 상수의 명명 규칙
        final int age; // 소문자로 작성해도 컴파일 오류는 없느나 대문자가 규칙

        // 합성어의 경우 언더스코어로 네이밍
        final int MAX_AGE = 40;
        final int MIN_AGE = 0;
    }
}
