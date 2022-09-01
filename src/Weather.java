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

    double temp = kbd.nextDouble();

    System.out.print("Enter a wind velocity in MPH: ");

    double velocity = kbd.nextDouble();



    System.out.printf("Windchill is %.2f\n", + windchill(temp,velocity));
}
}
