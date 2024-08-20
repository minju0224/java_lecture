package com.hanwhaswcamp.chap02.section06.heap;

import java.util.PriorityQueue;

/* Java collection Framework에는 heap을 직접 지원하는 클래스는 없지ㅣ만
* PriorityQueue 클래스를 이용하여 heap을 구현할 수 있다 */
public class Application {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);  최대heap

        // 요소 추가
        minHeap.offer(10);
        minHeap.offer(5);
        minHeap.offer(8);

        //  최소값 조회
        System.out.println(minHeap.peek());
        // 최소값 제거
        System.out.println(minHeap.poll());
        //  제거 후 최소값 조회
        System.out.println(minHeap.peek());
    }
}
