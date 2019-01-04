package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Main thread is started");
        MyThread t = new MyThread("MyThread");
        t.start();

        try {
            Thread.sleep(1100);
            t.disabled();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread finished");
    }
}
