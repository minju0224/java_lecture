package com.hanwhaswcamp.section02.encapsulation.problem3;
/* api제공하는  측*/
public class Monster {
    /* monster 클래스에 변경 사항이 발생하였다.
    *  name -> kinds로 변경*/
    String name;
    String kinds;
    int hp;

    public void setInfo(String info){
        this.name = info;
    }

    public String getInfo(){
        return "몬스터의 이름은"+this.name+"입니다";
    }
}
