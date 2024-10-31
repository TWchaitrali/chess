# Chess Program

## Overview
This project simulates a chessboard and the movements of chess pieces (Pawn, King and Queen) using the Factory Design Pattern. The program allows users to input a chess piece and its position, and it will output all possible moves for that piece from its current position.

## Table of Contents
- [Features](#features)
- [Requirements](#requirements)
- [Build](#running-the-program)
- [Running Tests](#running-tests)
- [Input](#input)
- [Output](#output)

## Features
- Simulates an 8x8 chessboard.
- The chessboard is an 8 x 8 grid with 64 cells in it. With 8 rows (1, 2, 3.... 8) and 8 columns (A, B, C.... H),
  each cell can be uniquely identified with its cell number. For example - A1,B3,H8
- Implements movement logic for Pawn, King and Queen.
- Uses the Factory Design Pattern for creating chess pieces.

## Requirements
- Java 17 
- Gradle 8.5 (for dependency management and building)

## Build
- Build the code using `./gradlew clean build` 

## Running Tests
- `./gradlew clean test`
- Generate Test report using `./gradlew clean test jacocoTestReport`

## Input
- The input string will be the Type of chess piece and it’s position (cell number) on the
  chessboard. E.g. Pawn,G1
- 
## Output
- All possible moves of chess piece represented as a comma separated values with chess grid
- E.g. Possible moves: G1