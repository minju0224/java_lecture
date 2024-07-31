package com.hanwhaswcamp.section03;

public class increment {
    public static void main(String[] args) {
        /* 증감 연산자에 대해 이해하고 활용할 수 있다*/
        /* 단항으로 사용될 때는 1 증가/1 감소의 의미를 가진다. */
        int num = 20;
        System.out.println("num : " + num);

        num++;		//1 증가
        System.out.println("num : " + num);

        ++num;		//1 증가
        System.out.println("num : " + num);

        num--;		//1 감소
        System.out.println("num : " + num);

        --num;		//1 감소
        System.out.println("num : " + num);

        /* 다른 연산자와 함께 증감 연산자를 사용하는 경우*/
        // 후위 연산은 다른 연산이 수행 된 후 마지막으로 수행된다.
        int firstName = 20;
        int result1 = firstName++ * 3; // (20*3)이 연산 된 후 first+1이 됨
        System.out.println("result1 = " + result1); // 60
        System.out.println("resultNum = " + firstName);

        int secondName = 20;
        int result2 = ++secondName * 3;
        System.out.println("result2 = " + result2); // (20
        System.out.println("resultNum = " + secondName);
    }
}
