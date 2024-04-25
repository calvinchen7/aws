import java.util.ArrayList;
import java.util.List;

public class Patient {
    String name;
    public Patient (String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        List ps = new ArrayList();
        Patient p2 = new Patient ("Mike");
        ps.add(p2);

        /* A */
        int f = ps.indexOf(p2);

        if (f >= 0) {
            System.out.println("Mike Found");
        }
    }

}