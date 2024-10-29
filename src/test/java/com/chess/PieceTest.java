package com.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class PieceTest {

  @Test
  void shouldReturnAllPossibleMovesForKing() {
    King king = new King("D5");
    final List<String> moves = king.allPossibleMoves();

    assertEquals(8, moves.size(), "King should have 8 possible moves from center");

  }
}
