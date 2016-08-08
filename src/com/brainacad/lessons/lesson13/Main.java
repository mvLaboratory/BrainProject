package com.brainacad.lessons.lesson13;

public class Main {
    int x = 10;

    public void doJob() {
        int y = 100;

        class localClass {
            void test() {
                //y = 200;
                System.out.println(y);
            }
        }
//        y++;
        System.out.println("Main");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.x = 15;
    }

    public static class Boat {
        public void doJob() {
            System.out.println("Boat");
        }
        public void test() {
            Main m = new Main();
            m.doJob();
        }
    }
}
