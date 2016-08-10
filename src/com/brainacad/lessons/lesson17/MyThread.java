package com.brainacad.lessons.lesson17;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int  i = 0;
        while (!isInterrupted()) {
            System.out.println(getName()+ " - " + ++i);
            try {
                sleep(100);
            }
            catch (InterruptedException e) {
                return;
            }
        }
    }
}
