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

    member.setNo(input.getIntValue("번호? "));
    member.setName(input.getStringValue("이름? "));
    member.setEmail(input.getStringValue("이메일? "));
    member.setPassword(input.getStringValue("암호? "));
    member.setPhoto(input.getStringValue("사진? "));
    member.setTel(input.getStringValue("전화? "));
    member.setRegisteredDate(new Date(System.currentTimeMillis()));

    members[membersSize++] = member;

    System.out.println("저장하였습니다.");
  }

  public void listMember() {
    for (int i = 0; i < membersSize; i++)
      System.out.printf("%d, %-5s, %-20s, %-15s, %s\n", members[i].getNo(), members[i].getName(),
          members[i].getEmail(), members[i].getTel(), members[i].getRegisteredDate());
  }

}
