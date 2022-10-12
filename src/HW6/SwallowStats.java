 package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;

public class SwallowStats {

    public static void swallow_stats() {

        // connect to the webpage of speeds
        URL url = null; //null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double sum = 0.0;
        int count = 0;
        double max = 0;
        double min = Double.POSITIVE_INFINITY;

        //read each line of the web file
        while (true) {
            if (!s.hasNextLine())
                break;

            String line = s.nextLine(); //read a line of the website

            if (line.indexOf("#") == -1 && !line.equals("")) { // modify condition --- to see if line is empty blank, look at length of line!
                sum = sum + Double.parseDouble(line);
                count++;
                if(min > Double.parseDouble(line)){ // if the min is greater than the data on the line then change min to that number
                    min = Double.parseDouble(line);
                }
                if (max < Double.parseDouble(line)){
                    max = Double.parseDouble(line);
                }
            }
        }
        System.out.printf("Average swallow speed is %.2f\n", sum / count); //prints average swallow speed
        System.out.printf("The maximum swallow speed is %.2f\n", max); //prints the max swallow speed
        System.out.printf("The minimum swallow speed id %.2f\n", min); //prints the min swallow speed




            //System.out.println(line);
            // what is true?--- if get here then able to connect to website
        }


    public static void main(String [] args){
        swallow_stats();

    } }


