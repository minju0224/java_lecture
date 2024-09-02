package com.hanwhaswcamp.section03.snyc;

public class Buffer {
    private int date;
    private boolean empty = true;

    public synchronized void getDate() {
        if(empty) {
            System.out.println("getDate wait");

            try {
                /* 실행 중인 스레드를 일시 정지 시킨다. 다른 스레드에서 notfiy()가 호출 되면 깨어난다. */
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println("소비자 : "+date+"빈 상품을 소비하였습니다. ");
        empty = true;

        /* 대기 중인 스레드를 하나 깨워서 다시 대기 상태로 전환 시킨다 */
        notify();
    }

    public synchronized void setDate(int date) {
        if(!empty){
            System.out.println("setDate wait");
            try{
                /* 실행 중인 스레드를 일시 정지 시킨다. 다른 스레드에서 nofiy()가 호출 되면 깨어난다. */
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        this.date = date;
        System.out.println("생산자 : "+date+"번 상품을 생산 하였습니다. ");
        /* 대기 중인 스레드를 하나 깨워서 다시 대기 상태로 전환 시킨다 */
        notify();
    }
}
