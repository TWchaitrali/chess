package com.chess.exception;

import static com.chess.utils.ExceptionMessages.INVALID_POSITION_BOUNDARY;

public class InvalidPositionException extends RuntimeException {
  public InvalidPositionException() {
    super(INVALID_POSITION_BOUNDARY);
  }

}
