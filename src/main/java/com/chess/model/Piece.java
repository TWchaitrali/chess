package com.chess.model;

import java.util.List;

public abstract class Piece {

  protected int row;
  protected int column;
  private static final int BOARD_SIZE = 8;


  protected Piece(String position) {
    this.row = Character.getNumericValue(position.charAt(1)) - 1;
    this.column = position.charAt(0) - 'A';
  }

  public abstract List<String> allPossibleMoves();

  protected boolean isWithinBoard(int newRow, int newColumn) {
    boolean isWithinRowBounds = newRow >= 0 && newRow < BOARD_SIZE;
    boolean isWithinColumnBounds = newColumn >= 0 && newColumn < BOARD_SIZE;
    return isWithinRowBounds && isWithinColumnBounds;
  }
}
