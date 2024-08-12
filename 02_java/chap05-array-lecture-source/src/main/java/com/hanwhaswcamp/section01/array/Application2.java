package com.hanwhaswcamp.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /* 배열의 선언
        * -> 선언은 stack에 배열의 주소를 보관할 래퍼런스 변수 공간을 만드는 것
        * 아직 heap이라는 공간에 할당 ㄴㄴ*/
        int [] iarr;
        double darr [];

        /* 선언한 래퍼런스 변수에 배열을 할당하며 대입 할 수 있다.
        *  new 연산자는 heap 영역에 공간을 할당하고  발생한 주소 값을 반환한다.
        *  발생한 주소가 래퍼런스 변수(참조형 변스)에 저장 되고 이것을 참조하여 사용하기 때문에
        *  참조 자료형이라고 한다.*/
        iarr = new int[5];
        darr = new double[10];

        /* heap 메모리는 이름으로 접근하지 않고 주소로 접근하는 영역이다.
        *  stack에 저장 된 주소로 heap에 할당 된 배열을ㄹ 찾아갈 수 있다 */
        System.out.println(iarr);
        System.out.println(darr);

        /* hashCode() : 객체의 주소 값을 10진수로 변환하여 생성한 객체의 고유 정수값 반환 */
        System.out.println(iarr.hashCode());
        System.out.println(darr.hashCode());

        /* 배열의 길이를 할 수 있는 필드를 제공한다.
        *  String 클래스의 문자열의 길이는 메소드로 제공하므로 length()로 사용하는점에 유의*/
        System.out.println(iarr.length);
        System.out.println(darr.length);

        /* 합 번 지정한 배열의 길이는 변경하지 못하므로
        *  새로운 배열을 생성하여 그 주소 값을 래퍼런스 변수에 덮어 쓴다. */
        iarr = new int[100];
        System.out.println(iarr.hashCode());
        System.out.println(iarr.length);

        /* 한 번 할당 된 배열은 지울 수 없다.
        * 단, 참조 되지 않는 배열은 시간이 지난 후 old 영역으로 이동하여 GC(가비지 컬레터)가 삭제 한다.
        * 주소 값을 잃어버린 배열은 재참조 불가능하다.*/
        iarr = null;    // 참조하는 주소 값이 없음을 나타냄
//        System.out.println(iarr.hashCode());
//        System.out.println(iarr.length);      // NullPointerException : 래퍼런스 변수 값이 null로 되어있다.
        // 참조 연산자 : .
    }
}
