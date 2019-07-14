package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.Input;

public class MemberHandler {
  private static final int LENGTH = 10;
  private Member[] members = new Member[LENGTH];
  private int membersSize = 0;
  
  public Input input;
  
  public MemberHandler(Input input) {
    this.input = input;
  }
  
  public void addMember() {
    Member member = new Member();

    member.no = input.getIntValue("번호? ");
    member.name = input.getStringValue("이름? ");
    member.email = input.getStringValue("이메일? ");
    member.password = input.getStringValue("암호? ");
    member.photo = input.getStringValue("사진? ");
    member.tel = input.getStringValue("전화? ");
    member.registeredDate = new Date(System.currentTimeMillis());

    members[membersSize++] = member;

    System.out.println("저장하였습니다.");
  }

  public void listMember() {
    for (int i = 0; i < membersSize; i++)
      System.out.printf("%d, %-5s, %-20s, %-15s, %s\n", members[i].no, members[i].name,
          members[i].email, members[i].tel, members[i].registeredDate);
  }

}
