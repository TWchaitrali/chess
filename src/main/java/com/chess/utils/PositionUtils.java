package com.chess.utils;

public class PositionUtils {

  public static String formatPosition(int row, int col) {
    return String.valueOf(columnToLetter(col)) + rowToBoardIndex(row);
  }

  private static char columnToLetter(int col) {
    return (char) ('A' + col);
  }

  private static int rowToBoardIndex(int row) {
    return row + 1;
  }
}
