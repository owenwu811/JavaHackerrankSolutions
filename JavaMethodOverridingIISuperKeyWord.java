
//https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?isFullScreen=true

//When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

//You are given a partially completed code in the editor. Modify the code so that the code prints the following text:

//Hello I am a motorcycle, I am a cycle with an engine.
//My ancestor is a cycle who is a vehicle with pedals.

// correct java solution (could not solve on my own):

import java.io.*;
import java.util.*;

class Vehicle {
    void print() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}
class Cycle extends Vehicle {
    void print() {
        super.print();
    }
}

class MotorCycle extends Cycle {
    void print() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.print();
    }
}   
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        MotorCycle m = new MotorCycle();
        m.print();
        
        
    }
}
