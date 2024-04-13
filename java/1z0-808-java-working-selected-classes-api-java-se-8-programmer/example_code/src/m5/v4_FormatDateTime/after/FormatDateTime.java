package m5.v4_FormatDateTime.after;
import static java.lang.System.out;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {

    public static void main(String[] args) {

        out.println("\n** Dates and Times, Part 2 ** \n");

        /* Create arbitrary local dates and times and time zoned date time */
        LocalDateTime localDateTime = LocalDateTime.of(
                2022,10,31,
                9,45);



        /* Create a DateTimeFormatter with format pattern */
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern(
                "EEEE, LLLL dd, yyyy 'at' hh:mm");
        String dateTimeString = localDateTime.format(pattern);
        out.println(dateTimeString); // Monday, October 31, 2022 at 09:45

        /* invalid pattern applied to Local Time */
        LocalTime localTime = LocalTime.of(
                9,45, 00,00);
        //dateTimeString = localTime.format(pattern);

    }
}

