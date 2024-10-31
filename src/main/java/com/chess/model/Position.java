package com.chess.model;

import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FIRST_CHAR;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FORMAT;
import static com.chess.utils.ExceptionMessages.INVALID_POSITION_SECOND_CHAR;

import com.chess.exception.ValidationException;

public record Position(int row, int column) {

  public static Position from(String input) {
    validate(input);

    int row = input.charAt(1) - '0';
    int column = input.charAt(0) - 'A' + 1;
    return new Position(row, column);
  }

  private static void validate(String position) {
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

}
