package m5.v2_CalculateDatesTimes.after;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.lang.System.out;

public class CalculateDateTime {
    public static void main(String[] args) {

        out.println("\n** Calculate Dates and Times ** \n");

        /* Create a LocalDate  */
        LocalDate date = LocalDate.of(2022, 10, 31);
        out.println("1. " + date);
        /* 2022-10-31 */

        LocalDate tempDate = date.plusYears(3);
        out.println("2. " + tempDate);
        /* 2022-10-31 */

        LocalTime time = LocalTime.of(9,00);
        out.println("3. " + time);
        /* 09:00 */

        LocalTime tempTime = time.plusNanos(3);
        out.println("4. " + tempTime);
        /* 09:00:00.000000003 */

        out.println("5 . " + date);
        /* 2022-10-31 */
        tempDate = date.minusDays(3);
        out.println("6. " + tempDate);
        /* 2022-10-28 */

        LocalDateTime dateTime = LocalDateTime.of(date,time);
        out.println("12. " + dateTime);
        /* 2022-10-31T09:00 */

		LocalDateTime tempDateTime =
                dateTime.plusDays(3)
                        .plusMonths(2)
                        .plusHours(4);
        out.println("13. " + tempDateTime);
        /* 2023-01-03T13:00 */

        /* You can compare two dates for equality using the equals method */
        LocalDate date1 = LocalDate.of(2022, 10, 31);
        LocalDate date2 = LocalDate.of(2022, 10, 31);
        out.println("14. " + date1.equals(date2));
        /* true */

		date2 = date2.plusDays(3);
		out.println("15. " + date2.isAfter(date1));
		/* true */
		out.println("16. " + date2.isBefore(date1));
        /* false */

        date1 = LocalDate.now( );
        // date2 = date1.minusHours( 3 ); // will not compile

    }
}
