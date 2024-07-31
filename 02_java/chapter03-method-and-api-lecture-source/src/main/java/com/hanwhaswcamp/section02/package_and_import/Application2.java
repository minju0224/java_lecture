package com.hanwhaswcamp.section02.package_and_import;
import com.hanwhaswcamp.section01.method.Calculator;

import static com.hanwhaswcamp.section01.method.Calculator.max;

public class Application2 {
    public static void main(String[] args) {
        /* 패키지에 대해 이해할 수 있다*/
        /* 매번 풀클래스명을 작성하기는 패키지명을 생략하고 사용할 수 있도록 import 구문을 사용한다*/
        // 1. non-static method
        Calculator calculator = new Calculator();
        System.out.println(calculator.min(10, 20));

        // 2. static method
        System.out.println(Calculator.max(10, 20));
        // static 메소드 호출 시 import stati을 하면 클래스명도 생략하고 호출할 수 있다.
        System.out.println(max(10, 20));
    }
}
