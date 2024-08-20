package com.hanwhaswcamp.chap02.section06.heap;

import java.util.PriorityQueue;

public class Practice1 {
    public String solution(Integer[] array) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> {
            int absCompare = Integer.compare(Math.abs(a), Math.abs(b));
            if (absCompare == 0) {
                return Integer.compare(a, b);
            }
                return absCompare;
        });

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                if(minHeap.isEmpty()){
                    sb.append("0").append(" ");
                }else{
                    sb.append(minHeap.poll()).append(" ");
                }
            }else{

                    minHeap.offer(array[i]);

            }
        }
        return sb.toString().trim();
    }
}
