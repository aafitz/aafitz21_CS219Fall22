package Exam1;
import java.util.Scanner;

public class Exam1Corrections {
    public static int numberOfDigits(int n) {
        int count = 0;
        int x = 0;
        while (n > 0) {
            x = n % 10;
            if (x > 2 && x < 7) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static int ValidateInput() {
        int n;
        Scanner kbd = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter an integer: ");
            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                else {
                    break;
                }
            }
            else if (kbd.hasNextDouble()) {
                System.out.printf("Make sure to enter an integer, you entered %f\n ", kbd.nextDouble());
            } else {
                System.out.printf("Make sure to enter an integer, you entered %s\n ", kbd.next());
            }
        }
        return n;

}

    public static void main(String[] args) {
        int n = ValidateInput();

        System.out.print(numberOfDigits(n));
}}

