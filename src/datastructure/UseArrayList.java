package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList <String> arraylist= new ArrayList<>();
        arraylist.add("Akli");
        arraylist.add("Ayan");
        arraylist.add("Elyan");
        arraylist.add("Jeff");
        arraylist.add("Menad");
        System.out.println(arraylist);
        arraylist.remove("Ayan");
        arraylist.remove(2);
        System.out.println("my names after removing are : ");
        for (int a=0; a<arraylist.size();a++){
            System.out.println(arraylist.get(a));

        }
        System.out.println("====================================================================");

        Iterator<String> itobje = arraylist.iterator();

        System.out.println(itobje.next());

        System.out.println(itobje.hasNext());
        System.out.println("-----------");
        while (itobje.hasNext())
            System.out.println(itobje.next());
        System.out.println("this is from for loop : ");

        for (Object A : arraylist) {
            System.out.println(A);

        }



    }

}
© 2019 GitHub, Inc.