package com.hanwhaswcamp.interfaceimplements;
/* 인터페이스는 인터페이스를 상속할 수 있다 . 이 때는 extends라는 키워드를 사용한다
* 클래스 extends 클래스 -> 단일 상속
* 클래스 implements 인터페이스1, 인터페이스2 -> 다중 상속
* 인터페이스 extends 인터페이스1, 인터페이스2 -> 다중 상속*/
public interface InterProduct {
    int MIN_NUM = 0;
    int MAX_NUM = 0;

    /*인터페이스는 생성자를 가질 수 없다*/
//    public InterProduct() {}

    /* 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다.*/
//    public void nonStaticMethod(){}

    /* 추상 메서드만 작성이 가능하다
    * 목시적으로 public abstract의 의미를 가진다.*/
    public abstract void nonStaticMethod();
    void abstMethod();

    /*static 메소드는 작성 가능하다 (jdk 1.8 v추가)*/
    public static void staticMethod() {
        System.out.println("interproductt 인터페이스의 staticMethod 호출");
    }

    /*default 키워드를 사용하면 non-static 메소드로 작성 가능하다 (jdk 1.8 v추가)
    * default 메소드는 완성이 되어 있으므로 오버라이딩이 강제화 되지 않는다.
    * (일반적으로 {} 만 작성하고 내용을 비워놓는다.) */
    public default void defaultMethod() {
        System.out.println("interproductt 인터페이스의 defaultMethod 호출");
    }
}
