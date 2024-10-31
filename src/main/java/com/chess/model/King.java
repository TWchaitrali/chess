package com.chess.model;

import com.chess.utils.Direction;
import com.chess.utils.PositionUtils;
import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

  public King(Position position) {
    super(position);
  }

  @Override
  public List<String> allPossibleMoves() {
    List<String> moves = new ArrayList<>();
    final List<Direction> standardDirections = Direction.getStandardDirections();

    for (Direction dir : standardDirections) {
      int newRow = row + dir.getRowChange();
      int newCol = column + dir.getColChange();

      if (isWithinBoard(newRow, newCol)) {
        moves.add(PositionUtils.formatPosition(newRow, newCol));
      }
    }
    return moves;
  }
}
