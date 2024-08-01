package com.hanwhaswcamp.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /* for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        for(int i = 0; i < 10; i++){
            System.out.println("출력 : "+i);
        }
    }

    public void testForStatement(){
        /* 1~10 까지의 합계 구하기 */
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("sum = "+sum);
    }
    public void testForExample1(){
        /* 5~10 사이의 난수를 발생키셔 1부터 발생한 난수까지의 합 구하기*/
        Random rand = new Random();
        int random = rand.nextInt(6)+5;
        int sum = 0;
        for(int i = 1; i <= random; i++){
            sum += i;
        }
        System.out.println("1부터"+random+"까지의 합 "+ sum);
    }
    public void testForExample2(){
        /* 숫자 2개를 입력 받아 작은 수에서 큰 수까지의 합계를 구한다
        * 동알힌 숫자는 입력하지 않는다는 가정으로 해결*/
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int firstNum = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int secondNum = sc.nextInt();
        int sum  = 0;
        /* 내 풀이*/
//        if(firstNum > secondNum){
//            int temp =0;
//            temp = firstNum;
//            firstNum = secondNum;
//            secondNum = temp;
//        }
//        for(int i = firstNum ; i<=secondNum ; i++){
//            sum += i;
//        }
//        System.out.println(min+"에서"+max+"까지의 합은 "+sum);
        int min =0;
        int max =0;
        if(firstNum > secondNum){
            max = firstNum;
            min = secondNum;
        }else{
            max = secondNum;
            min = firstNum;
        }
        for(int i = min; i <= max; i++){
            sum += i;
        }
        System.out.println(min+"에서"+max+"까지의 합은 "+sum);
    }

    public void printSimpleGugudan(){
        /* 사용자가 입력하는 단의 구구단을 출력하기 */
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구구단의 단수 : ");
        int dan = sc.nextInt();

        if(dan >= 2 && dan <= 9){
            for(int i = 1; i <= 9; i++){
                System.out.println(dan+"*"+i+"="+dan*i);
            }
        }else{
            System.out.println( "반드시 2~9 사이의 양수를 입력하세요");
        }
    }
}
