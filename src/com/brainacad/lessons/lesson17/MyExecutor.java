package com.brainacad.lessons.lesson17;

public class MyExecutor implements Runnable {
    String taskInfo;

    public MyExecutor(String taskInfo) {
        this.taskInfo = taskInfo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(taskInfo + " _ " + i);
        }

    }
}
