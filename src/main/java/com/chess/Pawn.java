package com.chess;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

  public Pawn(String position) {
    super(position);
  }

  @Override
  public List<String> allPossibleMoves() {
    List<String> moves = new ArrayList<>();
    int newRow = row + 1;
    if (isWithinBoard(newRow,column)) {
      moves.add("" + (char) ('A' + column) + (newRow + 1));
    }
    return moves;
  }
}
