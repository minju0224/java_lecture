package com.hanwhaswcamp.section01.scope.subsection01.singleton;

import com.hanwhaswcamp.common.Product;
import com.hanwhaswcamp.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        /* 슈퍼에 상품이 진열 되어 있다. */
        Product crapBread = applicationContext.getBean("crapBread", Product.class);
        Product milk = applicationContext.getBean("milk", Product.class);
        Product water = applicationContext.getBean("water", Product.class);

        /* 한 손님이 쇼핑 카트를 꺼내 상품을 카트에 담는다 */
        ShoppingCart cart = applicationContext.getBean("cart",ShoppingCart.class);
        cart.addItem(crapBread);
        cart.addItem(milk);

        System.out.println("cart에 담긴 상품 : " + cart.getItem());

        /* 다른 손님이 쇼핑 카트를 꺼내 상품을 카트에 담는다.*/
        ShoppingCart cart2 = applicationContext.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);
        System.out.println("cart2에 담긴 상품 : "+cart2.getItem());

        /* Bean의 기본 스코프는 singleton이다.
        * singleton 스코프를 갖는 bean은 애플리케이션 내에서 유일한 인스턴스를 갖는다. */
    }
}
