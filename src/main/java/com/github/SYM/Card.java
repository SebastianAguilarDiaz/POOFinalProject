package com.github.SYM;

public abstract class Card {
    private char[][] back;
    protected char[][] front;

    public static final int NUMERIC = 1;
    public static final int REVERSE = 2;
    public static final int TAKE_X = 3;
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private boolean upwards;
    protected Board b;
    private int cardType;

    public Card(Board b) {
    }

    public void show() {
    }


    public abstract void throwIt();

    public abstract void setFront();

    public int getCardType() {
        return 0;
    }

    public void flipCard() {
    }

    public boolean getUpwards() {
        return false;
    }

    public char getChar(int i, int j) {
        return ' ';
    }
}