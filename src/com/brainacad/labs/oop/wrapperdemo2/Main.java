package com.brainacad.labs.oop.wrapperdemo2;


public class Main {
    public static void main(String[] args) {
        Long computeResult = (Long) compute(Byte.valueOf((byte)56), Integer.valueOf(560));
        assert computeResult == (56 + 560) : "Invalid computation!";
        System.out.println(computeResult);
    }

    public static Number compute(Number a, Number b) {
        if ((a instanceof Byte || a instanceof Short || a instanceof Integer || a instanceof Long)
                && (b instanceof Byte || b instanceof Short || b instanceof Integer || b instanceof Long)) {

            return a.longValue() + b.longValue();
        }
        else if ((a instanceof Byte || a instanceof Short || a instanceof Integer || a instanceof Long)
                && (b instanceof Float || b instanceof Double)) {
            return a.longValue() + b.doubleValue();
        }
        else if ((a instanceof Float || a instanceof Double)
                && (b instanceof Byte || b instanceof Short || b instanceof Integer || b instanceof Long)) {
            return a.doubleValue() + b.longValue();
        }
        else if ((a instanceof Float || a instanceof Double)
                && (b instanceof Float || b instanceof Double)) {
            return a.doubleValue() + b.doubleValue();
        }

        return 0;
    }
}
