package com.hanwhaswcamp.chap02.section02.stack;

import java.util.Stack;

public class Practice2 {
    public int solution(String input) {
        Stack<String> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input);
                continue;
            }
            if (input.charAt(i) == ')') {
                stack.pop();

                if (input.charAt(i - 1) == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }
        return result;
    }
}