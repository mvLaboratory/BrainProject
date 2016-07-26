package com.brainacad.labs.oop.testexcp1;

public class Main {
    public static void main(String[] args) {
        MyTest test = null;
        try {
            //throw new Exception("Yaeeeks");
            test.test();
        }
        catch (MyException e) {
            e.printMessage();
            System.out.println("I'm a law!!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Ha-ha");
        }
    }
}
