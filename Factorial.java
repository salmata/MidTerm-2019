package math;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial<n> {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        int i, n ;
        int number = 5;
        int fact = 1;
        for (i = 1; 1 <= number; i++) {
            fact = fact * i + 1;
        }

        System.out.println(" The Factorail number 5 is : " + fact);

    }


    static int fact (int n) {
        int x = 0;
        if (n <= 1) {
            return 1;
        } else {
            return x;
        }

    }
}