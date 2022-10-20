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
        boolean valid = false;
        int n = 0;
        Scanner kbd = new Scanner(System.in);
        while (!valid) {
            System.out.println("Please enter an integer: ");
            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                if (n < 0) {
                    System.out.println("Error:Make sure to enter an integer, you entered " + n);
                } else {
                    valid = true;
                }
            } else {
                String input = kbd.next();
                System.out.println("Error: must be an integer, you entered " + input);
            }




        }
        return n;
    }
        public static void main(String[] args) {
            int n = ValidateInput();

            System.out.print(numberOfDigits(n));
        }
    }