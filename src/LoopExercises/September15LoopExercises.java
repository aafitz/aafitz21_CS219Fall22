package LoopExercises;

public class September15LoopExercises {
}
package LoopExercises;

public class September15LoopExercises {
    /*
     * Return the sum of the digits mod 10 of an integer. This is one example of
     * a checksum of the integer n.  For example, the checksum of 4198 is
     *
     *     4198 = (4 + 1 + 9 + 8) % 10 = 2
     *
     * Checksums are used to detect errors in network communications.
     *
     * checksum(4198) == 2
     */
    public static boolean checksum(int n) {
        int check = 0;
        while(n > 0) {
            check = check + (n % 10);
            n = n / 10;
        }
        return check % 10;
    }

public static void main(String[] args){
    System.out.println(checksum(4298)==3);
}
    /*
     * count7s  returns the number of times the digit 7 appears in
     * the parameter n.
     *
     * count7s(1727337) = 3
     * count7s(1234) = 0
     * count7s(777777) = 6
     *
     * Question: Does the function work if n is negative?
     */
    public static int count7s(int n) {
        return -1;  // just to shut up error message
    }

    /*
     *  If we list all the natural numbers below 10 that are multiples
     *  of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     *  Find the sum of all the multiples of 3 or 5 below 1000.
     *
     *  https://projecteuler.net/problem=1
     *
     *  n should be non-negative
     *  sum3or5(10) = 23
     *  sum3or5(1000) = 233168
     */
    public static int sum3or5(int n) {
        return -1;  // shut up error message
    }
    /*
     * Return the first factor of n greater than 1
     * and less than n. If no factors return -1.
     * Notice that this function uses longs and not ints.
     *
     *  factor(59953793) == 7727
     *  factor(1531482031) == -1
     *  factor(7304692485435694493L) == -1;
     *
     * Question: Notice the letter L on the end of the largest integer above?
     *           Any guess of what it means or why it is there?  What happens if
you
*           remove it?
     */
    public static long factor(long n) {
        return -1; // shut up error message
    }
    /*
     * Write a function stars(n) that wil print n asterisks
     * on the console window.
     *
     * stars(5) will print *****
     *
     * Question: Why is this a void function?
     */
    public static void stars(int n) {
        // fill in code
    }
    /*
     * Write a function triangle that takes an integer n and will print
     * a right triangle of n rows where the first row has 1 asterisk
     * and the nth row has n asterisks, For example,
     *
     * triangle(5) will print
     *
     *         *
     *         **
     *         ***
     *         ****
     *         *****
     *
     *  Hint: use the function stars you defined above.
     */
    public static void triangle(int n) {
        // fill in code
    }
    /*
     *  Fizz Buzz
     *
     *  Write a function fizzbuzz that takes an integer n and
     *  prints out the integers from 1 to n. If the number is
     *  divisible by 3 print "fizz" instead of the number. If
     *  the number is divisible by 5 then print "buzz" instead
     *  of the number. And if it is divisible by 3 and 5 it prints "fizz buzz".
     *
     *  For example, calling fizzbuzz(16) would print
     *  1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizz buzz 16
     *
     *  Instead of commas you can print each entry on its own line.
     *
     *  https://en.wikipedia.org/wiki/Fizz_buzz
     *
     */
    public static void fizzbuzz(int n) {
        // fill in code
    }
/*
     */