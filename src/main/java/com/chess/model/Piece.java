package com.chess.model;

import java.util.List;

public abstract class Piece {

  protected int row;
  protected int column;
  private static final int BOARD_SIZE = 8;
  Position position;


  protected Piece(Position position) {
    this.position = position;
    this.row = position.row();
    this.column = position.column();
  }

  public abstract List<Position> allPossibleMoves();

  protected boolean isWithinBoard(int newRow, int newColumn) {
    boolean isWithinRowBounds = newRow >= 1 && newRow <= BOARD_SIZE;
    boolean isWithinColumnBounds = newColumn >= 1 && newColumn <= BOARD_SIZE;
    return isWithinRowBounds && isWithinColumnBounds;
  }
}
