package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> players = new LinkedList<>();
        players.add("Zidane");
        players.add("messi");
        players.add("C'Ronaldo");
        players.add("Figo");
        System.out.println("peek : "+players.peek());
        System.out.println("remove : "+players.remove());
        System.out.println("poll : "+players.poll());
        for(String x : players ){
            System.out.println("for loop : "+x);
        }
        System.out.println("=====================");
        Iterator it = players.iterator();
        while(it.hasNext()){
            System.out.println("Iterator : "+it.next());
        }
    }

}
© 2019 GitHub, Inc.