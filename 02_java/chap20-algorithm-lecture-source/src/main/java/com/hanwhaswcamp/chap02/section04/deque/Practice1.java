package com.hanwhaswcamp.chap02.section04.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice1 {
    public String solution(Integer[] notes) {
        StringBuilder sb = new StringBuilder();
        Deque<Ballon> ballons = new ArrayDeque<>();
        for ( int i = 0; i < notes.length; i++ ) {
            ballons.add(new Ballon(i+1, notes[i]));
        }
        // 무조건 첫 번째 풍선이 터진다
        Ballon current = ballons.removeFirst();
        sb.append(current.order);
        // 모든 풍선들이 터질 때까지
        while (!ballons.isEmpty()) {
            // 터진 중선에 기록 된 이동 값
            int moveValue = current.noteValue;
            if(moveValue > 0) {
                // 앞의 값 뒤로 삽입
                for(int i = 1; i < moveValue; i++) {
                    ballons.add(ballons.removeFirst());
                }
                current = ballons.removeFirst();
            }else{
                // 뒤의 값 앞으로 삽입
                for(int i = 1; i < -moveValue; i++) {
                    ballons.addFirst(ballons.removeFirst());
                }
                current = ballons.removeLast();
            }

            sb.append(" ").append(current.order);
        }
        return null;
    }
    static class Ballon{
        int order;
        int noteValue;

        Ballon(int order, int noteValue) {
            this.order = order;
            this.noteValue = noteValue;
        }
    }
}
