package com.chess.model;

import com.chess.utils.MovementUtils;
import java.util.List;

public class King extends Piece {

  public King(Position position) {
    super(position);
  }

  @Override
  public List<Position> allPossibleMoves() {
    final List<Direction> directions = Direction.getStandardDirections();
    return MovementUtils.getMoves(position,directions,1);
  }
}
