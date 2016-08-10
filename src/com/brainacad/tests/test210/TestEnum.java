package com.brainacad.tests.test210;

/**
 * Created by mv on 10.08.2016.
 */
public enum TestEnum {
    FIRST(1) {
        @Override
        public int getNumber() {
            return 11;
        }

        @Override
        public String toString() {
            return THIRD.toString();
        }
    },
    SECOND(2),
    THIRD(3) {
        @Override
        public String toString() {
            return "$classname{}";
        }
    },
    FOURTH(4);

    private int number;

    TestEnum(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
