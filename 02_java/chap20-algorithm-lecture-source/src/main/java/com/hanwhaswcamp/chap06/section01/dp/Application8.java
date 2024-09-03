package com.hanwhaswcamp.chap06.section01.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

/* LCS(Longest Common Subsequence) : 최장 공통 부분 수열 */
public class Application8 {

    static char[] arr1;
    static char[] arr2;
    static Integer[][] dp;

    public static int solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr1 = br.readLine().toCharArray();
        arr2 = br.readLine().toCharArray();
        dp = new Integer[arr1.length][arr2.length];

        return lcs(arr1.length - 1, arr2.length - 1);
    }

    private static int lcs(int x, int y) {

        if (x < 0 || y < 0) return 0;

        if (dp[x][y] == null) {
            dp[x][y] = 0;

            // 서로 같은 문자가 발견 되었다면
            if (arr1[x] == arr2[y]) {
                dp[x][y] = lcs(x - 1, y - 1) + 1;
            } else {
                // 같은 문자가 아니라면 이전 인덱스의  값을 참조 하되
                // (위, 왼) 둘 중 가장 큰 값을 참조한다.
                dp[x][y] = Math.max(lcs(x - 1, y), lcs(x, y - 1));
            }
        }

        return dp[x][y];
    }
}
