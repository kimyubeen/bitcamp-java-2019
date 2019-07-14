package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.util.Input;

public class BoardHandler {
  private static final int LENGTH = 10;
  private Board[] boards = new Board[LENGTH];
  private int boardsSize = 0;
  
  private Input input;
  
  public BoardHandler(Input input){
    this.input = input;
  }
  
  public void addBoard() {
    Board board = new Board();

    board.no = input.getIntValue("번호? ");
    board.contents = input.getStringValue("내용? ");
    board.createdDate = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    boards[boardsSize++] = board;

    System.out.println("저장하였습니다.");
  }

  public void listBoard() {
    for (int i = 0; i < boardsSize; i++)
      System.out.printf("%d, %-20s, %-15s, %s\n", boards[i].no, boards[i].contents,
          boards[i].createdDate, boards[i].viewCount);
  }

}
