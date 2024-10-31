package com.chess.model;

import com.chess.utils.Direction;
import com.chess.utils.MovementUtils;
import java.util.List;

public class Pawn extends Piece {

  public Pawn(Position position) {
    super(position);
  }

  @Override
  public List<Position> allPossibleMoves() {
    final Direction forward = Direction.FORWARD;
    return MovementUtils.getMoves(position,List.of(forward),1);
  }
}
