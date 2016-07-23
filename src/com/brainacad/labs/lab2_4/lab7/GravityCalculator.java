package com.brainacad.labs.lab2_4.lab7;

public class GravityCalculator {
    public static final double ACCELERATION  = -9.81;
    private static final double initPos = 0, initVelocity = 0;

//    public GravityCalculator(double initPos, double initVelocity) {
//        this.initPos = initPos;
//        this.initVelocity = initVelocity;
//    }
//
//    public double getInitVelocity() {
//        return initVelocity;
//    }
//
//    public void setInitVelocity(double initVelocity) {
//        this.initVelocity = initVelocity;
//    }
//
//    public double getInitPos() {
//        return initPos;
//    }
//
//    public void setInitPos(double initPos) {
//        this.initPos = initPos;
//    }

    public static double calcDist(double t) {
         return (0.5 * ACCELERATION * t * t) + (initVelocity * t) + initPos;
    }
}
