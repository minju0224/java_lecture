package com.hanwhaswcamp.section05.typcasting;

public class Application4 {
    public static void main(String[] args) {
        // 데이터 손실

        int inum = 290;
        byte bnum = (byte) inum;
        System.out.println("inum = " + inum);
        System.out.println("bnum = "+ bnum);

        /*의도한 데이터 손실*/
        double height = 175.5;
        int floorHeight = (int) height;

        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight);		//소수점 절삭에 이용할 수 있다.
    }
}
