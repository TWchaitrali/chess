package com.chess.utils;

public class PositionUtils {

  public static String formatPosition(int row, int col) {
    return String.valueOf(columnToLetter(col)) + rowToBoardIndex(row);
  }

  private static char columnToLetter(int col) {
    return (char) ('A' + col-1);
  }

  private static int rowToBoardIndex(int row) {
    return row;
  }
}
