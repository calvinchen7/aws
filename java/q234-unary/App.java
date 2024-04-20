import java.util.Arrays;
import java.util.List;
public class App {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("A","B","C","D");
        
        int idx= lst.size();
        while(idx>= 1){
        System.out.println(lst.get(--idx));
        }
    }
}