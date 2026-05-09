import java.math.BigInteger;

public class GCD {
    // First Methods...
   /* static int gcd(int a, int b){
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b , b);
        }
        return gcd(a,b-a);
    } */

    public static void main(String[] args) {
//        int g = gcd(24,18);
//        System.out.println(g);

        // Second method...
        int a = 24;
        int b = 18;
        int gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
        System.out.println(gcd);

    }
}
