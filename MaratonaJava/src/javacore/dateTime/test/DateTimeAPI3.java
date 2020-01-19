package javacore.datetime.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * DateTimeAPI3
 */
public class DateTimeAPI3 {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2017, Month.FEBRUARY, 25);
    System.out.println(localDate);

    LocalDate localDate2 = localDate.withYear(2020); // Thread Save, se você altera o valor e cria outra
    System.out.println(localDate2);

    LocalDate localDate3 = localDate.withMonth(Month.AUGUST.getValue());
    System.out.println(localDate3);

    LocalDate dataAssinatura = LocalDate.now();
    LocalDate dataExpiracao = dataAssinatura.withYear(dataAssinatura.getYear() + 1);

    System.out.println("Data Assinatura: " + dataAssinatura);
    System.out.println("Data Expiração: " + dataExpiracao);
    System.out.println("Data Expiração Melhorada: " + dataAssinatura.plusYears(1));

    LocalDate localDate4 = localDate2.with(ChronoField.DAY_OF_MONTH, 15);
    System.out.println(localDate4);

    System.out.println(localDate2.plusYears(1));
    System.out.println(localDate2.plus(2, ChronoUnit.MONTHS));
  }
}