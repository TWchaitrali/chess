package com.chess.utils;

import com.chess.model.Direction;
import com.chess.model.Position;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class MovementUtils {

  public static List<Position> getMoves(Position currentPosition, List<Direction> directions,
      int steps) {
    return directions.stream()
        .map(direction -> calculateMovesInDirection(currentPosition, steps, direction))
        .flatMap(Collection::stream)
        .toList();
  }

  private static List<Position> calculateMovesInDirection(Position currentPosition, int steps,
      Direction direction) {

    return IntStream.range(1, steps + 1)
        .mapToObj(step -> getNextPosition(currentPosition, direction, step))
        .filter(Position::isWithinBoard)
        .toList();
  }

  private static Position getNextPosition(Position currentPosition, Direction direction, int step) {
    final int nextRow = currentPosition.row() + direction.getRowChange() * step;
    final int nextCol = currentPosition.column() + direction.getColChange() * step;
    return new Position(nextRow, nextCol);
  }
}