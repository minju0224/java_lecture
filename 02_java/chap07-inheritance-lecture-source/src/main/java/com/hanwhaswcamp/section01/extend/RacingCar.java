package com.hanwhaswcamp.section01.extend;

public class RacingCar extends Car {
    @Override
    public void stop() {
        //  부모 객쳋의 주소가 담겨있는 super()
        super.stop();
        System.out.println("레이싱카가 전속력으로 질주합니다");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("레이싱카가 멈춥니다");
    }

    @Override
    public void soundHorn() {
        super.soundHorn();
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
    }
}
