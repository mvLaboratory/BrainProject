package com.brainacad.labs.lab2_2.lab2_3;

public class Employee {
    public void calcSalary(String name, double... salary) {
        double sum = 0;
        for(double salaryEll : salary) {
            sum += salaryEll;
        }

        System.out.println(name + " : " + sum);
    }
}
