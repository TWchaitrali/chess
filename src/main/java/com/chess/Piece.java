package com.chess;

import java.util.List;

public abstract class Piece {
  protected int row;
  protected int column;

  protected Piece(String position) {
    this.row = Character.getNumericValue(position.charAt(1)) - 1;
    this.column = position.charAt(0) - 'A';
  }

  public abstract List<String> allPossibleMoves();
}
