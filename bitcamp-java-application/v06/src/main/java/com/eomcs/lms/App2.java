package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    int[] no = new int[100];
    String[] name = new String[100];
    String[] email = new String[100];
    String[] password = new String[100];
    String[] photo = new String[100];
    String[] tel = new String[100];
    Date[] registeredDate = new Date[100]; 
    
    int i = 0;
    while (true) {
    
      System.out.printf("번호? ");
      no[i] = keyScan.nextInt();
      keyScan.nextLine();
      
      System.out.printf("이름? ");
      name[i] = keyScan.nextLine();
      
      System.out.printf("이메일? ");
      email[i] = keyScan.nextLine();
      
      System.out.printf("암호? ");
      password[i] = keyScan.nextLine();
      
      System.out.printf("사진? ");
      photo[i] = keyScan.nextLine();
      
      System.out.printf("전화? ");
      tel[i] = keyScan.nextLine();
      
      registeredDate[i] = new Date(System.currentTimeMillis());
      
      System.out.println();
      
      System.out.printf("계속 입력하시겠습니까?(Y/n) ");
      String input = keyScan.nextLine();
      
      System.out.println();
      if (input.equals("Y"))
        i++;
      if (input.equals("n")) {
        for(int j = 0; j <= i; j++) {
          System.out.printf("%d, %-5s, %-20s, %-15s, %s\n", no[j], name[j], email[j], 
              tel[j], registeredDate[j]);
        }
        break;
      }
      
    }
    
  }

}
