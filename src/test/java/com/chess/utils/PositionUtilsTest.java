package com.chess.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionUtilsTest {

  @Test
  void shouldReturnChessPositionGivenRowAndColumn() {
    final String position = PositionUtils.formatPosition(3, 4);

    assertEquals("E4", position);
  }

  @Test
  void shouldReturnChessPositionGivenRowAndColumnForCorner() {
    final String position = PositionUtils.formatPosition(0, 0);

    assertEquals("A1", position);
  }
}