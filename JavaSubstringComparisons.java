
//https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true

//Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

// my own solution using java:

// just get each chunk of size k and do a comparator on smallest and largest

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - k + 1; i++) {
            int low = i;
            int high = i + k;
            String now = s.substring(low, high);
            if (now.compareTo(largest) > 0) {
                largest = now;
            }
            if (now.compareTo(smallest) < 0) {
                smallest = now;
            }
            
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
