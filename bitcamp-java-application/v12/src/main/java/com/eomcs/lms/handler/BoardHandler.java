package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.util.Input;

public class BoardHandler {
  public static Scanner keyScan;
  public static final int LENGTH = 10;
  public static Board[] boards = new Board[LENGTH];
  public static int boardsSize = 0;
  
  public static void addBoard() {
    Board board = new Board();

    board.no = Input.getIntValue("번호? ");
    board.contents = Input.getStringValue("내용? ");
    board.createdDate = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    boards[boardsSize++] = board;

    System.out.println("저장하였습니다.");
  }

  public static void listBoard() {
    for (int i = 0; i < boardsSize; i++)
      System.out.printf("%d, %-20s, %-15s, %s\n", boards[i].no, boards[i].contents,
          boards[i].createdDate, boards[i].viewCount);
  }

}
