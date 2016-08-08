package com.brainacad.labs.oop.TestEnum2;

public class Main {
    public static void main(String[] args) {
        Card[] cardArr = new Card[52];
        int index = 0;
        for (Suit cardSuit : Suit.values())   {
            for (Rank cardRank : Rank.values()) {
                cardArr[index] = new Card(cardSuit, cardRank);
                index++;
            }
        }

        for (Card card : cardArr) {
            System.out.println(card);
        }
    }

}
