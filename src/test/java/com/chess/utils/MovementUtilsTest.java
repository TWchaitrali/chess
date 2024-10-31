package com.chess.utils;

import static org.junit.jupiter.api.Assertions.*;

import com.chess.model.Direction;
import com.chess.model.Position;
import java.util.List;
import org.junit.jupiter.api.Test;

class MovementUtilsTest {

  @Test
  void shouldReturnNextStepsForForwardGivenPositionAndSteps() {
    final List<Position> moves = MovementUtils.getMoves(new Position(4, 4),
        List.of(Direction.FORWARD), 1);

    assertEquals(1, moves.size());
    assertEquals(moves, List.of(new Position(5, 4)));
  }

  @Test
  void shouldReturnNextStepsForBackwardGivenPositionAndSteps() {
    final List<Position> moves = MovementUtils.getMoves(new Position(4, 4),
        List.of(Direction.BACKWARD), 1);

    assertEquals(1, moves.size());
    assertEquals(List.of(new Position(3, 4)), moves);
  }

  @Test
  void shouldReturnNextStepsForLeftGivenPositionAndSteps() {
    final List<Position> moves = MovementUtils.getMoves(new Position(4, 4),
        List.of(Direction.LEFT), 1);

    assertEquals(1, moves.size());
    assertEquals(List.of(new Position(4, 3)), moves);
  }

  @Test
  void shouldReturnNextStepsForRightGivenPositionAndSteps() {
    final List<Position> moves = MovementUtils.getMoves(new Position(4, 4),
        List.of(Direction.RIGHT), 1);

    assertEquals(1, moves.size());
    assertEquals(List.of(new Position(4, 5)), moves);
  }

  @Test
  void shouldReturnNextStepsForForwardRightGivenPositionAndSteps() {
    final List<Position> moves = MovementUtils.getMoves(new Position(4, 4),
        List.of(Direction.FORWARD_RIGHT), 1);

    assertEquals(1, moves.size());
    assertEquals(List.of(new Position(5, 5)), moves);
  }

  @Test
  void shouldReturnNextStepsForBackWardRightGivenPositionAndSteps() {
    final List<Position> moves = MovementUtils.getMoves(new Position(4, 4),
        List.of(Direction.BACKWARD_RIGHT), 1);

    assertEquals(1, moves.size());
    assertEquals(List.of(new Position(3, 5)), moves);
  }

  @Test
  void shouldReturnNextStepsForBackWardLeftGivenPositionAndSteps() {
    final List<Position> moves = MovementUtils.getMoves(new Position(4, 4),
        List.of(Direction.BACKWARD_LEFT), 1);

    assertEquals(1, moves.size());
    assertEquals(List.of(new Position(3, 3)), moves);
  }
}