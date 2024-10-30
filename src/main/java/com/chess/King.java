package com.chess;

import java.util.ArrayList;
import java.util.List;

public class King {

  private final int row;
  private final int column;

  public King(String position) {
    this.row = Integer.parseInt(position.substring(1, 2)) - 1;
    this.column = position.charAt(0) - 'A';
  }

  public List<String> allPossibleMoves() {
    List<String> moves = new ArrayList<>();
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    for (int[] dir : directions) {
      int newRow = row + dir[0];
      int newCol = column + dir[1];

      if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8) {
        moves.add("" + (char) ('A' + newCol) + (newRow + 1));
      }
    }
    return moves;
  }
}
