//https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true

//You are given a class Solution and its main method in the editor.
//Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the function add.

//Note: Your add method in the Add class must print the sum as given in the Sample Output

//Input Format

//There are six lines of input, each containing an integer.

//Output Format

//There will be only four lines of output. Each line contains the sum of the integers passed as the parameters to add in the main method.

// my own solution using java:

// just filter out the 1st and 4th ones according to examples

import java.io.*;
import java.util.*;

class Add {
    public void addvals(List<Integer> ar, int cnt) {
        String res = "";
        Integer tot = 0;
        for (int i = 0; i < ar.size(); i++) {
            tot += ar.get(i);
            res += String.valueOf(ar.get(i));
            if (i < ar.size() - 1) {
                res += "+";
            }
            else {
                res += "=";
            }  
        }
        if (cnt != 0 && cnt != 3) {
        res += String.valueOf(tot);
        System.out.println(res);
    }
        
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        Add add = new Add();
        ArrayList<Integer> ar = new ArrayList<>();
        while (sc.hasNextInt()) {
            ar.add(sc.nextInt());
            if (ar.size() >= 2) {
                add.addvals(ar, cnt);
            }
            cnt++;
        }
    }
}
