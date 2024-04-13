package m2.v3_InspectingTraversingArrayLists.before;

import static java.lang.System.out;

import java.util.*;

public class InspectingTraversingArrayLists {
    public static void main(String[] args) {

        out.println("\n** Inspecting and Traversing ArrayLists ** \n");

        String[] array_1 = {"red", "green", "blue"};
        ArrayList<String> aList_1 = new ArrayList(Arrays.asList(array_1));
        out.println("1. aList_1 = " + aList_1.toString());

    }
}
