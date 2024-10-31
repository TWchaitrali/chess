package com.chess.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionUtilsTest {

  @Test
  void shouldReturnChessPositionGivenRowAndColumn() {
    final String position = PositionUtils.formatPosition(3, 4);

    assertEquals("D3", position);
  }

  @Test
  void shouldReturnChessPositionGivenRowAndColumnForCorner() {
    final String position = PositionUtils.formatPosition(1, 1);

    assertEquals("A1", position);
  }
}