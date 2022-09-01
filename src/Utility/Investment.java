package Utility;

public class Investment {
    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r/n, t*n);

    }
    public static void main(String [] args) {
        //double c = 1.0;  // initial deposit
        //double r = 1.0; // 100% interest
        //int t = 1;     // number of years
       // double n = 2e9;  // number of times to compound the interest a billion times
       // double p = c * Math.pow(1 + r/n, t*n);

        System.out.println(investment( 1.0,  1.0,  1,(int)1e9)); // must call the function "investment" here
    // can change the above numbers tp whatever they may be... as long as they matched what type you declared each variable to be
        System.out.println(investment( 1000, 0.03, 10, 365));
    }
}
