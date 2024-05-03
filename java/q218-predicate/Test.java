import java.util.function.Predicate;

public class Test {


    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n %2 ==0;
        Boolean test = p.test(100);
        System.out.println(test);
    }
}
