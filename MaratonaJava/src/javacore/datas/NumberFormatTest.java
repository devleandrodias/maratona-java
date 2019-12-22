package javacore.datas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * NumberFormatTest
 */
public class NumberFormatTest {

  public static void main(String[] args) {
    float valor = 123.345234f;

    Locale locationJapan = new Locale("jp");
    NumberFormat[] nfa = new NumberFormat[4];

    nfa[0] = NumberFormat.getInstance();
    nfa[1] = NumberFormat.getInstance(locationJapan);
    nfa[2] = NumberFormat.getCurrencyInstance();
    nfa[3] = NumberFormat.getCurrencyInstance(locationJapan);

    for (NumberFormat numberFormat : nfa) {
      System.out.println(numberFormat.format(valor));
    }

    NumberFormat nf = NumberFormat.getInstance();
    System.out.println(nf.getMaximumFractionDigits());
    nf.setMaximumFractionDigits(5); // Quantidade depos da virgulas
    System.out.println(nf.format(valor));

    String valorString = "1231243.123";

    try {
      System.out.println(nf.parse(valorString));
      nf.parse(valorString);
      nf.setParseIntegerOnly(true);
      System.out.println(nf.parse(valorString));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}