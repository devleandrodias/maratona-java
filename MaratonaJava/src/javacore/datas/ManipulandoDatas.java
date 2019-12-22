package javacore.datas;

import java.util.Calendar;
import java.util.Date;

/**
 * ManipulandoDatas
 */
public class ManipulandoDatas {

  public static void main(String[] args) {
    Date data = new Date(); // Armazena em milisegundos

    data.setTime(data.getTime() + 49576147564L);

    System.out.println(data);

    // Muito mais funcionalidades
    Calendar calendar = Calendar.getInstance(); // Classe estática

    calendar.setTime(data);

    if (Calendar.SUNDAY == calendar.getFirstDayOfWeek())
      System.out.println("Domingo Primeiro Dia da Semana");

    System.out.println(calendar);
    System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // Aceita constante
    calendar.add(Calendar.HOUR, 1); // Adiciona uma hora
    System.out.println(calendar);
  }
}