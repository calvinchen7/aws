package m5.v3_PeriodsAndDurations.after;

import java.time.*;

import static java.lang.System.out;

public class PeriodsAndDurations {

    public static void main(String[] args) {

        out.println("\n** Periods and Durations ** \n");

        LocalDate nowDate = LocalDate.now( );
        LocalDate laterDate = nowDate.plusDays(2);

        Period period = Period.between(nowDate, laterDate);
        out.println("1. " + period.getDays( ));

        LocalTime nowTime = LocalTime.now();
        LocalTime laterTime = nowTime.plusHours(3);

        Duration duration = Duration.between(nowTime, laterTime);
        out.println("2. " + duration.getSeconds());
        /* 10800 */
        out.println("3. " + duration.getSeconds()/3600);
        /* 3 */

        period = Period.ofDays(3);
        duration = Duration.ofHours(2);

        LocalDateTime dateTime =
                LocalDateTime.of(2022, 10, 31, 9, 0);
        out.println("4. " + dateTime);
        /* 2022-10-31T09:00 */

        LocalDateTime later = dateTime.plus(period).plus(duration);
        out.println("5. " + later);
        /* 2022-11-03T11:00 */

        period = Period.of(2,3,5);
        out.println("6. "
                + period.getYears() + " years, "
                + period.getMonths() + " months and "
                + period.getDays() + " days");
        /* 2 years, 3 months and 5 days */

        period = Period.ofMonths(2);
        // period.plusHours(3); // will not compile




    }
}
