package string.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;


public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        List<String> list = Arrays.asList(st.split(" "));


        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.print(word + ": " + Collections.frequency(list, word) + " time(s)");


        }
        System.out.println(st.length());
        System.out.println(list.size());
        System.out.println("========================");

        double TotalCharacters;
        double AverageOfWords;

        TotalCharacters = st.length()- (list.size()-1);
        System.out.println("The Total Character of The String st is : "+TotalCharacters);

        AverageOfWords = TotalCharacters / list.size();
        System.out.println("The Average Length Of The Word in a String st is : "+AverageOfWords);

    }

}