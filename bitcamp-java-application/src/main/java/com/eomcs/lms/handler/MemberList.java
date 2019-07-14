package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Member;

public class MemberList {
  private static final int DEFAULT_CAPACITY = 100;
  private Member[] list;
  private int size = 0;
  
  public MemberList() {
    list = new Member[DEFAULT_CAPACITY];
  }
  
  public MemberList(int initialCapacity) {
    if (initialCapacity < 50 || initialCapacity > 10000)
      list = new Member[DEFAULT_CAPACITY];
    else
      list = new Member[initialCapacity];
    
  }
  
  public Member[] toArray() {
    Member[] arr = new Member[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
  
  public void add(Member member) {
    if (size == list.length)
      throw new RuntimeException("배열이 꽉 찼습니다.");
    list[size++] = member;
  }

}
