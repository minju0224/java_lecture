package com.hanwhaswcamp.chap06.section01.dp;

/* 파도반 수열
파도반 수열의 점화식 f(n) = f(n-2) + f(n-3)
* 1. 탑다운 방식 (재귀 호출)
* 2. 바텀업 방식 (반복문)*/
public class Application3 {
    static int[] dp = new int[100];
    public static int solution(int n){
        dp[1] = dp[2] = dp[3] = 1;

        // BottomUp 방식
//
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i - 2] + dp[i - 3];
//
//        }
//        return dp[n];

        // TopDown 방식
        return padovan(n);
    }
    // TopDown 방식
    private static int padovan(int n){
        if(dp[n] == 0) {
            dp[n] = padovan(n-2) + padovan(n-3);
        }
        return dp[n];
    }
}
