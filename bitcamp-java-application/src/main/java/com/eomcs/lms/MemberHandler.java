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

    member.no = Input.getIntValue("번호? ");
    member.name = Input.getStringValue("이름? ");
    member.email = Input.getStringValue("이메일? ");
    member.password = Input.getStringValue("암호? ");
    member.photo = Input.getStringValue("사진? ");
    member.tel = Input.getStringValue("전화? ");
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
