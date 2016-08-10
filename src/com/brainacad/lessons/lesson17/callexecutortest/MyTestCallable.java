package com.brainacad.lessons.lesson17.callexecutortest;

import java.util.concurrent.Callable;

public class MyTestCallable implements Callable<String> {
    private int workNumber;

    public MyTestCallable(int workNumber) {
        this.workNumber = workNumber;
    }

    @Override
    public String call() throws Exception {

        for (int i = 0; i < 5; i++) {
            System.out.printf("Work %d: %d\n", workNumber, i);
        }

        try {
            Thread.sleep((int) Math.random() * 1000);
        } catch (InterruptedException e) {

        }
        return "work" + workNumber;
    }
}
