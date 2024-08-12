package com.hanwhaswcamp.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /* Wrapper 클래스 사용법을 이해할 수 있다 */

        int num = 129;
        /* Wrapper 클래스의 생성자는 1.9부터 Deprecated 되었다 */
//        Integer num1 = new Integer(num);

        /* Boxing : int -> integer */
        Integer num1 = Integer.valueOf(num);
        /* AutoBoxing */
        Integer num2 = num;

        /* Unboxing : Integer -> int */
        int num3 = num1.intValue();
        /* Auto UnBoxing */
        int num4 = num2;

        /* integer.valueof() 메소드가 byte 범위의 숫자는 개싱 처리 하고 있어 num1 == num2 가 true가 나올 수 있다. */
        System.out.println(num1 == num2);   // 주소값 비교
        System.out.println(num2 == num3);   // 값 비교
        System.out.println(num3 == num4);   // 값 비교

        /* 인스터느 값 비교는 항상 equals() 메소드를 사용한다 */
        System.out.println(num1.equals(num2));
    }
}
