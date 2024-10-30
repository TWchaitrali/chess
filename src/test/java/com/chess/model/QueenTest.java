package com.chess.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class QueenTest {

  @Test
  void shouldReturnAllPossibleMoves() {
    Queen queen = new Queen("E4");
    final List<String> expectedMoves = List.of("A4", "B4", "C4","D4","F4","G4","H4","E1","E2","E3","E5","E6","E7","E8","A8","B7","C6","D5","F3","G2","H1","B1","C2","D3","F5","G6","H7");

    final List<String> moves = queen.allPossibleMoves();

    assertEquals(27, moves.size(), "Queen should have 27 possible moves from E4");
    assertTrue(moves.containsAll(expectedMoves));
  }

  @Test
  void shouldReturnAllPossibleMovesFromCorner() {
    Queen queen = new Queen("A1");
    final List<String> expectedMoves = List.of(
        "A2", "A3", "A4", "A5", "A6", "A7", "A8",  // vertical up
        "B1", "C1", "D1", "E1", "F1", "G1", "H1",  // horizontal right
        "B2", "C3", "D4", "E5", "F6", "G7", "H8"   // diagonal up-right
    );

    List<String> actualMoves = queen.allPossibleMoves();

    assertTrue(actualMoves.containsAll(expectedMoves));
  }
}
