package com.github.SYM;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> players;
    private Board board;
    private int maxOfTurns = 40;
    private Statistics statisticsOfTheGame;

    public Game(Scanner Sc, ArrayList<Player> playersRegistered) {
    }

    public ArrayList<Player> getPlayers() {
        return null;
    }

    public Statistics getStatistics() {
        return null;
    }

    public void updateStatistics() {
    }

    public class Statistics implements Updatable, Showable {
        public ArrayList<Integer> cardsPerPlayer;

        public Statistics() {
        }

        @Override
        public void update(Updatable x) {
        }

        @Override
        public void show() {
        }

        @Override
        public String toString() {
            return "";
        }
    }
}