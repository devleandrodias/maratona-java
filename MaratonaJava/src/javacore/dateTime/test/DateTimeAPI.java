package javacore.dateTime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * DateTimeAPI
 */
public class DateTimeAPI {

  public static void main(String[] args) {

    // ---- ANTIGAMENTE ----

    // System.out.println(new Date());
    // System.out.println(Calendar.getInstance());

    // ---- LOCAL DATE ----

    LocalDate date = LocalDate.of(2020, 12, 7);

    System.out.println(date.getYear());
    System.out.println(date.getMonth());
    System.out.println(date.getDayOfMonth());
    System.out.println(date.getMonthValue());
    System.out.println(date.getDayOfYear());
    System.out.println(date.getDayOfWeek());
    System.out.println(date.lengthOfMonth());
    System.out.println(date.isLeapYear());
    System.out.println(date.get(ChronoField.YEAR));
    System.out.println(date.get(ChronoField.DAY_OF_YEAR));

    // ---- LOCAL TIME ----

    LocalDate now = LocalDate.now();
    System.out.println(now);

    LocalTime time = LocalTime.now();
    LocalTime time2 = LocalTime.of(15, 32, 10);
    System.err.println(time);
    System.err.println(time2);
    System.err.println(LocalTime.MAX);

    // ---- PARSE STRING TO DATE ----
    String dataStringUS = "2020-12-07";
    LocalDate parser = LocalDate.parse(dataStringUS);

    System.out.println(parser);

    // ---- OS DOIS JUNTOS ----
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
    LocalDateTime lDateTimeAtTime = date.atTime(15, 24, 23);
    System.out.println(lDateTimeAtTime);
  }
}