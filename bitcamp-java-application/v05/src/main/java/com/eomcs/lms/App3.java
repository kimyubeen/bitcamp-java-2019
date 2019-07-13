package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.printf("번호? ");
    int no = keyScan.nextInt();
    keyScan.nextLine();
    
    System.out.printf("내용? ");
    String contents = keyScan.nextLine();
    
    Date createdDate = new Date(System.currentTimeMillis());
    
    int viewCount = 0;
    
    System.out.println();
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("작성일: %s\n", createdDate);
    System.out.printf("조회수: %d\n", viewCount);
  }
}
