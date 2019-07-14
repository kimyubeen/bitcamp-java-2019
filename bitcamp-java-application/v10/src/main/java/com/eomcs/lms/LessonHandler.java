package com.eomcs.lms;

import java.util.Scanner;

public class LessonHandler {
  public static Scanner keyScan;
  public static final int LENGTH = 10;
  public static Lesson[] lessons = new Lesson[LENGTH];
  public static int lessonsSize = 0;
  
  public static void addLesson() {
    Lesson lesson = new Lesson();
    
    lesson.no = Input.getIntValue("번호? ");
    lesson.title = Input.getStringValue("수업명? ");
    lesson.contents = Input.getStringValue("설명? ");
    lesson.startDate = Input.getDateValue("시작일? ");
    lesson.endDate = Input.getDateValue("종료일? ");
    lesson.totalHours = Input.getIntValue("총수업시간? ");
    lesson.dayHours = Input.getIntValue("일수업시간? ");

    lessons[lessonsSize++] = lesson;

    System.out.println("저장하였습니다.");
  }

  public static void listLesson() {
    for (int i = 0; i < lessonsSize; i++)
      System.out.printf("%d, %-20s, %s ~ %s\n", lessons[i].no, lessons[i].title,
          lessons[i].startDate, lessons[i].endDate);
  }

}
