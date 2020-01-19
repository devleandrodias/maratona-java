package javacore.datetime.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * DateTimeAPI5
 */
public class DateTimeAPI5 {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();

    String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
    String s2 = date.format(DateTimeFormatter.ISO_DATE);
    String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    String dt1 = "20170221";
    String dt2 = "2017-02-21";

    LocalDate dtf1 = LocalDate.parse(dt1, DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println(dtf1);

    LocalDate dtf2 = LocalDate.parse(dt2, DateTimeFormatter.ISO_DATE); // Padrão yyyy-MM-dd
    System.out.println(dtf2);

    DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dateBR = LocalDate.now().format(formatterBR);
    System.out.println(dateBR);

    LocalDate dtf3 = LocalDate.parse("07/12/2000", formatterBR);
    System.out.println(dtf3);

    DateTimeFormatter formatterCanada = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CANADA);
    System.out.println(LocalDate.now().format(formatterCanada));
  }
}