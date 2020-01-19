package javacore.datetime.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;

/**
 * DateTimeAPI6
 */
public class DateTimeAPI6 {

  public static void main(String[] args) {
    // for (Map.Entry<String, String> zona : ZoneId.SHORT_IDS.entrySet()) {
    // System.out.println(zona.getKey() + " " + zona.getValue());
    // }

    System.out.println(ZoneId.systemDefault());

    ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

    System.out.println(tokyoZone);

    LocalDateTime dateTime = LocalDateTime.now();

    ZonedDateTime zonedTokyo = dateTime.atZone(tokyoZone);

    System.out.println(zonedTokyo);

    Instant instantNeutro = Instant.now();
    System.out.println(instantNeutro);

    ZonedDateTime zonedTokyoUTC = instantNeutro.atZone(tokyoZone);
    System.out.println(zonedTokyoUTC);

    System.out.println(ZoneOffset.MIN);
    System.out.println(ZoneOffset.UTC);
    System.out.println(ZoneOffset.MAX);

    ZoneOffset manausZoneOffSet = ZoneOffset.of("-04:00");
    LocalDateTime dateTime2 = LocalDateTime.now();

    OffsetDateTime a = OffsetDateTime.of(dateTime2, manausZoneOffSet); // Iguais
    OffsetDateTime b = dateTime2.atOffset(manausZoneOffSet);

    System.out.println(a);
    System.out.println(b);

    Instant instant = Instant.now();
    System.out.println(instant.atOffset(manausZoneOffSet));

    JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
    System.out.println(japaneseDate);
  }
}