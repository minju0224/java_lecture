package com.hanwhaswcamp.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        // 논리 연산자 활용

        // 1~100 사이의 값인지 확인
        int num = 50;
        System.out.println("1에서 100사이의 값 : "+(num >= 1 && num <= 100));

        // 영어 대문자인지 확인
        char ch = 'G';
        System.out.println("영어 대문자인지 확인 : "+(ch>='A'&&ch<='Z'));

        // 대소문자 상관 없이 영문자 y인지 확인
        char ch2 = 'y';
        System.out.println("영문자 y인지 확인 : "+(ch2=='y'|| ch2=='Y'));

        // 영문자인지 확인
        char ch3 = 'a';
        System.out.println("영문자 인지 확인 : "+((ch3>='A'&&ch3<='Z')||(ch3>='a'&&ch3<='z')));
    }
}
