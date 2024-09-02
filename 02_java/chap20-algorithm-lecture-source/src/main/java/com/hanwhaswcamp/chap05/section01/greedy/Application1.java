package com.hanwhaswcamp.chap05.section01.greedy;

public class Application1 {
    public static int solution(int n){
        int count = 0;
        int big = n/5;
//        for(int i = big; i >= 0; i--){
//            int a = n-5*i;
//            if(a%3 == 0){
//                count = i + a/3;
//                break;
//            }else if(i == 0 && !(a%3 == 0)){
//                count = -1;
//                break;
//            }
//        }
//        return count;

        while(true){
            if(n%5 == 0){
                return n/5 +count;
            } else if (n<0) {
                return -1;
            }
            n = n-3;
            count++;
        }
    }
}