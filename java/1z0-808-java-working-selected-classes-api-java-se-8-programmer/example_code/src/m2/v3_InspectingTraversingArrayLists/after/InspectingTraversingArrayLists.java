package m2.v3_InspectingTraversingArrayLists.after;

import java.util.*;

import static java.lang.System.out;

public class InspectingTraversingArrayLists {
    public static void main(String[] args) {

        out.println("\n** Inspecting and Traversing ArrayLists ** \n");

        String[] array_1 = {"red", "green", "blue"};
        ArrayList<String> aList_1 = new ArrayList(Arrays.asList(array_1));
        out.println("1. aList_1 = " + aList_1.toString());

        boolean flag = aList_1.contains("red");
        out.println("2. aList_1 contains \"red\"? " + flag);

        flag = aList_1.contains("orange");
        out.println("3. aList_1 contains \"orange\"? " + flag);

		String[] array_2 = {"green", "blue", "red"};
        ArrayList<String> aList_2 = new ArrayList(Arrays.asList(array_2));
        out.println("4. aList_2 = " + aList_2.toString());

        flag = aList_1.equals(aList_2);
        out.println("5. aList_1.equals(aList_2)? " + flag);
		
		String[] array_3 = {"red", "green", "blue"};
        ArrayList<String> aList_3 = new ArrayList(Arrays.asList(array_3));
        out.println("6. aList_3 = " + aList_3.toString());
		
        flag = aList_1.equals(aList_3);
        out.println("7. aList_1.equals(aList_3)? " + flag);

        aList_3.add("purple");
        out.println("8. aList_3 = " + aList_3.toString());

        flag = aList_1.equals(aList_3);
        out.println("9. aList_1.equals(aList_3)? " + flag);

        out.println("10. aList_1 with for loop:");
        for(String color : aList_1){
            out.println(" - " + color);
        }

        ListIterator<String> iterator = aList_1.listIterator();

        out.println("11. aList_1 with while loop");
        while(iterator.hasNext())
        {
            System.out.println(" - " + iterator.next());
        }

        out.println("12. aList_2 with forEach");
        aList_2.forEach(name -> System.out.println(" - " + name));

        aList_2.sort(null);
        out.println("13. aList_2.sort(null)");
        aList_2.forEach(name -> System.out.println(" - " + name));

    }
}
