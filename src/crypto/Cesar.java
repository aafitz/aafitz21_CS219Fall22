package crypto;

public class Cesar {

    public static String E(String clear, int key) { // string named clear- not encrypted yet and key = what the shift is
        String cipher = ""; //declares cipher an empty string
       final int alpha_length =26; //should never change- declares the length/ num of letters in alphabet

        for (int i =0; i < clear.length(); i++){

            char clear_char = clear.charAt(i); //creates a character named clear_char and look at its indicies
            int clear_char_pos_alpha = clear_char - 'a'; //finds position of character in alphabet
            int cipher_char_pos = Math.floorMod(clear_char_pos_alpha + key, alpha_length) ; //imports the floormod and takes the postion in the alphabet plus the key floor divised by 26( # letts in alphabet)
            // declares variables as char, int, int and names them!
            char cipher_char = (char) (cipher_char_pos + 'a');
            cipher += cipher_char;

        }


        return cipher;
    }
    public static String D(String cipher, int key){
        String clear = "";
        final int alpha_length = 26;

        for(int i =0; i < cipher.length(); i++){
            char cipher_char = cipher.charAt(i);
            int cipher_char_pos_alpha = cipher_char - 'a';
            int clear_char_pos = Math.floorMod(cipher_char_pos_alpha - key, alpha_length);
            char clear_char = (char) (clear_char_pos + 'a');
            clear += clear_char;
        }
        return clear;
    }
    public static String d(String cipher, int key){
        return E(cipher, key);
    }


    public static void main(String [] args) {
        System.out.println(E("cold", 20).equals("wifx")); // this is how you compare strings!!
       // System.out.println(E("cold", 20)== "wifx"); // this is NOT!!! how you compare strings
        System.out.println(d(E("cold", 20), 20).equals("cold"));
    }

}
