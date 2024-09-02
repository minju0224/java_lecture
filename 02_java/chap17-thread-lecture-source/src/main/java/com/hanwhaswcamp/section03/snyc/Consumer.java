package com.hanwhaswcamp.section03.snyc;

public class Consumer extends Thread{
    private final Buffer criticalDate;

    public Consumer(Buffer criticalDate) {
        this.criticalDate = criticalDate;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            criticalDate.getDate();;

            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
