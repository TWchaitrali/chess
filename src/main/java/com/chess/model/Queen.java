package com.chess.model;

import com.chess.utils.Direction;
import com.chess.utils.PositionUtils;
import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {

  public Queen(Position position) {
    super(position);
  }

  @Override
  public List<String> allPossibleMoves() {
    List<String> moves = new ArrayList<>();
    final List<Direction> directions = Direction.getStandardDirections();

    for (Direction direction : directions) {
      int newRow = row;
      int newCol = column;
      while (true) {
        newRow += direction.getRowChange();
        newCol += direction.getColChange();
        if (!isWithinBoard(newRow, newCol)) {
          break;
        }
        moves.add(PositionUtils.formatPosition(newRow, newCol));
      }
    }
    return moves;
  }
}
