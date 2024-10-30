package com.chess.model;

import static com.chess.model.PieceType.PAWN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.chess.factory.PieceFactory;
import java.util.List;
import org.junit.jupiter.api.Test;

class PawnTest {
  @Test
  void shouldReturnAllPossibleMoves() {
    Piece pawn= PieceFactory.createPiece(PAWN,"G1");

    final List<String> moves = pawn.allPossibleMoves();

    assertEquals(1, moves.size(), "Pawn should have 1 move");
    assertTrue(moves.contains("G2"));
  }

  @Test
  void shouldReturnNoMorePossibleMovesFromLastPosition() {
    Piece pawn= PieceFactory.createPiece(PAWN,"A8");

    final List<String> moves = pawn.allPossibleMoves();

    assertEquals(0, moves.size(), "Pawn should have 0 moves from A8");
  }
}
