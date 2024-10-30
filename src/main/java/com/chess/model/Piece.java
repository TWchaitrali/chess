package com.chess.model;

import com.chess.exception.ValidationException;
import java.util.List;

public abstract class Piece {

  protected int row;
  protected int column;
  private static final int BOARD_SIZE = 8;


  protected Piece(String position) {
    validate(position);
    this.row = Character.getNumericValue(position.charAt(1)) - 1;
    this.column = position.charAt(0) - 'A';
  }

  private void validate(String position) {
    if (position.length() != 2) {
      throw new ValidationException("Invalid position format:It must exactly contain 2 characters");
    }
    char columnChar = position.charAt(0);
    char rowChar = position.charAt(1);

    if (!Character.isLetter(columnChar) || !Character.isDigit(rowChar)) {
      throw new ValidationException("Invalid position format:Must exactly contain one character for column and one digit for row");
    }
  }

  public abstract List<String> allPossibleMoves();

  protected boolean isWithinBoard(int newRow, int newColumn) {
    boolean isWithinRowBounds = newRow >= 0 && newRow < BOARD_SIZE;
    boolean isWithinColumnBounds = newColumn >= 0 && newColumn < BOARD_SIZE;
    return isWithinRowBounds && isWithinColumnBounds;
  }
}
