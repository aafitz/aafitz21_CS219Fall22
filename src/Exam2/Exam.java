package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exam {
    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }

        return words;
    }


    // need to save the palindrome words into a new array


    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }
    public static boolean isPalindrome2(String s) {
        if (s.length() < 2)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome2(s.substring(1,s.length() - 1)))
            return true;
        else
            return false;
    }



    public static void main(String [] args) {
        System.out.println(reverse("anna"));
        System.out.println(reverse("racecar"));
        System.out.println(isPalindrome2("racecar"));
        System.out.println(isPalindrome2("anna"));
        System.out.println(isPalindrome2("bat"));

    }
}
