package com.hanwhaswcamp.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception{
        System.out.println("가지고 계신 돈은 : "+money);
        if(money >= price){
            System.out.println("상품을 구입하기위한 금액이 충분합니다 ");
        }else{
            /* 강제로 예외를 발생시킨다. 예외를 발생 시키면 예외 처리가 필요하다
            * 첫번째 예외 처리 방법은 메소드 시그니처에 throw 구문을 작성하는 것이다.
            * -> 예욍 대한 책임을 해당 메소드를 호출하는 곳으로 위임하여 예외처리 강제화 */
            throw new Exception();
        }

        System.out.println("즐거운 쇼핑하세요 ~");
    }
}
