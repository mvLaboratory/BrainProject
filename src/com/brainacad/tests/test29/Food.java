package com.brainacad.tests.test29;

class Popcorn {

    public void pop() {
        System.out.println("popcorn");
    }

    public void sizzle() {

    }
}
class Food {
    Popcorn p = new Popcorn() {
        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
    public static void main(String[] args) {
        Food food = new Food();
        food.p.pop();
        food.p.sizzle();
    }
}
