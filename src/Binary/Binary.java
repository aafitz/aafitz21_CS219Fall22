/*package Binary;

public class Binary {
    public static void printBinary(int n) {

       // while(n > 0) {
         //   System.out.print(n % 2); // prints the least significant bit
          //  n = n / 2;

        if(n == 0)
            System.out.print(0);
        else{
            printBinary(n/2);
            System.out.print(n % 2);
        }
        //System.out.println();

    }

    public static String toBinary(int n){
        String r = "";

        while(n > 0){
            r = (n % 2) + r;
            n = n/2;

        }
        public static int parseInt(String bits){
            for(int i = bits.length();i >= ; i--){
                if (bits.charAt(i) == '1'){
                    r = r += curr_pow_2;
                    curr_pow_2 *= 2;
                }

            }

        }


        return r;
    }
    public static void main(String [] args){
        printBinary(43); //101011
        System.out.println();
        System.out.println(toBinary(43));
        System.out.println(parseInt("101011") == 43);
        System.out.println(Integer.toBinaryString(43));
        System.out.println(0b1111);

    }
}
*/