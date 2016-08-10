package com.brainacad.lessons.lesson17;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by mv on 10.08.2016.
 */
public class MainExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(5, 10, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());

        MyExecutor[] tasks = new MyExecutor[25];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new MyExecutor("Task " + i);
            tpe.execute(tasks[i]);
        }

        tpe.shutdown();
    }
}
