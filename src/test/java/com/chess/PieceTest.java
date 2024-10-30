package com.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class PieceTest {

  @Test
  void shouldReturnAllPossibleMovesForKing() {
    King king = new King("D5");
    final List<String> moves = king.allPossibleMoves();

    assertEquals(8, moves.size(), "King should have 8 possible moves from center");
    assertTrue(moves.contains("D6"));
    assertTrue(moves.contains("E6"));
    assertTrue(moves.contains("E5"));
    assertTrue(moves.contains("E4"));
    assertTrue(moves.contains("D4"));
    assertTrue(moves.contains("C4"));
    assertTrue(moves.contains("C5"));
    assertTrue(moves.contains("C6"));
  }
}
