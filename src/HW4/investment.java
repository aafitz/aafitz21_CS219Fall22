//package HW4;
// import java.util.Scanner;
//
//public class investment {
//    public static double investment2(double c, double r, int t, int n) {  // read c, r, t, n <- prompt the user for c, r, t, n
//        return c * Math.pow(1 + r / n, t * n);
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
//        while (!valid) {
//            System.out.print("Enter  a yearly interest rate as a decimal: ");
//
//            if (kbd.hasNextDouble()) {
//                r = kbd.nextDouble();
//                if (r < 0) {
//                    System.out.println("Error: yearly interest rate should be greater than zero" + "you entered " + r);
//                } else {
//                    valid = true;
//                }
//            } else {
//                String input = kbd.next();
//                System.err.printf("Error: yearly interest rate should be a decimal, you entered \"%s\"\n", input);
//            }
//        }
//        return r;
//    }
//
//    public static int years(Scanner kbd) {
//        boolean valid = false;
//        int t = 0;
//        while (!valid) {
//
//            System.out.print("How many years will this investment be in the bank? please enter as an integer: ");
//
//            if (!kbd.hasNextInt()) {
//                t = kbd.nextInt();
//                if (t < 0) {
//                    System.out.println("Error: whole number expected" + " you entered " + t);
//                } else {
//                    valid = true;
//                }
//            } else {
//                String input = kbd.next();
//                System.err.printf("Error: number of years should be a whole number, you entered \"%s\"\n", input);
//            }
//        }
//        return t;
//    }
//
//
//
//            public static void main(String[]args){
//                Scanner kbd = new Scanner(System.in);
//                double deposit;
//                double interest;
//                int years;
//                double compu;
//
//                while(true){
//                    System.out.println('Enter your intial deposit');
//                    if(kbd.hasNextDouble()){
//                        deposit = kbd.nextDouble();
//                        if(deposit < 0){
//                            System.out.println("Deposit must be a positive whole number you entered \"%.1f\"", deposit);
//                        }
//                    }
//                }
//
//                double initalD = deposit(kbd);
//                System.out.println(initalD);
//                System.out.printf("Your investment is worth %.2f ",
//                        investment2(c,r,t,n));
//                // double final = investment2(initalD)
//            }
//        }
//
//
//
