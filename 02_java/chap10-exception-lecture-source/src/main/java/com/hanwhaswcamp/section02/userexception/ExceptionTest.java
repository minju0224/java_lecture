package com.hanwhaswcamp.section02.userexception;

import com.hanwhaswcamp.section02.userexception.exception.MoneyNegativeException;
import com.hanwhaswcamp.section02.userexception.exception.NegativeException;
import com.hanwhaswcamp.section02.userexception.exception.NotEnoughMoneyException;
import com.hanwhaswcamp.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    /* throws 구문 작성 시 여러 Exception을 나열 할 수 있으며, 상위 타입의 Exxeption만 작성할 수도 있다 */
    public void checkEnoughMoney(int price, int money) throws /*PriceNegativeException, MoneyNegativeException, NegativeException, NotEnoughMoneyException*/ Exception {

        if(price < 0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다");
        }

        if(money < 0){
            throw new MoneyNegativeException("가지고 있는 돈은 움수일 수 없습니다");
        }

        if(money < price){
            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 더 비쌉니다");
        }

        System.out.println("즐거운 쇼핑하세요 ~");
    }
}
