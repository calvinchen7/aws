import java.util.*;
public class Test {
    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(s -> { System.out.print(s); return s.length() <=2;})) {
            System.out.println(arrList); //you can uncomment this print statement to see Hi getting
            //removed from arraylist.
            System.out.println(" removed");
        }
    }   
}
