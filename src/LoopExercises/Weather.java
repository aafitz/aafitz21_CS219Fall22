package LoopExercises;

import java.util.Scanner;
public class Weather {

public static double getVelocity(Scanner s){
    boolean valid = false;
    double velocity = 0;
    while (!valid) {
        System.out.print("Enter a wind velocity in MPH: ");
        if (s.hasNextDouble()) {
            velocity = s.nextDouble();
            if (velocity < 0) {
                System.out.printf("Error velocity cannot be negative. You entered %.2f", velocity);

            }
            else {
                valid = true;
            }
        }   else {
            System.out.printf("Error:please enter a decimal number. You entered \"%s\"\n", kbd.next());

        }//while
        return velocity;
}
    public static double windchill(double t, double v); { // velocity in MPH
    return 35.75 + 0.6215*t + (0.4275*t -35.75)*Math.pow(v, 0.16);
}
public static void main(String [] args){

    // used for getting input from the keyboard
    Scanner kbd = new Scanner(System.in);
    double velocity = getVelocity(kbd);
    double temperature = getemp(kbd);


        System.out.printf("Windchill for %.1f degrees at %.1f MPH is %.2f\n",
                temp, velocity, windchill(temp,velocity));
        //System.out.println("They said \"don't do it\".");
    }
}

// while(true) {
//System.out.print("Enter wind velocity in MPH: ");
//if (kbd.hasNextDouble()) {
    //   velocity = kbd.nextDouble();
    //  break;
    //     }






    double temp;
public static double getTemp
        System.out.println("Enter temperature in degrees F: ");
        if (kbd.hasNextDouble()); {
          double  temp = kbd.nextDouble();
        } else {
            System.out.printf("Error: please enter a decimal number. You entered %s",
                    kbd.next());
        }
    }



    double temp = kbd.nextDouble();

public static double getTemp(Scanner s){
        boolean valid = false;
        double velocity = 0;
        while (!valid) {
            System.out.print("Enter a temperature velocity in degrees celsius: ");
            if (s.hasNextDouble()) {
                velocity = s.nextDouble();
                {
                    System.out.printf("Error you must enter a number. You entered %.2f", velocity);

                }
                else {
                    valid = true;
                }
            }   else {
                System.out.printf("Error:please enter a decimal number. You entered \"%s\"\n", kbd.next());

            }//while
            return velocity;
        }