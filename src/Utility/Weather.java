package Utility;

import java.util.Scanner;
public class Weather {
public static double windchill(double t, // Temperature
                               double v) { // velocity in MPH
    return 35.75 + 0.6215*t + (0.4275*t -35.75)*Math.pow(v, 0.16);
}
public static void main(String [] args){

    // used for getting input from the keyboard
    Scanner kbd = new Scanner(System.in);

    System.out.print("Enter temperature in degrees F: ");

    if (kbd.hasNextDouble()) {
        double temp = kbd.nextDouble();
    }
    else {
        System.out.println("Error: please enter a decimal number. You entered %f", kbd.next())
    }
    double temp = kbd.nextDouble();

    System.out.print("Enter a wind velocity in MPH: ");

    double velocity = kbd.nextDouble();



    System.out.printf("Windchill for %.1f degrees at %.1f MPH is %.2f\n",
            temp, velocity, windchill(temp,velocity));
    System.out.println("They said \"don't do it\".");
}
}
