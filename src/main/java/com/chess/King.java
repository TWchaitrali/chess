package com.chess;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

  public King(String position) {
    super(position);
  }

  @Override
  public List<String> allPossibleMoves() {
    List<String> moves = new ArrayList<>();
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    for (int[] dir : directions) {
      int newRow = row + dir[0];
      int newCol = column + dir[1];

      if (isWithinBoard(newRow, newCol)) {
        moves.add("" + (char) ('A' + newCol) + (newRow + 1));
      }
    }
    return moves;
  }
}
