package com.brainacad.labs.oop.testforkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
    private int[] data;

    public MyRecursiveTask(int[] data) {
        this.data = data;
    }

    @Override
    protected Integer compute() {
        int firstHalfResult;
        int secondHalfResult;
        int result = 0;

        if (data.length < 5) {
            for (int aData : data) {
                result += aData;
            }
        }
        else
        {
            int dataHalfBound = data.length / 2;
            int[] firstDataHalf = new int[dataHalfBound];
            System.arraycopy(data, 0, firstDataHalf, 0, dataHalfBound);

//            firstHalfResult = new MyRecursiveTask(firstDataHalf);
            MyRecursiveTask firstHalfTask = new MyRecursiveTask(firstDataHalf);
            firstHalfTask.fork();

            int secondDataHalfBound = data.length - dataHalfBound;
            int[] secondDataHalf = new int[secondDataHalfBound];

            System.arraycopy(data, dataHalfBound, secondDataHalf, 0, secondDataHalfBound);
            secondHalfResult = new MyRecursiveTask(secondDataHalf).compute();

            result = firstHalfTask.join() + secondHalfResult;
        }

        return result;
    }
}
