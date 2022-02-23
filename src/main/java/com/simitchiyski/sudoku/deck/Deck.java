package com.simitchiyski.sudoku.deck;

import static java.util.Arrays.deepEquals;
import static java.util.Arrays.deepHashCode;
import static java.util.Objects.*;

public final class Deck {
    private final Element[][] content;

    public Deck() {
        this.content = new Element[9][9];

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                content[row][column] = new Element(row + 1, column + 1);
            }
        }
    }

    public Deck(final Element[][] content) {
        requireNonNull(content);

        this.content = content;
    }

    public void setElementValue(int row, int column, final Integer value) {
        if (row < 1 || row > 9 || column < 1 || column > 9 || (nonNull(value) && (value < 1 || value > 9))) {
            throw new IllegalArgumentException("row, column and value cannot be less than 1 and greater than 9");
        }

        content[row - 1][column - 1].setValue(value);
    }

    Element[][] getContent() {
        return content;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Deck deck = (Deck) o;

        return deepEquals(getContent(), deck.getContent());
    }

    @Override
    public int hashCode() {
        return deepHashCode(getContent());
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        for (int row = 0; row < 9; row++) {
            stringBuilder.append('|');
            for (int column = 0; column < 9; column++) {
                final Integer value = content[row][column].getValue();
                stringBuilder.append(isNull(value) ? " " : value);
                stringBuilder.append('|');
            }

            if (row < 8) stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
