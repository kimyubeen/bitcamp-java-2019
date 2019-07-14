package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class BoardHandler {
  static Scanner keyScan;
  static final int LENGTH = 10;
  static Board[] boards = new Board[LENGTH];
  static int boardsSize = 0;
  
  static void addBoard() {
    Board board = new Board();

    board.no = Input.getIntValue("번호? ");
    board.contents = Input.getStringValue("내용? ");
    board.createdDate = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    boards[boardsSize++] = board;

    System.out.println("저장하였습니다.");
  }

  static void listBoard() {
    for (int i = 0; i < boardsSize; i++)
      System.out.printf("%d, %-20s, %-15s, %s\n", boards[i].no, boards[i].contents,
          boards[i].createdDate, boards[i].viewCount);
  }

}
