package com.hanwhaswcamp.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        /* 1. 공백을 포함한 문자열을 입력하게 되면 입력 버퍼에 남아있는 문자열로 인해
//        * nextInt()에서 해당 값을 숫자로 변경하지 못해 java.util.InputMismatchException 발생
//        * => 공백 포함 문자열을 입력 받아야 하는 상황에서는 nextLine() 사용하기*/
//        System.out.println("문자열 입력 :");
//        String str1 = sc.next();
//        System.out.println("str1 : "+str1);
//
//        System.out.println("숫자 입력 : ");
//        int num1 = sc.nextInt();
//        System.out.println("num1 : "+num1);

        /* 2. 입력 버퍼에 만아있는 개행분자로 인해 이어지는 nextLine()이 암무 값도 입력 받지 않고 빈 문자열로 처리된다.*/
        System.out.println("숫자 입력 :");
        int num2 = sc.nextInt(); // 숫자 값만 읽음
        System.out.println("str1 : "+num2);

        sc.nextLine(); // => 입력 버퍼를 읽어서 버린다.

        System.out.println("문자열 입력 : ");
        String str2 = sc.nextLine(); // 위에서 입력한 개행문자를 받음
        System.out.println("str2 : "+str2);
    }
}
