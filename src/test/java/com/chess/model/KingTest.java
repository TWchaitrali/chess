package com.chess.model;

import static com.chess.model.PieceType.KING;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.chess.factory.PieceFactory;
import java.util.List;
import org.junit.jupiter.api.Test;

class KingTest {

  @Test
  void shouldReturnAllPossibleMoves() {
    Piece king = PieceFactory.createPiece(KING, Position.from("D5"));

    final List<Position> moves = king.allPossibleMoves();

    assertEquals(8, moves.size(), "King should have 8 possible moves from center");
    assertTrue(moves.contains(Position.from("D6")));
    assertTrue(moves.contains(Position.from("E6")));
    assertTrue(moves.contains(Position.from("E5")));
    assertTrue(moves.contains(Position.from("E4")));
    assertTrue(moves.contains(Position.from("D4")));
    assertTrue(moves.contains(Position.from("C4")));
    assertTrue(moves.contains(Position.from("C5")));
    assertTrue(moves.contains(Position.from("C6")));
  }

  @Test
  void shouldReturnAllPossibleMovesFromCorner() {
    Piece king = PieceFactory.createPiece(KING, Position.from("A1"));

    final List<Position> moves = king.allPossibleMoves();

    assertEquals(3, moves.size(), "King should have 3 moves from corner A1");
    assertTrue(moves.contains(Position.from("A2")));
    assertTrue(moves.contains(Position.from("B1")));
    assertTrue(moves.contains(Position.from("B2")));
  }
}
