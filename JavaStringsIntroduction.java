//https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

//The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

//Given two strings of lowercase English letters,  and , perform the following operations:

//Sum the lengths of  and .
//Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//Capitalize the first letter in  and  and print them on a single line, separated by a space.


// correct java solution (forgot substring syntax of how to make only 1st capital):

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        System.out.println(first.length() + second.length());
        if (first.compareTo(second) > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        String one = first.substring(0, 1).toUpperCase() + first.substring(1, first.length()).toLowerCase();
        String two = second.substring(0, 1).toUpperCase() + second.substring(1, second.length()).toLowerCase();
    
        System.out.print(one + " " + two);
    }
}
