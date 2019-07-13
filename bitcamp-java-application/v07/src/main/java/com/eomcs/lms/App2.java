package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    Member[] members = new Member[100];
    
    int i = 0;
    while (true) {
      Member member = new Member();
    
      System.out.printf("번호? ");
      member.no = keyScan.nextInt();
      keyScan.nextLine();
      
      System.out.printf("이름? ");
      member.name = keyScan.nextLine();
      
      System.out.printf("이메일? ");
      member.email = keyScan.nextLine();
      
      System.out.printf("암호? ");
      member.password = keyScan.nextLine();
      
      System.out.printf("사진? ");
      member.photo = keyScan.nextLine();
      
      System.out.printf("전화? ");
      member.tel = keyScan.nextLine();
      
      member.registeredDate = new Date(System.currentTimeMillis());
      
      members[i] = member;
      
      System.out.println();
      
      System.out.printf("계속 입력하시겠습니까?(Y/n) ");
      String input = keyScan.nextLine();
      
      System.out.println();
      if (input.equals("Y"))
        i++;
      if (input.equals("n")) {
        for(int j = 0; j <= i; j++) {
          System.out.printf("%d, %-5s, %-20s, %-15s, %s\n", members[j].no, members[j].name,
              members[j].email, members[j].tel, members[j].registeredDate);
        }
        break;
      }
      
    }
    
  }

}
