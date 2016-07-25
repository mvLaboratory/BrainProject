package com.brainacad.tests.test28;

interface Jumpable {
    void jump(); }

class Chair implements Jumpable {

    public void jump() {

        System.out.println("Chair cannot jump");

    }

}