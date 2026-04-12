// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true


//Task
//In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

//Input Format

//There are 3 lines of input, and each line contains a single integer.

// my own solution using java:

// just read input 3 times and print it

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Integer one = sc.nextInt();
        Integer two = sc.nextInt();
        Integer three = sc.nextInt();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
