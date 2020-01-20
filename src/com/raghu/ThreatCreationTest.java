package com.raghu;

public class ThreatCreationTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run(){
                ;
            }
        });

        Thread t2 = new Thread(() -> doWork(1));

        t1.start();
        t2.start();
    }

    private static void doWork(int i){
        while(i <= 10){
            System.out.println(Thread.currentThread().getName()+" is printing..."+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception in thread: "+Thread.currentThread().getName());
            }
            i+=2;
        }
    }
}
