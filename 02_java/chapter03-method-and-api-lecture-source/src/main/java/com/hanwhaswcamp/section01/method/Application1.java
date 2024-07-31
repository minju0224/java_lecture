package com.hanwhaswcamp.section01.method;

public class Application1 {



    public static void main(String[] args) {
        /* 메소드의 호출 흐름에 대한 이해*/
        System.out.println("main 메소드 호출 됨");

        // 작성함 메소드를 호출
        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main 메소돋 종료 됨");
    }

    public void methodA() {
        System.out.println("methodA 호출 됨");
        methodB();
        System.out.println("methodA 종료 됨");
    }
    public void methodB() {
        System.out.println("methodB 호출 됨");
        methodC();
        System.out.println("methodB 종료 됨");
    }
    public void methodC() {
        System.out.println("methodC 호출 됨");
        System.out.println("methodC 종료 됨");
    }
}
