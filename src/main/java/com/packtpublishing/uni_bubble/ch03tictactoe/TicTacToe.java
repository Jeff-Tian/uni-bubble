package com.packtpublishing.uni_bubble.ch03tictactoe;

public class TicTacToe {
    public void play(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("X is outside board");
        }
    }
}