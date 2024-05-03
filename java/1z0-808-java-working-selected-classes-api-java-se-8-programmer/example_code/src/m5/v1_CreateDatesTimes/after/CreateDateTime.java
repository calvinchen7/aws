package m5.v1_CreateDatesTimes.after;
import static java.lang.System.out;

import java.time.*;

public class CreateDateTime {

    public static void main(String[] args) {

        out.println("\n** Create Dates and Times ** \n");

        /* Create current local dates and times and time zoned date time */
        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        /* Create a LocalDate for an arbitrary date */
        localDate = LocalDate.of(2022,10,31);
        out.println(localDate); //  2022-10-31


        /* Create a LocalDateTime for an arbitrary date and time*/
        localDateTime = LocalDateTime.of(
                2022,10,31,
                9,45);
        out.println(localDateTime); // 2022-10-31T09:45

        zonedDateTime = ZonedDateTime.of(
                2022,10,31,
                9,45,00,00,
                ZoneId.of("America/Chicago"));
        out.println(zonedDateTime); // 2022-10-31T09:45-85:00[America/Chicago]

        LocalDate.of(2022, Month.JANUARY, 1);

        //LocalDate date = new LocalDate(2022, 2, 20);

        //LocalDate.of(2022, 13, 1);

        //LocalDate.of(2022, 12, 32);

        //LocalDate.of(2022, Month.APRIL, 31);

    }
}