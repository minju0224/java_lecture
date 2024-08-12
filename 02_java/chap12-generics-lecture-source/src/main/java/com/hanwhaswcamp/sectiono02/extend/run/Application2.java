package com.hanwhaswcamp.sectiono02.extend.run;

import com.hanwhaswcamp.sectiono02.extend.Bunny;
import com.hanwhaswcamp.sectiono02.extend.MethodFarm;
import com.hanwhaswcamp.sectiono02.extend.Snake;

public class Application2 {
    public static void main(String[] args) {
        /* 메소드 매개변수 제네릭 제약을 사용할 수 있다 */
        MethodFarm methodFarm = new MethodFarm();

        /* 별도의 제약 없음 */
        methodFarm.animalType(new Bunny(), new Snake());

        /* extend Mammal */
//        methodFarm.mammalType(new Snake());
        methodFarm.mammalType(new Bunny());

        /* extend Reptile */
        methodFarm.reptileType(new Snake());
//        methodFarm.reptileType(new Snake());
    }
}
