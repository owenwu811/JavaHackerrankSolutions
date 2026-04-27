//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

//Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

// my own solution using java:

// get both strings, convert to char array to sort them, sort them, and then compare contents

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String one = sc.next().toLowerCase();
        String two = sc.next().toLowerCase();
        char[] o = one.toCharArray();
        char[] t = two.toCharArray();
        Arrays.sort(o);
        Arrays.sort(t);
        if (Arrays.equals(o, t)) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
        
    }
}
