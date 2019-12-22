package javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * LocaleTest
 */
public class LocaleTest {

  public static void main(String[] args) {
    Locale localeBR = new Locale("pt", "BR");
    Locale localeIT = new Locale("it", "IT");
    Locale localeUS = new Locale("en", "US");

    Calendar calendar = Calendar.getInstance();

    calendar.set(2019, Calendar.DECEMBER, 7);

    DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
    DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, localeIT);
    DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL, localeUS);

    System.out.println("Brasil: " + dfBR.format(calendar.getTime()));
    System.out.println("Itália: " + dfIT.format(calendar.getTime()));
    System.out.println("Estados Unidos: " + dfUS.format(calendar.getTime()));

    System.out.println(localeBR.getDisplayLanguage());
  }
}