package com.brainacad.tests.test25;

/**
 * Created by mv on 15.07.2016.
 */
public class Test {

    public static void main(String [] args){

        Foo.s = "Bye!";

        System.out.print(Foo.s);

    }

}

class Foo{

    static String s = "Hi!";

}