package com.chess.model;

import com.chess.utils.PositionUtils;
import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

  public Pawn(Position position) {
    super(position);
  }

  @Override
  public List<String> allPossibleMoves() {
    List<String> moves = new ArrayList<>();
    int newRow = row + 1;
    if (isWithinBoard(newRow, column)) {
      moves.add(PositionUtils.formatPosition(newRow, column));
    }
    return moves;
  }
}
