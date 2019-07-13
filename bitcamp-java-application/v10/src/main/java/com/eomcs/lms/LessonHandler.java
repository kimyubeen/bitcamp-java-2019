package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class LessonHandler {
  static Scanner keyScan;
  static final int LENGTH = 10;
  static Lesson[] lessons = new Lesson[LENGTH];
  static int lessonsSize = 0;
  
  static void addLesson() {
    Lesson lesson = new Lesson();

    System.out.printf("번호? ");
    lesson.no = keyScan.nextInt();
    keyScan.nextLine();

    System.out.printf("수업명? ");
    lesson.title = keyScan.nextLine();

    System.out.printf("설명? ");
    lesson.contents = keyScan.nextLine();

    System.out.printf("시작일? ");
    lesson.startDate = Date.valueOf(keyScan.nextLine());

    System.out.printf("종료일? ");
    lesson.endDate = Date.valueOf(keyScan.nextLine());

    System.out.printf("총수업시간? ");
    lesson.totalHours = keyScan.nextInt();
    keyScan.nextLine();

    System.out.printf("일수업시간? ");
    lesson.dayHours = keyScan.nextInt();
    keyScan.nextLine();

    lessons[lessonsSize++] = lesson;

    System.out.println("저장하였습니다.");
  }

  static void listLesson() {
    for (int i = 0; i < lessonsSize; i++)
      System.out.printf("%d, %-20s, %s ~ %s\n", lessons[i].no, lessons[i].title,
          lessons[i].startDate, lessons[i].endDate);
  }

}
