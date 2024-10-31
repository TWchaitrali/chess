package com.chess.model;

import static com.chess.model.PieceType.PAWN;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FIRST_CHAR;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FORMAT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.chess.exception.ValidationException;
import com.chess.factory.PieceFactory;
import java.util.List;
import org.junit.jupiter.api.Test;

class PawnTest {
  @Test
  void shouldReturnAllPossibleMoves() {
    Piece pawn= PieceFactory.createPiece(PAWN,Position.from("G1"));

    final List<Position> moves = pawn.allPossibleMoves();

    assertEquals(1, moves.size(), "Pawn should have 1 move");
    assertTrue(moves.contains(Position.from("G2")));
  }

  @Test
  void shouldReturnNoMorePossibleMovesFromLastPosition() {
    Piece pawn= PieceFactory.createPiece(PAWN,Position.from("A8"));

    final List<Position> moves = pawn.allPossibleMoves();

    assertEquals(0, moves.size(), "Pawn should have 0 moves from A8");
  }


  @Test
  void shouldThrowErrorForValidationExceptionGivenIncorrectInputFormat() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(PAWN, Position.from("Z"));
    });

    assertEquals(INVALID_POSITION_FORMAT, exception.getMessage());
  }

  @Test
  void shouldThrowErrorForValidationExceptionGivenEmptyString() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(PAWN, Position.from(""));
    });

    assertEquals(INVALID_POSITION_FORMAT, exception.getMessage());
  }

  @Test
  void shouldThrowErrorForValidationExceptionGivenBothAreDigits() {
    Exception exception = assertThrows(ValidationException.class, () -> {
      PieceFactory.createPiece(PAWN, Position.from("11"));
    });

    assertEquals(INVALID_POSITION_FIRST_CHAR, exception.getMessage());
  }
}
