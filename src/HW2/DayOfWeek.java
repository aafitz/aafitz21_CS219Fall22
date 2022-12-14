package HW2;
import java.util.Scanner;

public class DayOfWeek {
    // create a function
    public static int dayofweek(int m, int d, int y) {
// import in the equations used in this function
        int y0 = y - (14 - m) / 12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = m + 12 * ((14 - m) / 12) - 2;

        return (d + x + 31 * m0 / 12) % 7;
    }

    // create a main function
    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);
// prompt user to import #'s for the variables
        System.out.print("Enter a month as an integer: ");
        int m = kbd.nextInt();

         System.out.print("Enter a day as an integer: ");
        int d = kbd.nextInt();

        System.out.print("Enter a year as an integer: ");
        int y= kbd.nextInt();
// print the day that the date they imported fell on as an integer
        // tell user what the integer stands for.
        System.out.printf("The day of the week the date fell on is: %d\n", (dayofweek(m, d, y)));
        System.out.println("The number you get corresponds to the number day of the week it is ex: 1 = Monday.");
    }

}
