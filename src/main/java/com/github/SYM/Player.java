package com.github.SYM;

import java.util.Scanner;

public class Player {
    private String name;
    private Statistics statisticsOfThePlayer;

    public Player(Scanner sc) {
    }

    public String getName() {
        return "";
    }

    public Statistics getStatistics() {
        return null;
    }

    private void setName(String n) {
    }

    private void setStatistics(Statistics s) {
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public class Statistics implements Updatable, Showable {
        public int gamesWon = 0;
        public int gamesLost = 0;

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