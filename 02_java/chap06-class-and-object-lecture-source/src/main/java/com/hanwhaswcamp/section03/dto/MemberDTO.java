package com.hanwhaswcamp.section03.dto;
/* DTO(Data Transfer Object)*/
public class MemberDTO {
    /* 취급ㅂ하려고 하는 회원 정보를 고려해서 필드를  작성한다.
    * 값 객체가 가지는 속성을 추출하는 과정 또한 추상화라고 볼 수 있다*/

    private int number;				    	//회원번호
    private String name;				    //회원명
    private int age;					      //나이
    private char gender;				    //성별
    private double height;			  	//키
    private double weight;			  	//몸무게
    private boolean isActivated;		//회원탈퇴여부(활성화여부)

    /* 필드에 private 접그 제하자를 설정하게 도면 public으로 접근을 허용하는 사용자. 설정자.접근자 메소드를  통해 간접 접근이 필요하다*/

    /* 설정자 (settere) */


    /* 접근자 (getter) */

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
