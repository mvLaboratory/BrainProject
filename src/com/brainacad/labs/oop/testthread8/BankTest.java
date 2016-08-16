package com.brainacad.labs.oop.testthread8;

import java.util.ArrayList;
import java.util.Random;

public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        Bank aval = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Random randomizer = new Random();
        ArrayList<Transfer> trList = new ArrayList<>();

        for (int i = 0; i < N_ACCOUNTS; i++) {
            Transfer tr = new Transfer(aval, i, randomizer.nextInt(INIT_BALANCE));
            new Thread(tr).start();
            trList.add(tr);
        }


        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {

        }

        trList.forEach(Transfer::kill);
    }
}
