package com.hanwhaswcamp.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement(){
        /* continue 문 사용에 대한 흐름으르 이해하고 적용할 수 있다 */
        /*4의 배수이면서 5의 배수인 값 출력*/
        for(int i = 1 ; i <= 100 ; i++){
            if(i%4!=0 || i%5!=0) continue;
            System.out.println(i);
        }
    }

    public void testSimpleContinueStatement2(){
        /* 중첩 반복문 내 continue 사용에 대한 흐름을 이해하고 적용할 수 있다.
        * continue는 모든 반복문응ㄹ 뛰어넘는 것이 아니라 가장 인접한 반봅문의 실행만 건너 뛴다. */
        for(int i = 2; i <= 9; i++){
            System.out.println("===="+i+"단 ====");
            for(int j = 1; j <= 9; j++){
                if(j % 2 == 0) continue;
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
    public void testJumpContinue(){
        /* 중첩 반복문 내 continue문 사용시 jump(goto)에 대한 프름을 이해하고 적용할 수 있다. */
        label:
        for(int i = 2; i <= 9; i++){
            System.out.println("===="+i+"단 ====");
            for(int j = 1; j <= 9; j++){
                if(j % 2 == 0) continue label;
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
