package com.hanwhaswcamp.chap02.section03.queue;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {

    public int solution(int w, int l, Integer[] truckWeight) {
        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        int count=0; // 시간
        int bridgeWeight=0; //다리의 무게
        for(int i=0; i<truckWeight.length; i++){
            truck.offer(truckWeight[i]); // 트럭의 무게
        }

        for(int i=0; i<w; i++){
            bridge.add(0); // 다리를 모두 0으로 초기화
        }

        while(!bridge.isEmpty()) { // 다리 위가 empty가 아닐 때
            count++;
            bridgeWeight-=bridge.poll(); // 다리무게에서 내려온 트럭 무게를 뺌
            if(!truck.isEmpty()){ // 트럭이 남아있다면
                if(truck.peek()+bridgeWeight <= l) { // 앞의 트럭이 더해져도 다리의 최대하중보다 작다면
                    bridgeWeight+=truck.peek();
                    bridge.offer(truck.poll()); // 다리에 트럭 추가
                }else{ // 최대 하중을 초과하면
                    bridge.offer(0); // 다리위에 아무것도 안실림
                }
            }
        }
        return count;
    }
}