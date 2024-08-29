package com.hanwhaswcamp.chap05.section01.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3 {
    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];

        for(int i = 0; i <n; i++){
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());      // 오름차순
        }

        Arrays.sort(time, (a, b) ->{
            /* 종료 시간이같은 회의는 시작시간 기준으로 내림차순 한다*/
            if(a[1] == b[1]) return b[0] - a[0];
            /* 종료시간을 기준으로 오름차순 정렬*/
            return a[1] - b[1];
        });
        int endtime = 0;
        int count = 0;
        /* time 배열 안에 담긴 회의를 반복하며 확인 */
        for(int i = 0; i <n; i++){
            /* 시작과 종료가 같으면 무조건 가능 */
            if(time[i][0] == time[i][1]){
                count++;
                continue;
            }
            /* 앞선 회의가 끝나는 시간과 일치하거나 이후에 시작되는지? */
            if(endtime <= time[i][0]){
                count++;        // 배정 된 회의 카운트
                endtime = time[i][1];       // 이후 회의 배정시 사용할 종료 시간 수정
            }
        }
        /* 최대 넣을 수 있는 회의의 갯수*/
        return count;
    }
}
