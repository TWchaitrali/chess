package com.chess.model;

import static com.chess.utils.ExceptionMessages.INVALID_POSITION_FORMAT;

import com.chess.exception.ValidationException;

public record Position(int row, int column) {

  public static Position from(String input) {
    if (input.length() != 2) {
      throw new ValidationException(INVALID_POSITION_FORMAT);
    }

    int row = input.charAt(1) - '0';
    int column = input.charAt(0) - 'A' + 1;
    return new Position(row, column);
  }

}
