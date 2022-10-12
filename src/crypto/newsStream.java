package crypto;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;


public class newsStream {


    public static String E(String clear, int key, boolean encrypt) { // string named clear- not encrypted yet and key = what the shift is
        String cipher = ""; //declares cipher an empty string
        final int alpha_length = ('~' - ' ') + 1; //should never change- declares the length/ num of letters in alphabet
        final char base_char = ' '; // the starting character of the alphabet


        SecureRandom rng = null;

        try {
            rng = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        rng.setSeed(key); //called seeding the random # generator

        for (int i =0; i < clear.length(); i++){

            char clear_char = clear.charAt(i); //creates a character named clear_char and look at its indicies
            int clear_char_pos_alpha = clear_char - base_char;//finds position of character in alphabet
            int shift = rng.nextInt(100); //creates a variable for the random # shift - bound = 100
            if (!encrypt)
                shift = -shift;

            System.out.println(shift);
            int cipher_char_pos = Math.floorMod(clear_char_pos_alpha + shift, alpha_length) ; //imports the floormod and takes the postion in the alphabet plus the key floor divised by 26( # letts in alphabet)
            // declares variables as char, int, int and names them!
            char cipher_char = (char) (cipher_char_pos + base_char);
            cipher += cipher_char;

        }


        return cipher;
    }




    public static void main(String [] args) {
        System.out.println(E("java",10, true));
        System.out.println(E("j\\?v", 10, false));

    }

}

