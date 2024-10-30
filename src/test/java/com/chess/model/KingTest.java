package com.chess.model;

import static com.chess.model.PieceType.KING;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.chess.exception.ValidationException;
import com.chess.factory.PieceFactory;
import java.util.List;
import org.junit.jupiter.api.Test;

class KingTest {

  @Test
  void shouldReturnAllPossibleMoves() {
    Piece king = PieceFactory.createPiece(KING, "D5");

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
  void shouldReturnAllPossibleMovesFromCorner() {
    Piece king = PieceFactory.createPiece(KING, "A1");

    final List<String> moves = king.allPossibleMoves();

    assertEquals(3, moves.size(), "King should have 3 moves from corner A1");
    assertTrue(moves.contains("A2"));
    assertTrue(moves.contains("B1"));
    assertTrue(moves.contains("B2"));
  }

  @Test
  void shouldThrowErrorForValidationExceptionGivenIncorrectInputFormat() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(KING, "Z");
    });

    assertEquals("Invalid position format:It must exactly contain 2 characters", exception.getMessage());
  }

  @Test
  void shouldThrowErrorForValidationExceptionGivenEmptyString() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(KING, "");
    });

    assertEquals("Invalid position format:It must exactly contain 2 characters", exception.getMessage());
  }

  @Test
  void shouldThrowErrorForValidationExceptionGivenBothAreDigits() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(KING, "11");
    });

    assertEquals("Invalid position format:Must exactly contain one character for column and one digit for row", exception.getMessage());
  }
}
