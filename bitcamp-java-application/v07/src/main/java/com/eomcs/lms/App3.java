package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    Board[] boards = new Board[100];
    
    int i = 0;
    while (true) {
      Board board = new Board();
      
      System.out.printf("번호? ");
      board.no = keyScan.nextInt();
      keyScan.nextLine();
      
      System.out.printf("내용? ");
      board.contents  = keyScan.nextLine();
      
      board.createdDate  = new Date(System.currentTimeMillis());
      
      board.viewCount = 0;
      
      boards[i] = board;
      
      System.out.println();
      
      System.out.printf("계속 입력하시겠습니까?(Y/n) ");
      String input = keyScan.nextLine();
      
      System.out.println();
      if (input.equals("Y"))
        i++;
      if (input.equals("n")) {
        for(int j = 0; j <= i; j++) {
          System.out.printf("%d, %-20s, %-15s, %s\n", boards[j].no, boards[j].contents, 
              boards[j].createdDate, boards[j].viewCount);
        }
        break;
      }
    }
  }
}
