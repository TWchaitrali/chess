package com.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class KingTest {

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

  @Test
  void shouldReturnAllPossibleMovesForKingFromCorner() {
    King king = new King("A1");

    final List<String> moves = king.allPossibleMoves();

    assertEquals(3, moves.size(), "King should have 3 moves from corner A1");
    assertTrue(moves.contains("A2"));
    assertTrue(moves.contains("B1"));
    assertTrue(moves.contains("B2"));
  }
}