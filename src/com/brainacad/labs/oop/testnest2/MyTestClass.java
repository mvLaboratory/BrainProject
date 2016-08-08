package com.brainacad.labs.oop.testnest2;

public class MyTestClass {
    int out = 15;
    static int out2 = 15;
    public void test() {
        int out1 = 5;

        System.out.println("outer test");
        class MyLocal {
            int c = 3;
            public void tst() {
                System.out.println(out + " " + out1);
            }
        }

        MyLocal m4 = new MyLocal();
        m4.tst();
    }

    public static class MyStaticNested {
        int a = 1;
        public void tst() {
            System.out.println(out2 + " ");
        }
    }

    public class MyInner {
        int b = 2;
        public void tst() {
            System.out.println(out + " " + out2);
        }
    }
}
