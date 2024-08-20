package com.hanwhaswcamp.chap02.section04.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/* java collection framework에서는 deque 인터페이스와 이를 구현한 클래스가 있다 */
public class Application {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addFirst(4);

        System.out.println(deque.getFirst());
        System.out.println(deque.peekFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());

        /* 요소 제거 */
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.peekLast());
    }
}
