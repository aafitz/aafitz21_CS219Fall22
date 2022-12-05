//package HW4;
//
//import java.util.Scanner;
//
//public class investment {
//    public static double investment2(double c, double r, int t, int n) {  // read c, r, t, n <- prompt the user for c, r, t, n
//        return c * Math.pow(1 + r / n, t * n);
//    }
//
//    public static double deposit(Scanner kbd) {
//        boolean valid = false;
//        double c = 0;
//        while (!valid) {
//            System.out.println("Enter a amount for the initial deposit as a decimal: ");
//
//            if (kbd.hasNextDouble()) {
//                c = kbd.nextDouble();
//                if (c < 0) {
//                    System.out.println("Error: initial deposit should be greater than zero" + " you entered" + c);
//                } else {
//                    valid = true;
//                }
//
//            } else {
//                String input = kbd.next();
//                System.err.printf("Error: initial deposit should be a decimal you entered \"%s\"\n", input);
//
//            }
//
//        }
//
//        return c;
//
//    }
//
//    public static double rate(Scanner kbd) {
//        boolean valid = false;
//        double r = 0;
//        while(!valid) {
//            System.out.print("Enter  a yearly interest rate as a decimal: ");
//
//            if (!kbd.hasNextDouble()) {
//                String x = kbd.next();
//                System.out.println("Error: decimal expected" + "you entered " + x);
//                System.exit(1);
//            }
//
//            double r = kbd.nextDouble();
//
//
//            if (r < 0) {
//                System.out.println("Error:yearly interest rate should be greater than zero " + " you entered" + r);
//                System.exit(1);
//            }
//
//
//            System.out.print("How many years will this investment be in the bank? please enter as an integer: ");
//            if (!kbd.hasNextInt()) {
//                String x = kbd.next();
//                System.out.println("Error: whole number expected" + " you entered " + x);
//                System.exit(1);
//            }
//            int t = kbd.nextInt();
//
//
//            if (t < 0) {
//                System.out.println("Error: number of years should not be a negative number" + " you entered " + t);
//                System.exit(1);
//            }
//
//
//        }
//
//
//    public static void main(String[] args) {
//        Scanner kbd = new Scanner(System.in);
//        double initalD = deposit(kbd);
//        System.out.println(initalD);
//        // double final = investment2(initalD)
//}
//}
//
