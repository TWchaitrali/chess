package com.chess;

import com.chess.exception.InvalidPositionException;
import com.chess.exception.ValidationException;
import com.chess.factory.PieceFactory;
import com.chess.model.Piece;
import com.chess.model.PieceType;
import com.chess.model.Position;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ChessApplication {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter piece type and position (e.g.'Pawn,G2'):");

    String input = scanner.nextLine();
    handleInput(input);
    scanner.close();
  }

  private static void handleInput(String input) {
    try {
      String[] parts = input.split(",");
      if (parts.length != 2) {
        System.out.println("Invalid input format. Please use: <PieceType>,<Position>");
        return;
      }
      String pieceTypeString = parts[0].trim().toUpperCase();
      Position position = Position.from(parts[1].trim().toUpperCase());
      PieceType pieceType = PieceType.valueOf(pieceTypeString);
      Piece piece = PieceFactory.createPiece(pieceType, position);
      List<String> possibleMoves = piece.allPossibleMoves().stream().map(pos -> {
        try {
          return position.toGridFormat();
        } catch (InvalidPositionException e) {
          return null;
        }
      }).filter(Objects::nonNull).toList();
      System.out.println("Possible moves: " + String.join(", ", possibleMoves));
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid piece type. Please enter a valid piece type.");
    } catch (ValidationException e) {
      System.out.println(e.getMessage());
    }catch (InvalidPositionException e) {
      System.out.println("Invalid position. Please enter a valid position.");
    }
  }
}
