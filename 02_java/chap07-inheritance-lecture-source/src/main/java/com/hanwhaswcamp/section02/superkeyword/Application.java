package com.hanwhaswcamp.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /* super, super()에 대햏 이해할 수 있다. */

        /* Product 기본 생성자*/
        Product product1 = new Product();
        System.out.println(product1.getInformation());

        /* Product 매개변수 생성자 */
        Product product2 = new Product("s-01234","삼성","갤럭시",23899000, new Date());
        System.out.println(product2.getInformation());

        /*computer 기본 생성자*/
        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        /*Computer 매개변수 생성자*/
        Computer computer2 = new Computer("퀄컴",512,12,"안드로이드");
        System.out.println(computer2.getInformation());

        Computer computer3 = new Computer("s-01234",new Date(),23899000,"삼성","갤럭시","퀄컴",512,12,"안드로이드");
        System.out.println(computer3.getInformation());
    }
}
