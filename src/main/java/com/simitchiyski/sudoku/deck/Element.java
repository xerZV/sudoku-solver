package com.simitchiyski.sudoku.deck;

import static java.util.Objects.nonNull;

public final class Element {
    private final int row;
    private final int column;
    private Integer value;

    public Element(int row, int column) {
        if (row < 1 || row > 9 || column < 1 || column > 9) {
            throw new IllegalArgumentException("row and column cannot be less than 1 and greater than 9");
        }

        this.row = row;
        this.column = column;
    }

    public Element(int row, int column, final Integer value) {
        if (row < 1 || row > 9 || column < 1 || column > 9 || (nonNull(value) && (value < 1 || value > 9))) {
            throw new IllegalArgumentException("row, column and value cannot be less than 1 and greater than 9");
        }

        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Integer getValue() {
        return value;
    }

    void setValue(final Integer value) {
        this.value = value;
    }

    void clear() {
        this.value = null;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Element element = (Element) o;

        if (getRow() != element.getRow()) return false;
        if (getColumn() != element.getColumn()) return false;
        return getValue() != null ? getValue().equals(element.getValue()) : element.getValue() == null;
    }

    @Override
    public int hashCode() {
        int result = (row + "" + column).hashCode();
        result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{" + "[" + row + ":" + column + "]" + "=" + value + "}";
    }
}
