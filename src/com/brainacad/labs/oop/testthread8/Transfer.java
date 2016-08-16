package com.brainacad.labs.oop.testthread8;

import java.util.Random;

public class Transfer implements Runnable {
    private Bank bank;
    private int from;
    private int max;
    private Random randomizer = new Random();
    private boolean isAlive = true;

    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        this.max = max_amount;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted() && isAlive) {
            synchronized (bank) {
                bank.transfer(from, randomizer.nextInt(bank.getNumberAccounts()), randomizer.nextInt(max));
            }

        }
    }

    public void kill() {
        isAlive = false;
    }
}
