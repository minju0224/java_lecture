package com.hanwhaswcamp.chap02.section05.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Practice1 {

    public String solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());    // 테스트의 수
        StringTokenizer st;
        String [] num = input.split("\n");

        for(int i =0; i<t; i++){
            int k = Integer.parseInt(br.readLine());    // 연산의 수
            TreeMap<Integer, Integer> map = new TreeMap<>();    //   이중 우선순위의 큐의 역할을 할 TreeMap
            // key값에 k를 삽입, value값에는 갯수로 저장
           for(int j=0; j<k; j++){
               st = new StringTokenizer(br.readLine()," ");
               char cmd = st.nextToken().charAt(0);
               int value = Integer.parseInt(st.nextToken());

               if(cmd == 'I'){
                   // 해당 값ㅇ을 가지고 있다며 기준 값 +1, 가지고 있지 않다면 0(defaul) + 1
                   map.put(value, map.getOrDefault(value, 0) + 1);
               } else if (!map.isEmpty()) {
                   // 삭제 + 저장 된 값이 있을 떄만 수행
                   int key = (value == 1)? map.lastKey():map.firstKey();
                   // computeIfPresent : 키가가 존재하지 않으면 아무런 작업 수행하지 않고 null 반환
                   // 키가 존재함면 remappingFunction 호춣하여 null 반환 시 제거,
                   map.computeIfPresent(key, (k1,v) -> (v == 1)? null : v-1);
               }

           }
           if(map.isEmpty()){
               sb.append("EMPTY\n");
           }else{
               sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');
           }

        }
        return sb.toString().trim();
    }
}