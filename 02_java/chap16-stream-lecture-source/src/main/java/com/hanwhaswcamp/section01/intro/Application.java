package com.hanwhaswcamp.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        /* Stream*/
        List<String> list = new ArrayList<>(Arrays.asList("hello","stream","world"));

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String str = iterator.next();
            if(str.equals("stream")) {
                System.out.println("걸러낸 값 : "+ str);
            }
        }

        // hasNext()가 위의 while을 돌고 빠져 나올 때 이미 false
        // 다시 한번 순회하고 싶으면 다시 객체를 만들어야 함.
        while(iterator.hasNext()) {
            String str = iterator.next();
            System.out.println("반복문"+str);
        }

        /* Iterator 대신 Streamm의 기능을 활용 */
        list.stream()       // stream()의 형태로 바꿈, list와는 별도의 것, 원본은 건드리지 X
                .filter("stream"::equals)
                .forEach(str -> System.out.println("걸러낸 값 : "+ str));
    }
}
