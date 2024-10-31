package com.chess.model;

import static com.chess.model.PieceType.KING;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FIRST_CHAR;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FORMAT;
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
    Piece king = PieceFactory.createPiece(KING, Position.from("D5"));

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
    Piece king = PieceFactory.createPiece(KING, Position.from("A1"));

    final List<String> moves = king.allPossibleMoves();

    assertEquals(3, moves.size(), "King should have 3 moves from corner A1");
    assertTrue(moves.contains("A2"));
    assertTrue(moves.contains("B1"));
    assertTrue(moves.contains("B2"));
  }

  @Test
  void shouldThrowErrorForValidationExceptionGivenIncorrectInputFormat() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(KING, Position.from("Z"));
    });

    assertEquals(INVALID_POSITION_FORMAT, exception.getMessage());
  }

  @Test
  void shouldThrowErrorForValidationExceptionGivenEmptyString() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(KING, Position.from(""));
    });

    assertEquals(INVALID_POSITION_FORMAT, exception.getMessage());
  }

  @Test
  void shouldThrowErrorForValidationExceptionGivenBothAreDigits() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(KING, Position.from("11"));
    });

    assertEquals(INVALID_POSITION_FIRST_CHAR, exception.getMessage());
  }
}
