//https://www.hackerrank.com/challenges/java-substring/problem

//Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

//Input Format

//The first line contains a single string denoting .
//The second line contains two space-separated integers denoting the respective values of  and .

// my own solution using java:

// just use the .substring method


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        Integer start = sc.nextInt();
        Integer end = sc.nextInt();
        System.out.println(word.substring(start, end));
        
    }
}
