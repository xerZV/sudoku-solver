package com.simitchiyski.sudoku.deck;

import org.junit.jupiter.api.Test;

import static com.simitchiyski.sudoku.deck.DeckHelper.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DeckSolverTest {

    @Test
    void solveEasy() {
        final Deck solved = new DeckSolver(getSampleEasyDeck()).solve();
        assertNotNull(solved);
        System.out.println(solved);
        assertEquals(getSampleEasySolvedDeck(), solved);
    }

    @Test
    void solveHard() {
        final Deck solved = new DeckSolver(getSampleHardDeck()).solve();
        assertNotNull(solved);
        System.out.println(solved);
        assertEquals(getSampleHardSolvedDeck(), solved);
    }

    @Test
    void solveEvil() {
        final Deck solved = new DeckSolver(getSampleEvilDeck()).solve();
        assertNotNull(solved);
        System.out.println(solved);
        assertEquals(getSampleEvilSolvedDeck(), solved);
    }
}
