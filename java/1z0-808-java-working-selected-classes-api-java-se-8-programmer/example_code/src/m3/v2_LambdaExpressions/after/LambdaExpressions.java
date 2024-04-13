package m3.v2_LambdaExpressions.after;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

import static java.lang.System.out;

public class LambdaExpressions {
    public static void main(String [] args) {

        out.println("\n** Lambda Expressions ** \n");

        String[] array_1 = {"red", "green", "blue"};
        ArrayList<String> aList_1 = new ArrayList(Arrays.asList(array_1));

        Consumer<String> anonConsumer = new Consumer<String>(){
            public void accept(String str){
                out.println(" - " + str);
            }
        };

        out.println("2. forEach using Anonymous Class");
        aList_1.forEach(anonConsumer);

        Consumer<String> lambdaConsumer = (String str) -> {out.println(str);};
        lambdaConsumer = str -> {out.println(" - " + str);};
        lambdaConsumer = str -> out.println(" - " + str);

        out.println("3. forEach using reference to Lambda Expression Reference");
        aList_1.forEach(anonConsumer);

        out.println("4. forEach using reference to Lambda Expression In-Line");
        aList_1.forEach(str -> out.println(" - " + str));

        aList_1.sort((str1,str2) -> str1.compareTo(str2));
        out.println("5. sort using Lambda Expression Inline");
        aList_1.forEach(name -> System.out.println(" - " + name));



    }
}
