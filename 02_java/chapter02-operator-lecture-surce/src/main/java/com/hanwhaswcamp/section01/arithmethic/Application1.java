package com.hanwhaswcamp.section01.arithmethic;

public class Application1 {
    public static void main(String[] args) {
        // 산술 연산자에 대해 이해하고 활용할 수 있다.
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));   // ()를 안치면 문자열로 인식되어 207이 출력 됨
        System.out.println("num1 - num2 = " + (num1 - num2));   // ()를 안치면 컴파일 에러
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
    }
}
