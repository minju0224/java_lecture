package com.hanwhaswcamp.polymorphism;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("호랑이는 고기를 먹습니다");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 어슬렁 어슬렁");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 어흥");
    }

    public void bite(){
        System.out.println("호랑이가 물어 뜯");
    }
}
