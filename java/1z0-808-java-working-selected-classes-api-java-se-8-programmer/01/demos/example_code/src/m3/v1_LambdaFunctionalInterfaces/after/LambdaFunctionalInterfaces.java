package m3.v1_LambdaFunctionalInterfaces.after;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.function.*;

import static java.lang.System.out;

public class LambdaFunctionalInterfaces {
    public static void main(String [] args) {

        out.println("\n** Lambdas and Functional Interfaces ** \n");

        // Inner class implementation of Consumer
        class InnConsumer<String> implements Consumer<String>{

            @Override
            public void accept(String string) {
                out.println(" - " + string);
            }
        };

        InnConsumer innConsumer = new InnConsumer<String>();

        String[] array_1 = {"red", "green", "blue"};
        ArrayList<String> aList_1 = new ArrayList(Arrays.asList(array_1));

        out.println("1. forEach using Inner Class");
        aList_1.forEach(innConsumer);

        Consumer<String> anonConsumer = new Consumer<String>(){
            public void accept(String str){
                out.println(" - " + str);
            }
        };

        out.println("2. forEach using Anonymous Class");
        aList_1.forEach(anonConsumer);

    }
}
