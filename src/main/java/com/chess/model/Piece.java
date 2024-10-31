package com.chess.model;

import java.util.List;

public abstract class Piece {

  Position position;


  protected Piece(Position position) {
    this.position = position;
  }

  public abstract List<Position> allPossibleMoves();
}
