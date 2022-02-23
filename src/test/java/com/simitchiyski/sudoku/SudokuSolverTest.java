package com.simitchiyski.sudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class SudokuSolverTest {
    @Test
    void applicationStartup() {
        assertDoesNotThrow(() -> SudokuSolver.main(null));
    }

}
