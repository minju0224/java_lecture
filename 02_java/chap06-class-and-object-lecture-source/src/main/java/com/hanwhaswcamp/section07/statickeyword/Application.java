package com.hanwhaswcamp.section07.statickeyword;

public class Application {
    /* static 키워드에 대해 이해할 수 있다 */

    public static void main(String[] args) {

        /* */
        StaticFieldTest sft1 = new StaticFieldTest();
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println(sft1.getNonStaticCount());
        System.out.println(sft1.getStaticCount());

        StaticFieldTest sft2 = new StaticFieldTest();

        sft2.increaseNonStaticCount();
        sft2.increaseStaticCount();

        System.out.println(sft2.getNonStaticCount());
        System.out.println(sft2.getStaticCount());
    }
}
