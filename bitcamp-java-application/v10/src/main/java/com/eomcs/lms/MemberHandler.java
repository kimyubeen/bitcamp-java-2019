package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class MemberHandler {
  static Scanner keyScan;
  static final int LENGTH = 10;
  static Member[] members = new Member[LENGTH];
  static int membersSize = 0;
  
  static void addMember() {
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

    members[membersSize++] = member;

    System.out.println("저장하였습니다.");
  }

  static void listMember() {
    for (int i = 0; i < membersSize; i++)
      System.out.printf("%d, %-5s, %-20s, %-15s, %s\n", members[i].no, members[i].name,
          members[i].email, members[i].tel, members[i].registeredDate);
  }

}
