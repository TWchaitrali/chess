package com.chess.model;

import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FIRST_CHAR;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FORMAT;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_SECOND_CHAR;

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
      throw new ValidationException(INVALID_POSITION_FORMAT);
    }
    char columnChar = position.charAt(0);
    char rowChar = position.charAt(1);

    if (!Character.isLetter(columnChar)) {
      throw new ValidationException(INVALID_POSITION_FIRST_CHAR);
    }
    if(!Character.isDigit(rowChar)){
      throw new ValidationException(INVALID_POSITION_SECOND_CHAR);
    }
  }

  public abstract List<String> allPossibleMoves();

  protected boolean isWithinBoard(int newRow, int newColumn) {
    boolean isWithinRowBounds = newRow >= 0 && newRow < BOARD_SIZE;
    boolean isWithinColumnBounds = newColumn >= 0 && newColumn < BOARD_SIZE;
    return isWithinRowBounds && isWithinColumnBounds;
  }
}
