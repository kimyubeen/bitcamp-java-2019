package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.printf("번호? ");
    int no = keyScan.nextInt();
    keyScan.nextLine();
    
    System.out.printf("이름? ");
    String name = keyScan.nextLine();
    
    System.out.printf("이메일? ");
    String email = keyScan.nextLine();
    
    System.out.printf("암호? ");
    String password = keyScan.nextLine();
    
    System.out.printf("사진? ");
    String photo = keyScan.nextLine();
    
    System.out.printf("전화? ");
    String tel = keyScan.nextLine();
    
    Date registeredDate = new Date(System.currentTimeMillis());
    
    System.out.println();
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", registeredDate);
    
  }

}
