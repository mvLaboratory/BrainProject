package com.brainacad.lessons.lesson9;

public class Main {

    public static void main(String[] args) {
        SportCar bolid = new SportCar(0);
        SportCar bolid1 = new SportCar(1);
        SportCar bolid2 = new SportCar(2);
        SportCar bolid3 = new SportCar(3);
        SportCar bolid4 = new SportCar(4);
        bolid.printSome();
        System.out.println(bolid.hashCode());
        bolid = null;
        bolid4 = null;
//
//        SportCar[] arr= new SportCar[900000];
//        for (int i = 0; i < 900000; i++) {
//            arr[i] = new SportCar( i + 5);
//        }

//        System.out.println(bolid2.equals(bolid3));
//
//        System.out.println(bolid2);

        Car bolidN = new SportCar(-1);
        bolidN.method1();
        Truck tr = (Truck) bolidN;


       // System.out.println(bolidN.data);

//        System.out.println("sleeping...");
//
//        try {
//            Thread.sleep(1000);
//        }
//        catch (InterruptedException e) {
//
//        }

        System.out.println("finish");
    }
}
