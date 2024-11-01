package com.chess.model;

import java.util.Arrays;
import java.util.List;

public enum Direction {
  FORWARD(1, 0),
  BACKWARD(-1, 0),
  LEFT(0, -1),
  RIGHT(0, 1),
  FORWARD_RIGHT(1, 1),
  FORWARD_LEFT(1, -1),
  BACKWARD_RIGHT(-1, 1),
  BACKWARD_LEFT(-1, -1);

  private final int rowChange;
  private final int colChange;

  Direction(int rowChange, int colChange) {
    this.rowChange = rowChange;
    this.colChange = colChange;
  }

  public int getRowChange() {
    return rowChange;
  }

  public int getColChange() {
    return colChange;
  }

  public static List<Direction> getStandardDirections() {
    return Arrays.asList(FORWARD, BACKWARD, LEFT, RIGHT, FORWARD_RIGHT, FORWARD_LEFT,
        BACKWARD_RIGHT, BACKWARD_LEFT);
  }
}