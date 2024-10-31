package com.chess.model;

import com.chess.utils.Direction;
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
    final Direction forward = Direction.FORWARD;
    int newRow = row + forward.getRowChange();
    int newCol = column + forward.getColChange();
    if (isWithinBoard(newRow, newCol)) {
      moves.add(PositionUtils.formatPosition(newRow, newCol));
    }
    return moves;
  }
}
