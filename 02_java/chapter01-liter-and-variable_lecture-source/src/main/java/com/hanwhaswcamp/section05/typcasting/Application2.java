package com.hanwhaswcamp.section05.typcasting;

public class Application2 {
    public static void main(String[] args) {
        //  강제 형변환

        /* 1. 정수 끼리의 강제 형변환 */
        long lnum = 8;
        //int inum = lnum;			//데이터 손실 가능성을 컴파일러가 알려준다. (에러남) -> 강제 형변환
        int inum = (int) lnum;		//변경하려는 자료형을 명시하여 강제 형변환을 해야 함

        short snum = (short) inum;
        byte bnum = (byte) snum;

        /* 2. 실수 끼리의 강제 형변환 */
        double dnum = 8.0;
        //float fnum = dnum;			//데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        float fnum = (float) dnum;

        System.out.println(fnum);

        float fnum2 = 4.0f;
        //long lnum2 = fnum2;				    //float는 4byte, long은 8byte임에도 자동 형변환 불가능 (소수점 자리 이하 데이터 손실 가능성)
        long lnum2 = (long) fnum2;			//강제 형변환의 의미는 '내가 데이터 손실을 감안할테니 형변환 해줘~' 라는 의미이다.

        char ch = 'a';
        byte bnum2 = (byte) ch;				//당연히 char 자료형보다 작은 크기이니 강제형변환을 해야 한다.
        short snum2 = (short) ch;			//같은 2byte이지만 부호비트(sign bit)로 인한 값의 범위가 다르기 때문에 강제 형변환을 해 주어야 한다.

        /* 추가적으로 정수를 char 자료형에 강제 형변환해서 대입하기 테스트 */
        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2;				//음수도 강제 형변환 하면 대입할 수 있다.

        System.out.println("ch2 : " + ch2);
        System.out.println("ch3 : " + ch3);

        boolean isTrue = true;
        // byte b = (byte) isTrue;
        // short s = (short) isTrue;
        // int i = (int) isTrue;
        // float f = (float) isTrue;
        // double d = (double) isTrue;
        // char c = (char) isTrue;
    }
}
