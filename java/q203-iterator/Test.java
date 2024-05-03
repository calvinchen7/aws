import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<String> Ist = Arrays.asList("EN", "FR", "CH", "JP");
        Iterator<String> itr = Ist.iterator();
        while(itr.hasNext()) {
            String e = itr.next();
            if(e == "CH" ) {
            break;
            }
            System.out.println(e + " ");
        }
    }

}
