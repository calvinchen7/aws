package com.pluralsight.java8.arrays.tictactoe;

public interface Player {

    Symbol getSymbol();

    Position getMove(Game game);
}
