package com.hanwhaswcamp.section01.array;

import javax.sound.midi.SysexMessage;

public class Application {
    public static void main(String[] args) {
        /* 배열의 선언 및 할당 */

        int[] arr = new int[5];

        /* 하나의 이름으로 관리되는 연속 된 메모리 공간이며, 해당 공간을 찾아갈 인데스가 있다.*/
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        /* 인덱스 반복문으로 처리할 수 있다*/
        //  대입 연산자의 왼쪽에 쓰이면 공간을 나타내고있고
        // 공간에 값 입력 받기
        for (int i = 0,value =0; i < arr.length; i++) {
            arr[i] = value += 10;   // value += 10가 먼저 실행됨
            System.out.println(arr[i]);
        }

        int sum = 0;
        /* 향상 된 for문
        * for ( 한번의 반복문에서 사용 될 변수 : 반복을 수행할 배열 )
        * 배열 인덱스의 값을 꺼내서 int j라는 변수에 담아서 사용하는 맥락으로
        * j에 값을 담더라도 배열의 값에는 변화가 없음 -> 배열의 값을 참조할 수 있으나 변경하 수 없음*/
        // 대입 연산자의 오른쪽에 쓰이면 값을 나탄내고 있다.
        // 10 20 30 40 50 값 참조
        for (int j : arr) {
            System.out.println("j = "+j);
            sum += j;
        }
        System.out.println("sum = "+sum);
    }
}
