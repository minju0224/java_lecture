package com.hanwhaswcamp.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        // and or 연산자의 특징

        //A && B : a의 겨로가가 false이 면 b를 실행하지 않음
        /* -> false가 나올 확룔이 높은 조건을 아펭 배치하면 연산 횟수를 줄일 수 있다*/
        int num1 = 10;
        int result1 = (false && ++num1 > 0) ? num1 : num1;
        System.out.println("&& 실행 결과 :"+num1);

        // A || B:  a의 결과가 true이면 b는 실행하지 않음
        /* -> true가 나올 확률이 높은 조건을 앞에 배치하면 연산 횟수를 줄일 수 있다*/
        int num2 = 10;
        int result2 = (false || num2 > 0) ? num2 : num2;
        System.out.println("|| 실행 확인 :  "+ num2);
    }
}
