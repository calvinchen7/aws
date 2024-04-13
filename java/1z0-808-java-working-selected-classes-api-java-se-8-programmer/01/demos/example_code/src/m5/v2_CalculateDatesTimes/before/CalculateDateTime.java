package m5.v2_CalculateDatesTimes.before;

import java.time.LocalDate;

import static java.lang.System.out;

public class CalculateDateTime {
    public static void main(String[] args) {

        out.println("\n** Calculate Dates and Times ** \n");

        /* Create a LocalDate for an arbitrary date */
        LocalDate date = LocalDate.of(2022, 10, 31);
        out.println(date);
        /* 2022-10-31 */

    }
}
