import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate testDate = LocalDate.of(2012, 1, 32);
        testDate.plusDays(10);
        System.out.println(testDate);
    }
}
