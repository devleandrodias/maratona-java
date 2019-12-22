package javacore.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * SimpleDateFormat
 */
public class SimpleDateFormatTest {

  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();

    String macaraData = "yyyy.MM.dd G 'as' HH:mm:ss z";

    SimpleDateFormat formatador = new SimpleDateFormat(macaraData);

    System.out.println(formatador.format(c.getTime()));
  }
}