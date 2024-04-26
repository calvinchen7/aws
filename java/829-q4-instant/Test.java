import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {
    // Login time: 2021-01-12T21:58:18.817Z
        Instant loginTime = Instant.now();
        Thread.sleep(1000);

        // Logout time: 2021-01-12T21:58:19.880Z
        Instant logoutTime = Instant.now();

        //loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES); // line n1
        //logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);

        if (logoutTime.isAfter(loginTime)) {
            System.out.println("Logged out at: " + logoutTime);
        } else {
            System.out.println("Can't logout");
        }
    }

}