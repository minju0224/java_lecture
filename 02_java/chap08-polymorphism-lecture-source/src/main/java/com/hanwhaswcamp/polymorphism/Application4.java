package com.hanwhaswcamp.polymorphism;

public class Application4 {
    public static void main(String[] args) {
        /* 다형성을 적용하여  리턴 타입에 활용할 수 있다 */
        Application4 app4 = new Application4();
        app4.getRandomAnimal().run();
    }

    /* 다형성을 적용하지 않으면 각각의 동물을 반환하는 메소드를 별도로 작성해야 한다. */
    public Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2);

        return random == 0? new Rabbit() : new Tiger();
    }
}
