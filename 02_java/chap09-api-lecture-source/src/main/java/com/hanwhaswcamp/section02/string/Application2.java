package com.hanwhaswcamp.section02.string;

public class Application2 {
    public static void main(String[] args) {
        /* 문자열 객체를 만드는 방법
         * "" 리터럴 형태 : 동일한 값을 가지는 인스터스를 단일 인스턴스로 관리한다.
         * nre String("문자열")  : 매번 새로운 인스턴스를 생성한다. */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1== str2 " + str1 == str1);
        System.out.println("str2== str3 " + str2 == str3);
        System.out.println("str3== str4 " + str3 == str4);

        /*값이 같은 문자열은 같은 해시ㅣ코드를 반환하도록 String 클래스에 hashcode 메소드가 재정의 되어 있다. */
        System.out.println("str1.hashDode" + str1.hashCode());
        System.out.println("str2.hashDode" + str2.hashCode());
        System.out.println("str3.hashDode" + str3.hashCode());
        System.out.println("str4.hashDode" + str4.hashCode());

        /* 문자열은 불변이라는 특성을 가진다. */
            str1 += "oracle";
            System.out.println("str1==str2 " + (str1 == str2));

        System.out.println("str1.equals(str2) " + (str1.equals(str2)));
        System.out.println("str1.qsquals src =  " + str1.equals(str1));
    }

}