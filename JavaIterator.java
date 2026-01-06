
//https://www.hackerrank.com/challenges/java-iterator/problem?isFullScreen=true

//Java Iterator class can help you to iterate through every element in a collection. 

// correct solution (could not solve on my own):

import java.io.*;
import java.util.*;

public class Solution {

    public static void func(ArrayList<Object> mylist) {
        Iterator<Object> it = mylist.iterator();
        
        // Skip until "###"
        while (it.hasNext()) {
            if (it.next().equals("###")) break;
        }

        // Print everything after "###"
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> mylist = new ArrayList<>();

        // Read integers first
        while (sc.hasNextInt()) {
            mylist.add(sc.nextInt());
        }

        // Add the special string "###"
        mylist.add("###");

        // Read remaining strings
        while (sc.hasNext()) {
            mylist.add(sc.next());
        }

        func(mylist);
        sc.close();
    }
}
