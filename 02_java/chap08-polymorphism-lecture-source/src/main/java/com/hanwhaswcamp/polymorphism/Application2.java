package com.hanwhaswcamp.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속 처리할 수 있다 */
        Animal[] animals = new Animal[5];

         animals[0] = new Rabbit();
         animals[1] = new Tiger();
         animals[2] = new Rabbit();
         animals[3] = new Tiger();
         animals[4] = new Rabbit();

         for(Animal animal : animals){
             animal.eat();

             /* 각 인스턴스별 고유 메서드 동작을 위해서는 다운 캐스팅이 명시적으로 필요하다.
             * ClassCastException 방지를 위해 instanceof 연산자 활용 */
             if(animal instanceof Tiger){
                 ((Tiger) animal).bite();
             }else if(animal instanceof Rabbit){
                 ((Rabbit) animal).jump();
             }
         }

    }
}
