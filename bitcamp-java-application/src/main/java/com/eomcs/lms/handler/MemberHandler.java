package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.Input;

public class MemberHandler {
  public static Scanner keyScan;
  public static final int LENGTH = 10;
  public static Member[] members = new Member[LENGTH];
  public static int membersSize = 0;
  
  public static void addMember() {
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

  public static void listMember() {
    for (int i = 0; i < membersSize; i++)
      System.out.printf("%d, %-5s, %-20s, %-15s, %s\n", members[i].no, members[i].name,
          members[i].email, members[i].tel, members[i].registeredDate);
  }

}
