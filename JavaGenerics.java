
//https://www.hackerrank.com/challenges/java-generics/problem

// my own solution using java:

// just use Object

import java.io.*;
import java.util.*;

public class Solution {
    private static void printval(Object val) {
        System.out.println(val);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Object> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add("Hello");
        ar.add("World");
        for (Object e: ar) {
            System.out.println(e);
        }
    }
}
