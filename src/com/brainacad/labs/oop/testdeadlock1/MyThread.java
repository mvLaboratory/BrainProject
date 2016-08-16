package com.brainacad.labs.oop.testdeadlock1;

public class MyThread extends Thread {
    private MyObject obj;
    private MyObject obj2;

    public MyThread(MyObject obj, MyObject obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj) {
            System.out.println("Holding " + obj.getName());

            try{
                sleep(100);
            }
            catch(InterruptedException e) {}

            System.out.println("Waiting for " + obj2.getName());

            synchronized (obj2) {
                System.out.println("Holding " + obj.getName() + " and " + obj2.getName());
            }
        }
    }
}
