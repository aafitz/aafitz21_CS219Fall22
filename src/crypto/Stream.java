package crypto;
import java.util.Random;

public class Stream {


    public static String E(String clear, int key) { // string named clear- not encrypted yet and key = what the shift is
        String cipher = ""; //declares cipher an empty string
       final int alpha_length =26; //should never change- declares the length/ num of letters in alphabet


        Random rng = new Random();
        rng.setSeed(key); //called seeding the random # generator

        for (int i =0; i < clear.length(); i++){

            char clear_char = clear.charAt(i); //creates a character named clear_char and look at its indicies
            int clear_char_pos_alpha = clear_char - 'a';//finds position of character in alphabet
            int shift = rng.nextInt(100); //creates a variable for the random # shift - bound = 100
            System.out.println(shift);
            int cipher_char_pos = Math.floorMod(clear_char_pos_alpha + shift, alpha_length) ; //imports the floormod and takes the postion in the alphabet plus the key floor divised by 26( # letts in alphabet)
            // declares variables as char, int, int and names them!
            char cipher_char = (char) (cipher_char_pos + 'a');
            cipher += cipher_char;

        }


        return cipher;
    }
    public static String D(String cipher, int key){
        String clear = "";
        final int alpha_length = 26;

        Random rng = new Random();
        rng.setSeed(key);

        for(int i =0; i < cipher.length(); i++){
            char cipher_char = cipher.charAt(i);
            int cipher_char_pos_alpha = cipher_char - 'a';
            int shift = rng.nextInt(100);
            int clear_char_pos = Math.floorMod(cipher_char_pos_alpha - shift, alpha_length);
            char clear_char = (char) (clear_char_pos + 'a');
            clear += clear_char;
        }
        return clear;
    }



    public static void main(String [] args) {
        System.out.println(E("java", 10));
        System.out.println(D("wckm", 10));
    }

}
