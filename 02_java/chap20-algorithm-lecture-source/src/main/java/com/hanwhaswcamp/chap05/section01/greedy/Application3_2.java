package com.hanwhaswcamp.chap05.section01.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Application3_2 {

    static class Time implements Comparable<Time> {
        int start;
        int end;
        Time(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if(this.end == o.end)
                return o.start - this.start;    // 종료 시간 같을 경우 시작 시간 내림차순
            else
                return this.end - o.end;       // 종료 시간 다를 경우 종료 시간 오름차순
        }
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> times = new ArrayList<Time>(); // 회의를 보관할 리스트

        for(int i = 0; i <n; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            times.add(new Time(start, end));
        }

        Collections.sort(times);
        int endtime = 0;
        int count = 0;
        /* time 배열 안에 담긴 회의를 반복하며 확인 */
        for(Time time : times){
            if(time.end == time.start){
                count++;
                continue;
            }
            if(time.start >= endtime){
                count++;
                endtime = time.end;
            }
        }
        /* 최대 넣을 수 있는 회의의 갯수*/
        return count;
    }
}
