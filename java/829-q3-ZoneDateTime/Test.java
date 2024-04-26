import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Chicago");
        ZonedDateTime zdt = ZonedDateTime.of(
        LocalDate.of(2021, 11, 7),
        LocalTime.of(1, 30),
        zoneId
        );
        ZonedDateTime anHourLater = zdt.plusHours(1);
        System.out.println(zdt.getHour() == anHourLater.getHour());
        System.out.print(zdt.getOffset().equals(anHourLater.getOffset()));
    }

}