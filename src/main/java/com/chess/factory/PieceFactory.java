package com.chess.factory;

import com.chess.model.King;
import com.chess.model.Pawn;
import com.chess.model.Piece;
import com.chess.model.PieceType;
import com.chess.model.Queen;

public class PieceFactory {

  public static Piece createPiece(PieceType pieceType, String position) {
    switch (pieceType) {
      case PAWN:
        return new Pawn(position);
      case KING:
        return new King(position);
      case QUEEN:
        return new Queen(position);
      default:
        throw new IllegalArgumentException("Unsupported piece type: " + pieceType);
    }
  }
}
