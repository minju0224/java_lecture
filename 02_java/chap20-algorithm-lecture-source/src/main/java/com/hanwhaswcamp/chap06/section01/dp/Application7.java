package com.hanwhaswcamp.chap06.section01.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

/*LIS (Longest Increasing Subsequence)*/
public class Application7 {
    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int max = 1;
        // 입력 된 arr 배열의 각 인덱스를 기준 삼아서 앞을 탐색할 반복문
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                // 증가 수열의 일부
                if(arr[i] > arr[j]) {
                    // dp[i] = dp[j] + 1
                    /* 만약 10(1) 20(2) 5(1) 30에서 2+1 = 3이 되어야 하는데
                    * 1 + 1 = 2가 되어버리면 안되므로 dp[i]와 dp[j]+1중에 큰 값을 골라야 함 */
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
