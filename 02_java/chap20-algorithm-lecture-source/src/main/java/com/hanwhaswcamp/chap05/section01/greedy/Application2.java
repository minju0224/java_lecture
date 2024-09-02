package com.hanwhaswcamp.chap05.section01.greedy;

import java.util.StringTokenizer;

public class Application2 {
    public static int solution(String input){

        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int count=0;

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = n-1; i >= 0; i--){
            if(money >= arr[i] ){
                count += money/arr[i];
                money = money%arr[i];
            }
        }

        return count;
    }
}