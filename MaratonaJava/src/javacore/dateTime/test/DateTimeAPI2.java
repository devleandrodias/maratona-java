package javacore.datetime.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * DateTimeAPI2
 */
public class DateTimeAPI2 {

  public static void main(String[] args) {
    /**
     * Representa um ponto no tempo calculado em nanosegundos
     */
    Instant instant = Instant.now();
    System.out.println(instant);

    /**
     * Date representa um ponto no tempo calculado em milisegundos
     */

    // 01 de Janeiro de 1970

    // ZuluTime = UTC = Universe Time Cordinate (Tempo Neutro)

    System.out.println(instant.getEpochSecond()); // Tempo em segundos
    System.out.println(instant.getNano()); // Tempo em milisegundos do ultimo segundo

    // ------------ Duration ------------

    // Intervalo de datas
    // Não pode usar LocalDate
    // Não pode LocalDateTime e LocalTime

    LocalDateTime dateTime1 = LocalDateTime.now();
    LocalDateTime dateTime2 = LocalDateTime.of(2010, 12, 7, 12, 20, 0);

    LocalTime tLocalTime1 = LocalTime.now();
    LocalTime tLocalTime2 = LocalTime.of(5, 0, 0);

    Duration d1 = Duration.between(dateTime1, dateTime2);
    System.out.println(d1);

    Duration d2 = Duration.between(tLocalTime1, tLocalTime2);
    System.out.println(d2);

    Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(12000));
    System.out.println(d3);

    Duration d4 = Duration.between(dateTime2, tLocalTime2.atDate(dateTime2.toLocalDate()));
    System.out.println(d4);

    Duration d5 = Duration.ofDays(10);
    System.out.println(d5);

    // ------------ Period ------------

    Period p1 = Period.between(dateTime1.toLocalDate(), dateTime2.toLocalDate());
    System.out.println(p1);

    Period p2 = Period.ofYears(10);
    System.out.println(p2);

    Period p3 = Period.ofWeeks(58);
    System.out.println(p3);

    Period p4 = Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays()));
    System.out.println(p4);

    LocalDateTime now2 = LocalDateTime.now();
    System.out.println(now2.until(now2.plusDays(p3.getDays()), ChronoUnit.MONTHS));

    // ------------ ChronoUnit ------------
    LocalDateTime aniversario = LocalDateTime.of(2000, 12, 07, 8, 15, 23);
    System.out.println("DAYS: " + ChronoUnit.DAYS.between(aniversario, now2));
    System.out.println("MONTHS: " + ChronoUnit.MONTHS.between(aniversario, now2));
    System.out.println("YEARS: " + ChronoUnit.YEARS.between(aniversario, now2));
    System.out.println("WEEKS: " + ChronoUnit.WEEKS.between(aniversario, now2));
  }
}