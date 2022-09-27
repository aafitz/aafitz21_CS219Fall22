package Exam1;
import java.util.Scanner; // imports scanner

public class Exam1 {

    public static int getNumbers(Scanner kbd) {
        c = 0; // count variable
        int n = getNumbers(kbd);
        while (n > 0) ;
        kbd.nextInt(); // while number is greater than zero go to next integer entered
        if (n.charAt() > 2) ; // if the character at index  is greater than 2 add to count
        c++;
        n.charAt() == a; // stores the number at index whatever as a so that it can be stored
        // and printed later
        return a;
    }

} else {
        kbd.nextInt(); // go to the next integer
if (n.CharAt() < 7);
c ++;
n.charAt() == b;

    }

    return c; // returns count


    public static void main(String [] args) { // creates a main function

        Scanner kbd = new Scanner(System.in); // names scanner:kbd // gets input from keyboard
        System.out.println("Enter an integer "); // prompts user to enter an integer

        System.out.println("9682345"); // used to validate/ check the program
    System.out.println('a', 'b', "count is : ", 'c');
    }
    public static int number(Scanner kbd) { // validates and makes sure that what the user is inputting is an integer
        boolean valid = false; //creates  true/false term
        int getNumbers = 0; //starts at zerp
        while(!valid) { //while boolean = true print enter an integer
            System.out.println("Enter an integer");

            if (kbd.hasNextInt()) { // if what the user entered has an int then look at the next one
                getNumbers = kbd.nextInt();
                    if (getNumbers < 0) ; // if what they entered is less than zero or negative- print an error
                    System.out.println("Error: need to input a positive number");
                } else { // if it is positive then boolean = true
                    valid = true;
                }
            } else {
                String input = kbd.next(); // checks for a string -- if finds one then it is printed and an error is printed
                System.err.printf("Error: input should be an integer ypu entered: \"%s\"\n", input);

        }
// this will continue asking the user to input an integer until they enter a valid integer- if they enter a negative number or string then they get an error and have to enter again.
    }

    return getNumbers; // returns the input
}


    }
}
