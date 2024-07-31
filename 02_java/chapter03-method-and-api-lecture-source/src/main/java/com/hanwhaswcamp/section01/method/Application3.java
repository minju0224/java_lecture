package com.hanwhaswcamp.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /* 메소드 전달 인자(argument)와 매개변수(pparameter)에 대해 이해하고 메소드 호출 시 사용할 수 있다*/
        Application3 app3 = new Application3();
        app3.testMethod(24);
        app3.testMethod(25);
//        app3.testMethod("10");
//        app3.testMethod(20,30);
//        app3.testMethod();

        int age = 30;
        app3.testMethod(age);
        app3.testMethod(age*3);

        byte byteAge = 10;
        app3.testMethod(byteAge);   // 자동 형변환

        long longAge = 20;
        app3.testMethod((int)longAge);   // 강제 형변환

    }
    // int 타입의 매개변수를 전달 받는 메소드 선언
    public void testMethod(int age) {
        System.out.println("당신의 나이는 "+age+"세 입니다.");
    }
}
