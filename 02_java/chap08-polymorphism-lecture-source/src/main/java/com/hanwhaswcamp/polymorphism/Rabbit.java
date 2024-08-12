package com.hanwhaswcamp.polymorphism;

public class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("토끼는 풀을 뜯어 먹습니다");
    }

    @Override
    public void run() {
        System.out.println("토끼가 깡총 깡총");
    }

    @Override
    public void cry() {
        System.out.println("토끼 울음소리 끼익끼익");
    }

    public void jump(){
        System.out.println("토끼가 점프합니다~!");
    }
}
