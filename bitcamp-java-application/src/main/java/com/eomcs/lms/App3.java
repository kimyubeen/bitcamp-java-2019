package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    int[] no = new int[100];
    String[] contents = new String[100];
    Date[] createdDate = new Date[100];
    int[] viewCount = new int[100];
    
    int i = 0;
    while (true) {
      System.out.printf("번호? ");
      no[i] = keyScan.nextInt();
      keyScan.nextLine();
      
      System.out.printf("내용? ");
      contents[i]  = keyScan.nextLine();
      
      createdDate[i]  = new Date(System.currentTimeMillis());
      
      viewCount[i] = 0;
      
      System.out.println();
      
      System.out.printf("계속 입력하시겠습니까?(Y/n) ");
      String input = keyScan.nextLine();
      
      System.out.println();
      if (input.equals("Y"))
        i++;
      if (input.equals("n")) {
        for(int j = 0; j <= i; j++) {
          System.out.printf("%d, %-20s, %-15s, %s\n", no[j], contents[j], createdDate[j],
              viewCount[j]);
        }
        break;
      }
    }
  }
}
