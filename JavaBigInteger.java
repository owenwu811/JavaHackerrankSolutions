//https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

// my own solution using java:

// just follow instructions exactly by importing BigInteger and using inbuilt methods

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger val = sc.nextBigInteger();
        BigInteger two = sc.nextBigInteger();
        System.out.println(val.add(two));
        System.out.println(val.multiply(two));
        
    }
}
