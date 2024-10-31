package com.chess.model;

import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FIRST_CHAR;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FORMAT;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_SECOND_CHAR;

import com.chess.exception.ValidationException;
import com.chess.utils.PositionUtils;
import java.util.List;

public abstract class Piece {

  protected int row;
  protected int column;
  private static final int BOARD_SIZE = 8;
  Position position;


  protected Piece(Position position) {
    validate(PositionUtils.formatPosition(position.row(), position.column()));
    this.position = position;
    this.row = position.row();
    this.column = position.column();
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
    boolean isWithinRowBounds = newRow >= 1 && newRow <= BOARD_SIZE;
    boolean isWithinColumnBounds = newColumn >= 1 && newColumn <= BOARD_SIZE;
    return isWithinRowBounds && isWithinColumnBounds;
  }
}
