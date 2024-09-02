package com.hanwhaswcamp.section02.deamonthread;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 일반 스레드는 다른 스레드가 종료 되어도 본인의 작업을 마처 실행한다.
        * 데몬 스레드로 생성한 스레드는 다른 스레드가 모두 종료 되면 함께 종료 된다. */

        Thread t = new Thread(() ->{
           for (int i = 10; i < 0; i++) {
               System.out.println(i);
               try {
                   Thread.sleep(i);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        /*  setDeamon() 메소드로 데몬 스레드 설정을 할 수 있으며 Start() 이전에 설정해야한다*/
        t.setDaemon(true);
        t.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("카운트 다운을 멈추려면 아무 키나 입력하새요");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println("main end ===============");
    }
}
