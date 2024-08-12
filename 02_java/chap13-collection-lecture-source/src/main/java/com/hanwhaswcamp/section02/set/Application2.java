package com.hanwhaswcamp.section02.set;

import java.util.LinkedHashSet;

public class Application2 {
    public static void main(String[] args) {
        /*LinkedHashSet에 대해 이해하고 사용할 수 있다 */
        LinkedHashSet<String> lhest = new LinkedHashSet<>();
        lhest.add("A");
        lhest.add("B");
        lhest.add("C");
        lhest.add("D");
        lhest.add("E");

        /* HashSet이 가지는 기능을 모두 가지고 있으며, 추가적으로 저장 순서를 유지하는 특징을 가지고 있다. */
        System.out.println("lhest: " + lhest);
    }
}
