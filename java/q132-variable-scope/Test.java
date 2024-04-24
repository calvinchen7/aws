import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    static int a1;

    public static void doProduct(Integer a){
        a1 = a * a;
    }

    public static void doString(StringBuilder s) {
        s.append(" " + s);
    }

    public static void main(String[] args) {
        String [] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf((String s) -> {return s.length() <= 2;})) {
            System.out.println(s + "removed");
        }
    }
}