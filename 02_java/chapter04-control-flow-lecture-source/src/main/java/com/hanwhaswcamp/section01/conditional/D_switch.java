package com.hanwhaswcamp.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement(){
        /* switch문 사용자에 대한 흐름을 이해하고 적용할 수 있다. */
        // if는 조건식 / switch는 조건 값(int,char,string / 실수값 불가)

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 점수 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 점수 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+':
                System.out.println("더하기 연산 실행");
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case 'x':
            case '*':
                result = first * second;
                break;
            case '/':
                // second가 0이면 발생할 수 있는 런타임 오류 java.lang.AirthmeticException : / by zero
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
        }
        System.out.println(first+" "+op+" "+" "+second+" = "+result);
    }

    public void improveSwitchStatement(){
        /* java 14부터 적용 된 개선 switch문 사용자에 대한 흐름을 이해하고 적용할 수 있다. */
        // if는 조건식 / switch는 조건 값(int,char,string / 실수값 불가)

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 점수 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 점수 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        /* -> 를 사용하면 break를 사용하는 것과 동일하며 오히려 작성하면 오류가 발생
        * 2개 이상의 명령문을 작성해야 할 경우 {}로 표기해야 함, 반환값이 있을 경우 yield라고 붙여야 함
        * 반환 값을 리턴할 수 있음. 단, 반드시 default가 있어야만 함
        * default구문이 필수*/
        int result = switch (op) {
            case '+' -> {
                System.out.println("더하기 연산 실행");
                yield first + second;
            }
            case '-' -> first - second;
            case 'x', '*' -> first * second;
            case '/' -> first / second;
            case '%' -> first % second;
            default -> 0;
        };
        System.out.println(first+" "+op+" "+" "+second+" = "+result);
    }
}
