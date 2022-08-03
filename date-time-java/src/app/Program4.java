package app;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Program4 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocaDate = d04.minusDays(7);
        LocalDate nextWeekLocaDate = d04.plusDays(7);

        System.out.println("pastWeekLocaDate = " + pastWeekLocaDate);
        System.out.println("nextWeekLocaDate = " + nextWeekLocaDate);

        LocalDateTime pastWeekLocaDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocaDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocaDateTime = " + pastWeekLocaDateTime);
        System.out.println("nextWeekLocaDateTime = " + nextWeekLocaDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocaDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocaDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = "+ t1.toDays());
        System.out.println("t2 dias = "+ t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
