package com.hanwhaswcamp.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다.*/
        /* 매개변수 사용 가능 자료형
        * 1. 기본 자료형
        * 2. 기존 자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변 인자*/


        ParameterTest pt = new ParameterTest();
        int num = 10;
        pt.testPrimaryTypeParameter(num);
        System.out.println("main num ="+num);   // 10

        int [] iarr = {1,2,3,4,5};
        pt.testPrimaryTypeArrayParameter(iarr);     //  참조 자료형은 주소값을 넘기기 때문에 값이 같음
        System.out.println("main num ="+iarr[0]);   // 99

//        pt.testVariableLengthArrayParameter();  name은 무조건 있어야 함
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("홍길동","볼링");
        pt.testVariableLengthArrayParameter("홍길동","볼링","축구");
        pt.testVariableLengthArrayParameter("홍길동","볼링","축구","테니스");
        pt.testVariableLengthArrayParameter("홍길동", new String[]{"볼링", "축구", "테니스"});



    }
}
