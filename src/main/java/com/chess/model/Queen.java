package com.chess.model;

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
    int[][] directions = { {1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1} };

    for (int[] dir : directions) {
      int newRow = row;
      int newCol = column;
      while (true) {
        newRow += dir[0];
        newCol += dir[1];
        if (!isWithinBoard(newRow, newCol)) break;
        moves.add(PositionUtils.formatPosition(newRow, newCol));
      }
    }
    return moves;
  }
}
