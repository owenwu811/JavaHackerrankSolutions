// https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true

//According to Wikipedia, a factory is simply an object that returns another object from some other method call, which is assumed to be "new".

//In this problem, you are given an interface Food. There are two classes Pizza and Cake which implement the Food interface, and they both contain a method getType().

//The main function in the Main class creates an instance of the FoodFactory class. The FoodFactory class contains a method getFood(String) that returns a new instance of Pizza or Cake according to its parameter.

//You are given the partially completed code in the editor. Please complete the FoodFactory class.

//Sample Input 1

//cake
//Sample Output 1

//The factory returned class Cake
//Someone ordered a Dessert!
//Sample Input 2

//pizza
//Sample Output 2

//The factory returned class Pizza
//Someone ordered Fast Food!

// correct java solution (could not solve):

import java.io.*;
import java.util.*;

interface Food {
    String getType();
}

class Pizza implements Food{
    public String getType() {
        return "Fast Food";
    }
}
class Cake implements Food{
    public String getType() {
        return "Dessert";
    }
}
class FoodFactory {
    
    public Food getFood(String f) {
        if (f.equalsIgnoreCase("cake")) {
            return new Cake();
        }
        else {
            return new Pizza();
        }
        
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        FoodFactory f = new FoodFactory();
        Food food = f.getFood(val);
        System.out.println("The factory returned class " + food.getClass().getSimpleName());
    
        System.out.println("Someone ordered a " + food.getType() + "!");
        
}
}
