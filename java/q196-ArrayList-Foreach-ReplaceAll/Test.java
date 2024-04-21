import java.util.*;
public class Test {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0, "Java");
        arrayList.forEach(a -> a.concat("Forum"));
        arrayList.replaceAll(s -> s.concat("Group"));
        System.out.println(arrayList);
    }

}
