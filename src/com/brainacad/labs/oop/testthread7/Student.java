package com.brainacad.labs.oop.testthread7;

public class Student implements Runnable {
    private int studentID;
    private DiningHall diningHall;

    public Student(int studentID, DiningHall diningHall) {
        this.studentID = studentID;
        this.diningHall = diningHall;
    }

    @Override
    public void run() {
        synchronized (diningHall) {
            //System.out.print(studentID + ": ");
            diningHall.servePizza();
        }
    }
}
