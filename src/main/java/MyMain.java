import sun.jvm.hotspot.opto.Block_Array;

import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int a_counter = 0;
        int b_counter = 0;
        int c_counter = 0;
        int nothing = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == ('a')) {
                a_counter++;
            } else if (str.charAt(i) == ('b')) {
                b_counter++;
            } else if (str.charAt(i) == ('c')) {
                c_counter++;
            } else {
                nothing = 0;
            }
        }
        System.out.println("there are " + a_counter + " a, " + b_counter + "b, and " + c_counter + "c in the sentence. ");


        return(a_counter + b_counter + c_counter);
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int the_test = str.indexOf("The");
        int the_test2 = str.indexOf("the");
        if(the_test >= 0) {
            System.out.println("It contains 'The'");
            return true;
        }
        if(the_test2 >= 0) {
            System.out.println("It contains 'the'");
            return true;
        }
        else{
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String x = "";
        for (int i = str.length()-1; i>=0; i--) {
            x = x + str.charAt(i);
        }
        if (x.equals(str)){
            System.out.println("It is a palindrome.");
            return true;
        }
        else {
            System.out.println("It is not a palindrome.");
            return false;
        }

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scan.nextLine();
        System.out.println(countABC(str));
        System.out.println(containsThe(str));
        System.out.println(isPalindrome(str));
    }
}
