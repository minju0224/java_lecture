package com.hanwhaswcamp.chap02.section01.stack;

import java.util.Stack;

public class Practice1 {
    public String solution(String input) {
//        Stack<String> stack = new Stack<>();
//        String a = "";
//        for (int i = 0; i < input.length(); i++) {
//            a = input.substring(i, i + 1);
//            if(a.equals("(")){
//                stack.push(a);
//            }else if(a.equals(")")){
//                if(stack.isEmpty()){
//                    return "NO";
//                }else {
//                    stack.pop();
//                }
//
//        }
//        if(stack.isEmpty()){
//            return "YES";
//        }else{
//            return "NO";
//        }
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()) {
            if(c == '('){
                /* 여는 괄호인 경우 stack에 넣는다. */
                stack.push(c);
            }else{
                /* 닫는 괄호인 경우 stack에서 pop 한다*/
                if(stack.isEmpty()){
                    return "NO";
                }else{
                    stack.pop();
                }

            }
        }
        if(stack.isEmpty()){ return "YES"; }

        return "NO";
    }
}
