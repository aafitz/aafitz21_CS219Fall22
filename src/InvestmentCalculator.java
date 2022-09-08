import Utility.Investment;
import java.util.Scanner;
public class InvestmentCalculator {
    public static void main(String  [] args) {

        // read c, r, t, n <- prompt the user for c, r, t, n

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a amount for the initial deposit as a decimal: ");
        double c = kbd.nextDouble();

        System.out.print("Enter  a yearly interest rate as a decimal: ");
        double r = kbd.nextDouble();

        System.out.print("How many years will this investment be in the bank? please enter as an integer: ");
        int t = kbd.nextInt();

        System.out.print("How many times is the interest compund per year?: ");
        int n = kbd.nextInt();


        // call the function with the inputted values

        System.out.printf("Your investment💰💰💸💲🤑 is worth %.2f ",
                Investment.investment(c,r,t,n));


        System.out.println(Investment.investment(1, 1, 1, 1000000000));

    }
}
