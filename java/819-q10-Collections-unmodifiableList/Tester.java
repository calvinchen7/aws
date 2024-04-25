import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Tester {


    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        List<String> list2 = Collections.unmodifiableList(list1);
        list1.add("C");

        System.out.println(list1);
        System.out.println(list2);

        list2.add("D");
    }
}
