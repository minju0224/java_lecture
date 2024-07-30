package com.hanwhaswcamp.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        // 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.
        // 1. 숫자와 숫자의 연산
        System.out.println("======정수와 정수=====");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);           // % : mod

        System.out.println("=====실수와 실수=====");
        // 실수를 저장한는 방식 : 부동소수점 (실수와 가수로 나누어 m의 n승으로 저장)
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);            //약간의 오차가 생긴다

        System.out.println("=====정수와 실수=====");
        // 정수를 실수로 변경하는 절차를 거침 -> 실수와 실수의 연산
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 2. 문자와 문자의 연산
        System.out.println("===== 문자와 문자 =====");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("===== 문자와 정수 =====");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("===== 문자와 실수 =====");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        System.out.println("===== 문자열과 문자열 =====");
        System.out.println("hello" + "world");
        //System.out.println("hello" - "world");			//에러 발생
        //System.out.println("hello" * "world");			//에러 발생
        //System.out.println("hello" / "world");			//에러 발생
        //System.out.println("hello" % "world");			//에러 발생

        System.out.println("===== 문자열과 다른 리커럴 =====");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");

        // 4. 논리 값의 연산
        //System.out.println(true + false);				//에러 발생
        //System.out.println(true - false);				//에러 발생
        //System.out.println(true * false);				//에러 발생
        //System.out.println(true / false);				//에러 발생
        //System.out.println(true % false);				//에러 발생
        //System.out.println(true + 1);				//에러 발생
        //System.out.println(true - 1);				//에러 발생
        //System.out.println(true * 1);				//에러 발생
        //System.out.println(true / 2);				//에러 발생
        //System.out.println(true % 2);				//에러 발생
        //System.out.println(true + 'a');				//에러 발생
        //System.out.println(true - 'a');				//에러 발생
        //System.out.println(true * 'a');				//에러 발생
        //System.out.println(true / 'a');				//에러 발생
        //System.out.println(true % 'a');				//에러 발생
        //System.out.println(true - "a");				//에러 발생
        //System.out.println(true * "a");				//에러 발생
        //System.out.println(true / "a");				//에러 발생
        //System.out.println(true % "a");				//에러 발생
    }
}
