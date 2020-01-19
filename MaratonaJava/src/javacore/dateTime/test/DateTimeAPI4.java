package javacore.datetime.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import javacore.datetime.util.ObterProximoDiaUtil;

/**
 * DateTimeAPI4
 */
public class DateTimeAPI4 {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println(date);
    System.out.println(date.getDayOfWeek());

    // Ir para frente
    date = date.with(TemporalAdjusters.nextOrSame(date.getDayOfWeek()));
    System.out.println(date);

    date = date.with(TemporalAdjusters.next(date.getDayOfWeek()));
    System.out.println(date);

    // Ir para trás
    date = date.with(TemporalAdjusters.previousOrSame(date.getDayOfWeek()));
    System.out.println(date);

    date = date.with(TemporalAdjusters.previous(date.getDayOfWeek()));
    System.out.println(date);

    // Primeiro dia do mês
    date = date.with(TemporalAdjusters.firstDayOfMonth());
    System.out.println(date.getDayOfWeek());

    date = date.with(new ObterProximoDiaUtil());
    System.out.println(date);
  }
}