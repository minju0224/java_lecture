package com.hanwhaswcamp.section01.generic;
/* 제네릭 선언은 다이아몬드 연산자를 이용하여 작성한다. 영문자는 관례상 대문자로 작성하여  T는 타입 변수라고 부른다.
* 가상으로 존재하는 다입으로 T가 아닌 다른 영문자를 사용해도 무방하며 여려개의 타입 변수를 작성할 때는 , 이용하여 기술할 수 있다. */
public class GenericTest <T> {

    public T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }



}
