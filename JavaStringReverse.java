//https://www.hackerrank.com/challenges/java-string-reverse/problem

//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

//Given a string , print Yes if it is a palindrome, print No otherwise.

/// correct java solution (Could not solve on my own - come back to review later)

// use StringBuilder to reverse it and back to string

import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String r = new StringBuilder(input).reverse().toString();
        if (input.equals(r)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
    }
        
    }
}
