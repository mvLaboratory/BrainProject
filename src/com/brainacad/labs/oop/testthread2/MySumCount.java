package com.brainacad.labs.oop.testthread2;

public class MySumCount implements Runnable {
    private String name;
    private int startIndex, stopIndex;
    private int[] resultArr;
    private long resultSum;

    public MySumCount(String name, int startIndex, int stopIndex, int[] resultArr) {
        this.name = name;
        setResultArr(resultArr);
        setStartIndex(startIndex);
        setStopIndex(stopIndex);
    }



    @Override
    public void run() {
        if (startIndex > stopIndex || startIndex < 0 || stopIndex >= resultArr.length) {
            System.err.println("Invalid indexes!");
            return;
        }

        System.out.println("Calculating in " + name + ": ");

        for (int i = startIndex; i < stopIndex; i++) {
            resultSum += resultArr[i];
        }
    }

    public long getResultSum() {
        return resultSum;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setResultArr(int[] resulArr) {
        this.resultArr = resulArr;
    }
}
