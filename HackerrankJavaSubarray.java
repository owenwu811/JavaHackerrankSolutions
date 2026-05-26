//https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

//We define the following:

//A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
//The sum of an array is the total sum of its elements.
//An array's sum is negative if the total sum of its elements is negative.
//An array's sum is positive if the total sum of its elements is positive.
//Given an array of  integers, find and print its number of negative subarrays on a new line.

// my own solution using java:

// parse the input, put it into an arraylist, and sum every subarray and count negatives

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (sc.hasNext()) {
            ar.add(Integer.valueOf(sc.next()));
        }
        ar.remove(0);
        int ans = 0;
        for (int i = 0; i < ar.size(); i++) {
            Integer tot = 0;
            for (int j = i; j < ar.size(); j++) {
                tot += ar.get(j);

                if (tot < 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        
        
    }
}
