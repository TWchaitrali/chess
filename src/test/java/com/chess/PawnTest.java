package com.chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class PawnTest {
  @Test
  void shouldReturnAllPossibleMovesForPawn() {
    Pawn pawn=new Pawn("G1");

    final List<String> moves = pawn.allPossibleMoves();

    assertEquals(1, moves.size(), "Pawn should have 1 move");
    assertTrue(moves.contains("G2"));
  }

  @Test
  void shouldReturnNoMorePossibleMovesForPawnFromLastPosition() {
    Pawn pawn=new Pawn("A8");

    final List<String> moves = pawn.allPossibleMoves();

    assertEquals(0, moves.size(), "Pawn should have 0 moves from A8");
  }
}
