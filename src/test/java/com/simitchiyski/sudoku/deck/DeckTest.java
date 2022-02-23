package com.simitchiyski.sudoku.deck;

import org.junit.jupiter.api.Test;

import static com.simitchiyski.sudoku.deck.DeckHelper.getSampleEasyDeck;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DeckTest {

    @Test
    void matrixPrint() {
        final Deck deck = getSampleEasyDeck();

        final String expectedPrint = """
                | | |9|4| | | |6|8|
                |8| |6|9| |5|3| |2|
                |5| |2| |8|3| |9|7|
                | | | | | | |6| | |
                | |8| |7|4| | | | |
                |6|2|1|5|9| |7|3| |
                | | |3| | |1|9|2| |
                | | | | |4| |8|5| |
                | |1| | |5|6|4| | |""";

        final String matrixPrint = deck.toString();
        System.out.println(matrixPrint);

        assertEquals(expectedPrint, matrixPrint);
    }
}
