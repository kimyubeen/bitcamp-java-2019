package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Board;

public class BoardList {
  private static final int DEFAULT_CAPACITY = 100;
  private Board[] list;
  private int size = 0;
  
  public BoardList() {
    list = new Board[DEFAULT_CAPACITY];
  }
  
  public BoardList(int initialCapacity) {
    if (initialCapacity < 50 || initialCapacity > 10000)
      list = new Board[DEFAULT_CAPACITY];
    else
      list = new Board[initialCapacity];
  }
  
  public Board[] toArray() {
    Board[] arr = new Board[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
  
  public void add(Board board) {
    if (size == list.length)
      throw new RuntimeException("배열이 꽉 찼습니다.");
    list[size++] = board;
    
  }

}
