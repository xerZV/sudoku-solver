package com.simitchiyski.sudoku.deck;

public class DeckHelper {
    public static Deck getSampleEasyDeck() {
        final Deck deck = new Deck();

        deck.setElementValue(1, 3, 9);
        deck.setElementValue(1, 4, 4);
        deck.setElementValue(1, 8, 6);
        deck.setElementValue(1, 9, 8);

        deck.setElementValue(2, 1, 8);
        deck.setElementValue(2, 3, 6);
        deck.setElementValue(2, 4, 9);
        deck.setElementValue(2, 6, 5);
        deck.setElementValue(2, 7, 3);
        deck.setElementValue(2, 9, 2);

        deck.setElementValue(3, 1, 5);
        deck.setElementValue(3, 3, 2);
        deck.setElementValue(3, 5, 8);
        deck.setElementValue(3, 6, 3);
        deck.setElementValue(3, 8, 9);
        deck.setElementValue(3, 9, 7);

        deck.setElementValue(4, 7, 6);

        deck.setElementValue(5, 2, 8);
        deck.setElementValue(5, 4, 7);
        deck.setElementValue(5, 6, 4);

        deck.setElementValue(6, 1, 6);
        deck.setElementValue(6, 2, 2);
        deck.setElementValue(6, 3, 1);
        deck.setElementValue(6, 4, 5);
        deck.setElementValue(6, 5, 9);
        deck.setElementValue(6, 7, 7);
        deck.setElementValue(6, 8, 3);

        deck.setElementValue(7, 3, 3);
        deck.setElementValue(7, 6, 1);
        deck.setElementValue(7, 7, 9);
        deck.setElementValue(7, 8, 2);

        deck.setElementValue(8, 5, 4);
        deck.setElementValue(8, 7, 8);
        deck.setElementValue(8, 8, 5);

        deck.setElementValue(9, 2, 1);
        deck.setElementValue(9, 5, 5);
        deck.setElementValue(9, 6, 6);
        deck.setElementValue(9, 7, 4);

        return deck;
    }
    
    public static Deck getSampleEasySolvedDeck() {
        final Deck deck = new Deck();

        deck.setElementValue(1, 1, 1);
        deck.setElementValue(1, 2, 3);
        deck.setElementValue(1, 3, 9);
        deck.setElementValue(1, 4, 4);
        deck.setElementValue(1, 5, 2);
        deck.setElementValue(1, 6, 7);
        deck.setElementValue(1, 7, 5);
        deck.setElementValue(1, 8, 6);
        deck.setElementValue(1, 9, 8);

        deck.setElementValue(2, 1, 8);
        deck.setElementValue(2, 2, 7);
        deck.setElementValue(2, 3, 6);
        deck.setElementValue(2, 4, 9);
        deck.setElementValue(2, 5, 1);
        deck.setElementValue(2, 6, 5);
        deck.setElementValue(2, 7, 3);
        deck.setElementValue(2, 8, 4);
        deck.setElementValue(2, 9, 2);

        deck.setElementValue(3, 1, 5);
        deck.setElementValue(3, 2, 4);
        deck.setElementValue(3, 3, 2);
        deck.setElementValue(3, 4, 6);
        deck.setElementValue(3, 5, 8);
        deck.setElementValue(3, 6, 3);
        deck.setElementValue(3, 7, 1);
        deck.setElementValue(3, 8, 9);
        deck.setElementValue(3, 9, 7);

        deck.setElementValue(4, 1, 7);
        deck.setElementValue(4, 2, 9);
        deck.setElementValue(4, 3, 4);
        deck.setElementValue(4, 4, 1);
        deck.setElementValue(4, 5, 3);
        deck.setElementValue(4, 6, 2);
        deck.setElementValue(4, 7, 6);
        deck.setElementValue(4, 8, 8);
        deck.setElementValue(4, 9, 5);

        deck.setElementValue(5, 1, 3);
        deck.setElementValue(5, 2, 8);
        deck.setElementValue(5, 3, 5);
        deck.setElementValue(5, 4, 7);
        deck.setElementValue(5, 5, 6);
        deck.setElementValue(5, 6, 4);
        deck.setElementValue(5, 7, 2);
        deck.setElementValue(5, 8, 1);
        deck.setElementValue(5, 9, 9);

        deck.setElementValue(6, 1, 6);
        deck.setElementValue(6, 2, 2);
        deck.setElementValue(6, 3, 1);
        deck.setElementValue(6, 4, 5);
        deck.setElementValue(6, 5, 9);
        deck.setElementValue(6, 6, 8);
        deck.setElementValue(6, 7, 7);
        deck.setElementValue(6, 8, 3);
        deck.setElementValue(6, 9, 4);

        deck.setElementValue(7, 1, 4);
        deck.setElementValue(7, 2, 5);
        deck.setElementValue(7, 3, 3);
        deck.setElementValue(7, 4, 8);
        deck.setElementValue(7, 5, 7);
        deck.setElementValue(7, 6, 1);
        deck.setElementValue(7, 7, 9);
        deck.setElementValue(7, 8, 2);
        deck.setElementValue(7, 9, 6);

        deck.setElementValue(8, 1, 2);
        deck.setElementValue(8, 2, 6);
        deck.setElementValue(8, 3, 7);
        deck.setElementValue(8, 4, 3);
        deck.setElementValue(8, 5, 4);
        deck.setElementValue(8, 6, 9);
        deck.setElementValue(8, 7, 8);
        deck.setElementValue(8, 8, 5);
        deck.setElementValue(8, 9, 1);

        deck.setElementValue(9, 1, 9);
        deck.setElementValue(9, 2, 1);
        deck.setElementValue(9, 3, 8);
        deck.setElementValue(9, 4, 2);
        deck.setElementValue(9, 5, 5);
        deck.setElementValue(9, 6, 6);
        deck.setElementValue(9, 7, 4);
        deck.setElementValue(9, 8, 7);
        deck.setElementValue(9, 9, 3);

        return deck;
    }

    public static Deck getSampleHardDeck() {
        final Deck deck = new Deck();

        deck.setElementValue(1, 8, 7);
        deck.setElementValue(1, 9, 3);

        deck.setElementValue(2, 2, 8);
        deck.setElementValue(2, 4, 6);
        deck.setElementValue(2, 7, 5);

        deck.setElementValue(3, 2, 1);
        deck.setElementValue(3, 6, 7);
        deck.setElementValue(3, 9, 6);

        deck.setElementValue(4, 1, 1);
        deck.setElementValue(4, 5, 4);
        deck.setElementValue(4, 7, 6);

//        deck.setElementValue(5, 2, 8);
//        deck.setElementValue(5, 4, 7);
//        deck.setElementValue(5, 6, 4);

        deck.setElementValue(6, 2, 2);
        deck.setElementValue(6, 4, 5);
        deck.setElementValue(6, 7, 9);

        deck.setElementValue(7, 1, 3);
        deck.setElementValue(7, 4, 7);

        deck.setElementValue(8, 1, 4);
        deck.setElementValue(8, 6, 5);
        deck.setElementValue(8, 7, 3);
        deck.setElementValue(8, 8, 9);

        deck.setElementValue(9, 1, 9);
        deck.setElementValue(9, 4, 2);
        deck.setElementValue(9, 7, 1);

        return deck;
    }

    public static Deck getSampleHardSolvedDeck() {
        final Deck deck = new Deck();

        deck.setElementValue(1, 1, 6);
        deck.setElementValue(1, 2, 9);
        deck.setElementValue(1, 3, 5);
        deck.setElementValue(1, 4, 4);
        deck.setElementValue(1, 5, 1);
        deck.setElementValue(1, 6, 8);
        deck.setElementValue(1, 7, 2);
        deck.setElementValue(1, 8, 7);
        deck.setElementValue(1, 9, 3);

        deck.setElementValue(2, 1, 7);
        deck.setElementValue(2, 2, 8);
        deck.setElementValue(2, 3, 4);
        deck.setElementValue(2, 4, 6);
        deck.setElementValue(2, 5, 2);
        deck.setElementValue(2, 6, 3);
        deck.setElementValue(2, 7, 5);
        deck.setElementValue(2, 8, 1);
        deck.setElementValue(2, 9, 9);

        deck.setElementValue(3, 1, 2);
        deck.setElementValue(3, 2, 1);
        deck.setElementValue(3, 3, 3);
        deck.setElementValue(3, 4, 9);
        deck.setElementValue(3, 5, 5);
        deck.setElementValue(3, 6, 7);
        deck.setElementValue(3, 7, 8);
        deck.setElementValue(3, 8, 4);
        deck.setElementValue(3, 9, 6);

        deck.setElementValue(4, 1, 1);
        deck.setElementValue(4, 2, 3);
        deck.setElementValue(4, 3, 7);
        deck.setElementValue(4, 4, 8);
        deck.setElementValue(4, 5, 4);
        deck.setElementValue(4, 6, 9);
        deck.setElementValue(4, 7, 6);
        deck.setElementValue(4, 8, 5);
        deck.setElementValue(4, 9, 2);

        deck.setElementValue(5, 1, 5);
        deck.setElementValue(5, 2, 4);
        deck.setElementValue(5, 3, 9);
        deck.setElementValue(5, 4, 3);
        deck.setElementValue(5, 5, 6);
        deck.setElementValue(5, 6, 2);
        deck.setElementValue(5, 7, 7);
        deck.setElementValue(5, 8, 8);
        deck.setElementValue(5, 9, 1);

        deck.setElementValue(6, 1, 8);
        deck.setElementValue(6, 2, 2);
        deck.setElementValue(6, 3, 6);
        deck.setElementValue(6, 4, 5);
        deck.setElementValue(6, 5, 7);
        deck.setElementValue(6, 6, 1);
        deck.setElementValue(6, 7, 9);
        deck.setElementValue(6, 8, 3);
        deck.setElementValue(6, 9, 4);

        deck.setElementValue(7, 1, 3);
        deck.setElementValue(7, 2, 5);
        deck.setElementValue(7, 3, 1);
        deck.setElementValue(7, 4, 7);
        deck.setElementValue(7, 5, 9);
        deck.setElementValue(7, 6, 6);
        deck.setElementValue(7, 7, 4);
        deck.setElementValue(7, 8, 2);
        deck.setElementValue(7, 9, 8);

        deck.setElementValue(8, 1, 4);
        deck.setElementValue(8, 2, 6);
        deck.setElementValue(8, 3, 2);
        deck.setElementValue(8, 4, 1);
        deck.setElementValue(8, 5, 8);
        deck.setElementValue(8, 6, 5);
        deck.setElementValue(8, 7, 3);
        deck.setElementValue(8, 8, 9);
        deck.setElementValue(8, 9, 7);

        deck.setElementValue(9, 1, 9);
        deck.setElementValue(9, 2, 7);
        deck.setElementValue(9, 3, 8);
        deck.setElementValue(9, 4, 2);
        deck.setElementValue(9, 5, 3);
        deck.setElementValue(9, 6, 4);
        deck.setElementValue(9, 7, 1);
        deck.setElementValue(9, 8, 6);
        deck.setElementValue(9, 9, 5);

        return deck;
    }

    public static Deck getSampleEvilDeck() {
        final Deck deck = new Deck();

        deck.setElementValue(1, 2, 6);
        deck.setElementValue(1, 5, 1);

        deck.setElementValue(2, 1, 3);
        deck.setElementValue(2, 4, 6);
        deck.setElementValue(2, 6, 8);
        deck.setElementValue(2, 9, 9);

        deck.setElementValue(3, 5, 2);
        deck.setElementValue(3, 8, 8);

        deck.setElementValue(4, 3, 4);
        deck.setElementValue(4, 9, 1);

        deck.setElementValue(5, 2, 7);
        deck.setElementValue(5, 4, 8);
        deck.setElementValue(5, 6, 3);
        deck.setElementValue(5, 8, 4);

        deck.setElementValue(6, 6, 2);

        deck.setElementValue(7, 1, 9);
        deck.setElementValue(7, 7, 5);

        deck.setElementValue(8, 2, 3);
        deck.setElementValue(8, 4, 7);
        deck.setElementValue(8, 6, 4);
        deck.setElementValue(8, 8, 1);

        deck.setElementValue(9, 5, 6);

        return deck;
    }

    public static Deck getSampleEvilSolvedDeck() {
        final Deck deck = new Deck();

        deck.setElementValue(1, 1, 8);
        deck.setElementValue(1, 2, 6);
        deck.setElementValue(1, 3, 2);
        deck.setElementValue(1, 4, 4);
        deck.setElementValue(1, 5, 1);
        deck.setElementValue(1, 6, 9);
        deck.setElementValue(1, 7, 7);
        deck.setElementValue(1, 8, 5);
        deck.setElementValue(1, 9, 3);

        deck.setElementValue(2, 1, 3);
        deck.setElementValue(2, 2, 1);
        deck.setElementValue(2, 3, 7);
        deck.setElementValue(2, 4, 6);
        deck.setElementValue(2, 5, 5);
        deck.setElementValue(2, 6, 8);
        deck.setElementValue(2, 7, 4);
        deck.setElementValue(2, 8, 2);
        deck.setElementValue(2, 9, 9);

        deck.setElementValue(3, 1, 4);
        deck.setElementValue(3, 2, 5);
        deck.setElementValue(3, 3, 9);
        deck.setElementValue(3, 4, 3);
        deck.setElementValue(3, 5, 2);
        deck.setElementValue(3, 6, 7);
        deck.setElementValue(3, 7, 1);
        deck.setElementValue(3, 8, 8);
        deck.setElementValue(3, 9, 6);

        deck.setElementValue(4, 1, 2);
        deck.setElementValue(4, 2, 8);
        deck.setElementValue(4, 3, 4);
        deck.setElementValue(4, 4, 5);
        deck.setElementValue(4, 5, 7);
        deck.setElementValue(4, 6, 6);
        deck.setElementValue(4, 7, 3);
        deck.setElementValue(4, 8, 9);
        deck.setElementValue(4, 9, 1);

        deck.setElementValue(5, 1, 1);
        deck.setElementValue(5, 2, 7);
        deck.setElementValue(5, 3, 6);
        deck.setElementValue(5, 4, 8);
        deck.setElementValue(5, 5, 9);
        deck.setElementValue(5, 6, 3);
        deck.setElementValue(5, 7, 2);
        deck.setElementValue(5, 8, 4);
        deck.setElementValue(5, 9, 5);

        deck.setElementValue(6, 1, 5);
        deck.setElementValue(6, 2, 9);
        deck.setElementValue(6, 3, 3);
        deck.setElementValue(6, 4, 1);
        deck.setElementValue(6, 5, 4);
        deck.setElementValue(6, 6, 2);
        deck.setElementValue(6, 7, 6);
        deck.setElementValue(6, 8, 7);
        deck.setElementValue(6, 9, 8);

        deck.setElementValue(7, 1, 9);
        deck.setElementValue(7, 2, 4);
        deck.setElementValue(7, 3, 8);
        deck.setElementValue(7, 4, 2);
        deck.setElementValue(7, 5, 3);
        deck.setElementValue(7, 6, 1);
        deck.setElementValue(7, 7, 5);
        deck.setElementValue(7, 8, 6);
        deck.setElementValue(7, 9, 7);

        deck.setElementValue(8, 1, 6);
        deck.setElementValue(8, 2, 3);
        deck.setElementValue(8, 3, 5);
        deck.setElementValue(8, 4, 7);
        deck.setElementValue(8, 5, 8);
        deck.setElementValue(8, 6, 4);
        deck.setElementValue(8, 7, 9);
        deck.setElementValue(8, 8, 1);
        deck.setElementValue(8, 9, 2);

        deck.setElementValue(9, 1, 7);
        deck.setElementValue(9, 2, 2);
        deck.setElementValue(9, 3, 1);
        deck.setElementValue(9, 4, 9);
        deck.setElementValue(9, 5, 6);
        deck.setElementValue(9, 6, 5);
        deck.setElementValue(9, 7, 8);
        deck.setElementValue(9, 8, 3);
        deck.setElementValue(9, 9, 4);

        return deck;
    }
}
