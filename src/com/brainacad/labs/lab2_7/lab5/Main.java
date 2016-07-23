package com.brainacad.labs.lab2_7.lab5;

import com.brainacad.labs.lab2_7.lab4.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Device[] arr = {new Monitor("Samsung", "DF56987", 5300, 640, 480),
                new Monitor("LG", "KK456fg6", 5000, 1024, 900),
                new Monitor("Dell", "AAA6987", 8000, 1840, 1110),
                new EthernetAdapter("TP-Link", "qw12222", 1000, 10, "23frf34rfref432"),
                new EthernetAdapter("Cisco", "33333", 2000, 20, "9ff9fe99aa923566")};

        for (Device dev : arr) {
            System.out.println(dev);
        }
    }
}
