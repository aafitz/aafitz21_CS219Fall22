package HW3;
import Utility.Investment;

import java.util.Scanner;

public class investment {
    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);
    }
        public static void main(String  [] args) {

        // read c, r, t, n <- prompt the user for c, r, t, n

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a amount for the initial deposit as a decimal: ");
        if (!kbd.hasNextDouble()) {
            String x = kbd.next();
            System.out.println("Error: decimal expected" + "you entered " + x);
            System.exit(1);
        }

        double c = kbd.nextDouble();


        if (c < 0) {
            System.out.println("Error: initial deposit should be greater than zero" + " you entered" + c);
            System.exit(1);
        }




        System.out.print("Enter  a yearly interest rate as a decimal: ");
        if (!kbd.hasNextDouble()) {
            String x = kbd.next();
            System.out.println("Error: decimal expected" + "you entered " + x);
            System.exit(1);
        }

        double r = kbd.nextDouble();


        if(r < 0) {
            System.out.println("Error:yearly interest rate should be greater than zero "+ " you entered" + r);
            System.exit(1);
        }



        System.out.print("How many years will this investment be in the bank? please enter as an integer: ");
        if (!kbd.hasNextInt()) {
            String x = kbd.next();
            System.out.println("Error: whole number expected" + " you entered " + x);
            System.exit(1);
        }
        int t = kbd.nextInt();


        if(t < 0) {
            System.out.println("Error: number of years should not be a negative number"+ " you entered " + t);
            System.exit(1);
        }



        System.out.print("How many times is the interest compound per year?: ");
        if (!kbd.hasNextInt()) {
            String x = kbd.next();
            System.out.println("Error: decimal expected" + " you entered " + x);
            System.exit(1);
        }
        int n = kbd.nextInt();

        if(n < 0) {
            System.out.println("Error: number of times compound should be greater than zero"+ " you entered " + n);

        // call the function with the inputted values

        }
            System.out.printf("Your investment is worth %.2f ",
                    investment(c,r,t,n));
} }

