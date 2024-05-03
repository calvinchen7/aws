package m3.v2_LambdaExpressions.before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

import static java.lang.System.out;

public class LambdaExpressions {
    public static void main(String [] args) {

        out.println("\n** Lambda Expressions ** \n");

        String[] array_1 = {"red", "green", "blue"};
        ArrayList<String> aList_1 = new ArrayList(Arrays.asList(array_1));

        Consumer<String> anonConsumer = new Consumer<String>() {
            public void accept(String str) {
                out.println(" - " + str);
            }
        };

        out.println("2. forEach using Anonymous Class");
        aList_1.forEach(anonConsumer);
    }
}
