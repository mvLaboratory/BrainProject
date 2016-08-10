package com.brainacad.lessons.lesson17;

public class Main {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("First");
        MyThread th2 = new MyThread("Second");

        System.out.println("Start");
        th1.start();
        th2.start();

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finish");

        th1.interrupt();
        th2.interrupt();
    }


}
