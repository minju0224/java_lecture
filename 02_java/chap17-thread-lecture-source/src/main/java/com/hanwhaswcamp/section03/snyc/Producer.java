package com.hanwhaswcamp.section03.snyc;

/* 공유 데이터에 값을 생산하는 역할 */
public class Producer extends Thread{
    private final Buffer criticalDate;

    public Producer(Buffer criticalDate) {
        this.criticalDate = criticalDate;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            criticalDate.setDate(i);;

            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
