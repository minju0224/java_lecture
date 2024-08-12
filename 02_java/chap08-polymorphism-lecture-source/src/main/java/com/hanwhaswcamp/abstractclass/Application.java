package com.hanwhaswcamp.abstractclass;

import org.w3c.dom.ls.LSOutput;

public class Application {
    public static void main(String[] args) {
        /* 추상 클래스와 추상 메서드를 */

        /*  추상 클래스는 인스턴스 생성 불가*/
//        Product product  = new Product() {}
        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone instanceof Product;
        System.out.println(smartPhone instanceof SmartPhone);

        /* 다형성을 적용해서 추상 클래스를 러퍼런스 타입으로 사용 가능*/
        Product product = new smartPhone();
        product.abtractMethod();

        product.nonStaticMethod();
        Product.staticMethod();

    }
}
