package com.hanwhaswcamp.section03.dto;

public class Application {
    public static void main(String[] args) {
        /* 데이터를 추상화하는 기법을 이해하고 이를 사용하여 프로그래밍화 할 수 있다. */

        /*캡슐화의 원칙에서 읿부 어긋나기는 하지만 다른 목적을 가진 클래슬와 객체를 추상화하는 기법이 있다.
        * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객테(Data Transfer Object)의 경우이다.
        * 캡슐화의 원칙에 따라 작성하기는ㄴ 했으나 캡슐화가 의미 없을 정돌로 피ㅣㄹ드면 그래로 상용한 setter, getter
        * 메소드로 인해 유지보수성이 좋지 않다. 단, 미리 모든 필드에 접근 가능성을 염두에 두고 작성  해두는 관레로 인해
        * 현재도 많이 사용 도고 있는 형태*/

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setNumber(1);
        memberDTO.setName("홍길동");
        memberDTO.setAge(20);
        memberDTO.setGender('남');
        memberDTO.setHeight(180.5);
        memberDTO.setWeight(80.6);
        memberDTO.setActivated(true);

        System.out.println(memberDTO.getNumber());
        System.out.println(memberDTO.getName());
        System.out.println(memberDTO.getAge());
        System.out.println(memberDTO.getGender());
        System.out.println(memberDTO.getHeight());
        System.out.println(memberDTO.getWeight());
        System.out.println(memberDTO.isActivated());


    }
}
