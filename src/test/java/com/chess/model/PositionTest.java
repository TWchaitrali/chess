package com.chess.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.chess.exception.ValidationException;
import org.junit.jupiter.api.Test;

class PositionTest {

  @Test
  void shouldReturnPositionForGivenInputString() {
    Position position = Position.from("D5");

    assertEquals(new Position(5, 4), position);
  }

  @Test
  void shouldReturnPositionForGivenInputEdgeString() {
    Position position = Position.from("H8");

    assertEquals(new Position(8, 8), position);
  }

  @Test
  void shouldThrowValidationExceptionGivenInputStringIsNotValid() {
    assertThrows(ValidationException.class, () -> Position.from("H"));
  }
}
