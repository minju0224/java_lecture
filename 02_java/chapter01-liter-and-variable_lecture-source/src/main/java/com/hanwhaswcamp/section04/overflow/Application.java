package com.hanwhaswcamp.section04.overflow;

public class Application {
    public static void main(String[] args) {
        // 오버 플로우에 대해 이해할 수 있다.

        byte num1 = 127;
        System.out.println("num1 : "+num1);

        num1++;

        System.out.println("num1 : "+num1);

        num1--;

        System.out.println("num1 : "+num1);
        // 오버 플로우, 언더플로우는 컴파일 에러는 발생하지 않지만 최대값 최소값 범위를 고려하여 자료형을 선택해야 한다.
        int firstNum = 1000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println("multi : "+multi);

        // 형변환
        long longMulti = (long)firstNum * secondNum;
        System.out.println("longMulti : "+longMulti);
    }
}