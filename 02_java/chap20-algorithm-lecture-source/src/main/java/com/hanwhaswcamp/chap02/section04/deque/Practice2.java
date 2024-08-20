package com.hanwhaswcamp.chap02.section04.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice2 {

    public String solution(String command, Integer[] array) {
        StringBuilder sb = new StringBuilder();
        String [] com = command.split("");
        Deque<Integer> deque = new ArrayDeque<Integer>();
        for (int i = 0; i < array.length; i++) {
            deque.addLast(array[i]);
        }
        sb.append("[");
        for (int i = 0; i < com.length; i++) {
            boolean arrow = true;
            if(com[i].equals("R")) {
                arrow = false;
            }
            if(com[i].equals("D")) {
                sb.append(deque.removeFirst()).append(",");
            }
        }
        sb.append("]");
        return null;
    }
}