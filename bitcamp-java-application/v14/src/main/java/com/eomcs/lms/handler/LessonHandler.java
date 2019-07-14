package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.Input;

public class LessonHandler {
  private static final int LENGTH = 10;
  private Lesson[] lessons = new Lesson[LENGTH];
  private int lessonsSize = 0;
  
  public Input input;
  
  public LessonHandler(Input input) {
    this.input = input;
  }
  
  public void addLesson() {
    Lesson lesson = new Lesson();
    
    lesson.no = input.getIntValue("번호? ");
    lesson.title = input.getStringValue("수업명? ");
    lesson.contents = input.getStringValue("설명? ");
    lesson.startDate = input.getDateValue("시작일? ");
    lesson.endDate = input.getDateValue("종료일? ");
    lesson.totalHours = input.getIntValue("총수업시간? ");
    lesson.dayHours = input.getIntValue("일수업시간? ");

    lessons[lessonsSize++] = lesson;

    System.out.println("저장하였습니다.");
  }

  public void listLesson() {
    for (int i = 0; i < lessonsSize; i++)
      System.out.printf("%d, %-20s, %s ~ %s\n", lessons[i].no, lessons[i].title,
          lessons[i].startDate, lessons[i].endDate);
  }

}
