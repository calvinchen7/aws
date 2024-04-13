package m2.v1_CreateArrayList.after;

import java.util.*;

import static java.lang.System.out;

public class CreateArrayList {
    public static void main(String [] args){

        out.println("\n** Create ArrayList ** \n");

        ArrayList aList = new ArrayList();

        ArrayList aList_2 = new ArrayList(10);

        ArrayList<String> aList_3 = new ArrayList<String>();

        ArrayList<String> aList_4 = new ArrayList<>();

        List list_1 = new ArrayList();

        // aList_1 = new List<String>(); // will not compile

        String [] array_4 = {"red", "green", "blue"};

        list_1 = Arrays.asList(array_4);
        out.println("3. list_1 = " + list_1.toString());

        aList_2 = new ArrayList(list_1);
        out.println("4. aList_2 = " + aList_2.toString());

        aList_3 = new ArrayList(Arrays.asList(array_4));
        out.println("5. aList_3 = " + aList_3.toString());

    }
}

