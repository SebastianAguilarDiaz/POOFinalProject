package com.github.SYM;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    private ArrayList<Player> players;
    private ArrayList<Card> generalDeck;
    private int cardsInGeneralDeck = 100;
    private int cardsPerPlayer = 7;
    private int flow = 1;
    private int actualPlayerIndex;
    private ArrayList<ArrayList<Card>> playersDecks;
    private Card lastCard;

    public Board(Scanner sc, ArrayList<Player> players) {
    }

    public void makeDecks() {
    }

    public void changeFlow() {
    }

    public void addCardsToAPlayer(int numOfCards) {
    }

    public int getActualPlayerIndex() {
        return 0;
    }

    public int setActualPlayerIndex() {
        return 0;
    }

    public int getNumberOfPlayers() {
        return 0;
    }

    public ArrayList<Card> getPlayersDeck() {
        return null;
    }

    public Player calculateWinner() {
        return null;
    }

    public void printBoard() {
    }

    public void CleanScreen() {
    }
}