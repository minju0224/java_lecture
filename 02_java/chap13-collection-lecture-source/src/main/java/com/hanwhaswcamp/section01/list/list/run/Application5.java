package com.hanwhaswcamp.section01.list.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* Queue에 대해 이해하고 사용할 수 있다. */
        Queue<String> que = new LinkedList<>();

        /* 큐에 데이터를 넣을 때는 offer() 메소드를 사용한다. */
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        /* 큐에서 데이터를 꺼내는 메소드
        * peak() : 큐의 가장 앞에 있는(먼저 들어온)요소를 반환
        * poll() : 큐의 가장 앞에 있는 (먼저 들어온)요소를 반환하고 제거*/
        System.out.println("peek: " + que.peek());
        System.out.println("queue: " + que);

        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
        /* 큐에ㅔ서 반환하는 값이 없ㅇ을 경우 null값을 반환
        * */
        System.out.println("queue: " + que);
    }
}
