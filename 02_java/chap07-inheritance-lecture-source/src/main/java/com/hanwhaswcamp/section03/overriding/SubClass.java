package com.hanwhaswcamp.section03.overriding;

public class SubClass extends SuperClass {

    /* 메소드명, 리턴 차입, 매개변수의 갯수&타입&순서 일치해야 성립*/
    @Override
//    public void method(String num ){ }
//    public int method2(int num ){ return 0;}
//    public void method2(int num ){}
    public void method(int num ){}

    /* private 메소드 오버라이딩 불가 */
//    @Override
//    private void privateMethod(){}

    /* final 메소드 오버라이딩 불가 */
//    @Override
//    public void finalMethod() {}

    /* protected -> default로 변경 시 더 좋은 범위로의 변경이라 불가 */
//    @Override
//    void protectedMethod() {}
    /* protected -> public로 변경 시 더 넓은 범위로의 변경이라 가능*/
    @Override
    public void protectedMethod() {}

}
