package ArrayExaxmples;

import java.util.Arrays;
import java.util.Random;

public class Examples{


    public static void f(int x){
        x = 7;

    }
    // function to fill an array of integers
    //with random values between 1 and 10 inclusive
    public static void fill_random(int [] arr){
        Random rng = new Random();
        rng.setSeed(10);

        for (int i = 0; i < arr.length; i++){ //starting i an int at 0 then looking at index less than length of the array, add on to i
            arr[i] = rng.nextInt(1, 11);
        }
    }
    public static void print_arrays(int [] arr){
        System.out.print('[');
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ",");
        System.out.println(arr[arr.length -1]);
        System.out.println(']');
// for loop generates indexes
    }
    public static void print_array_version2(int [] arr){
        System.out.print('[');

        // enhanced for loop in java
        for(int v : arr) // for each value v in the array arr
            //for an integar v for the values in the array
            // v takes on teh values of the array not the indexes in teh array
            System.out.print(v + ", "); //goes through every value of the array- will look ugly w , in the end
        System.out.println(']');
    }

    public static int sum(int [] arr){ // could use either for loop here
       int total = 0;
       for(int v : arr)
           total += v;
       return total;


    }
    public static int sum2(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }

    public static int sum3(int [] arr) {
        int sum = 0;
        int i = 0;

        while (i < arr.length)
        //sum = sum + arr[i];
            sum += arr[i++]; //very common idiom

        return sum;
    }

    public static void reverse(int [] arr){ // reverse the values in the array

        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;
        }
    }

    public static int max(final int []arr){ // return the value of the largest element in the array
        int curr_max = arr[0]; // or could put "int curr_max = Integer.MIN_VALUE;


        for(int i = 1; i < arr.length; i++){ //if do this then  change to; int i = 0
            if (arr[i] > curr_max){
                curr_max = arr[i];
            }
        }
        return curr_max;
    }
    //write a function that returns the average of an array of integers
    public static double avg(int [] arr){
        return (double) sum(arr) / arr.length;

    }
    public static double median(int [] arr){
        // first step see if number of numbers in array is even or odd
       // int l = arr.length; (could do this if dont want to keep typing arr.length)
        Arrays.sort(arr);// sorts the numbers in the array
        if((arr.length % 2 ==0))
            // if even then take avg of 2 middle numbers
            return arr[arr.length / 2] + arr[arr.length/2 - 1] / 2.0;
        // avg of numbers at index 4 and 5
        else
          return arr[arr.length / 2 +1];
        //if odd then need to take the middle number
    }
    public static int indexOf(final String [] arr, String item){ // return the index of the item in the arr, if not found: -1
        // fill in code here
    for(int i = 0; i < arr.length; i++)
       //if( arr[i].equals(item));
        if(arr[i] == item)
           return i;
    return -1;


    }

// for loop generates values
    public static void main(String [] args){
        String [] names = {"Harry", "Hermione", "Ron", "Draco"};
        System.out.println(indexOf(names, "Ron")== 2);
        System.out.println(indexOf(names, "Dumbledore")== -1);


        int [] nums = {4, 1, 0, 9, 2,8}; // short hand for the mess below:
        int [] nums2 = new int [] {1,2,3,4,5};


        reverse(nums);
        System.out.println(Arrays.equals(nums,new int []{8,2,9,0,1,4}));
        System.out.println(max(nums)==9);


        int [] grades = new int[10]; /// allocate the space for 10 grades


        System.out.println(nums[2]);
        // System.out.println(nums[-1]); // index out of range error
        // in python -1 would wrap around to end of the string

        fill_random(grades);
        //System.out.println(grades);
        System.out.println(Arrays.toString(grades));
        print_arrays(grades);
        print_array_version2(grades);


        int z = 33;
        f(z); // when z is passed to x a copy is made. // but doesnt change z
        System.out.println(z);
        System.out.println(sum(grades)== 48);
        System.out.println(sum2(grades)== 48);
        System.out.println(sum3(grades)== 48);
        System.out.println(avg(grades)== 4.8);
        System.out.println(median(grades)== 4.5);
    }
}
