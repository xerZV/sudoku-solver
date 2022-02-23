package com.simitchiyski.sudoku.deck;

import static java.lang.Boolean.FALSE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public final class DeckSolver {
    private final boolean debug = false;
    private final Deck deck;

    public DeckSolver(final Deck deck) {
        this.deck = deck;
    }

    public Deck solve() {
        final boolean solved = solve(deck.getContent());

        if (!solved) {
            if (debug) {
                System.out.println("Current deck state");
                System.out.println(deck);
            }
            throw new RuntimeException("The board cannot be solved");
        }

        return deck;
    }

    private boolean solve(final Element[][] content) {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                final Element element = content[row][column];
                if (isNull(element.getValue())) {
                    if (debug) {
                        System.out.println("should fine value for element=" + element);
                    }

                    return guessElement(content, row, column);
                }
            }
        }

        return true;
    }

    private boolean guessElement(final Element[][] content, int row, int column) {
        for (int guess = 1; guess <= 9; guess++) {
            final Element element = content[row][column];
            element.setValue(guess);

            if (validate(content, row, column) && solve(content)) {
                return true;
            }

            element.clear();
        }

        return false;
    }

    private boolean validate(final Element[][] content, final int row, int column) {
        return validateRow(content, row) && validateColumn(content, column) && validateSubMatrix(content, row, column);
    }

    private boolean validateRow(final Element[][] content, final int row) {
        final boolean[] hasRequiredValues = new boolean[9]; // values from 1 to 9 represented in boolean array

        boolean valid = true;
        for (int column = 0; column < 9; column++) {
            valid = valid && validate(content, row, column, hasRequiredValues);
        }

        return valid;
    }

    private boolean validateColumn(final Element[][] content, final int column) {
        final boolean[] hasRequiredValues = new boolean[9]; // values from 1 to 9 represented in boolean array

        boolean valid = true;
        for (int row = 0; row < 9; row++) {
            valid = valid && validate(content, row, column, hasRequiredValues);
        }

        return valid;
    }

    private boolean validateSubMatrix(final Element[][] content, final int row, final int column) {
        final boolean[] hasRequiredValues = new boolean[9]; // values from 1 to 9 represented in boolean array

        final int subMatrixRowStartIndex = (row / 3) * 3;
        final int subMatrixColumnStartIndex = (column / 3) * 3;
        for (int subMatrixRow = subMatrixRowStartIndex; subMatrixRow < subMatrixRowStartIndex + 3; subMatrixRow++) {
            for (int subMatrixColumn = subMatrixColumnStartIndex; subMatrixColumn < subMatrixColumnStartIndex + 3; subMatrixColumn++) {
                if (!validate(content, subMatrixRow, subMatrixColumn, hasRequiredValues)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * null elements are considered valid.
     * For each element we check the corresponding boolean value in the hasRequiredValues.
     * If the value is already presented - return false - else we set true in hasRequiredValues for the corresponding element value and return true
     *
     * @param content
     * @param row
     * @param column
     * @param hasRequiredValues
     * @return
     */
    private boolean validate(final Element[][] content, final int row, final int column, boolean[] hasRequiredValues) {
        final Element element = content[row][column];

        if (nonNull(element.getValue())) {
            final int valueAsIndex = element.getValue() - 1;

            if (FALSE.equals(hasRequiredValues[valueAsIndex])) {
                hasRequiredValues[valueAsIndex] = true;
            } else {
                return false;
            }
        }

        return true; // null elements are considered valid
    }
}
