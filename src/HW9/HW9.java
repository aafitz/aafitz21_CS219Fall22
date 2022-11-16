package HW9;

import java.math.BigInteger;

public class HW9 {
    public static BigInteger Bigpow(int x, int y) {
        BigInteger base = BigInteger.ONE;
        for (int i = 0; i < y; i++) {
            base = base.multiply(BigInteger.valueOf(x));
        }
        return base;
    }
public static BigInteger fastbigpow(int x, int y){
        BigInteger base = BigInteger.ONE;
        if(y == 0){
            return base;
        } else if (y % 2 == 0) {
            return(fastbigpow(x, y/2).multiply(fastbigpow(x, y/2)));
        }
        else{
            return(fastbigpow(x, y-1).multiply(BigInteger.valueOf(x)));
        }



}


    public static void main(String[] args) {
        System.out.println(Bigpow(2,3));
        System.out.println(fastbigpow(2,4));
        System.out.println(fastbigpow(2,3));

    }
}