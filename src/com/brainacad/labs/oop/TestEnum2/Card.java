package com.brainacad.labs.oop.TestEnum2;

public class Card {
    Suit cardSuit;
    Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardSuit=" + cardSuit +
                ", cardRank=" + cardRank +
                '}';
    }
}
