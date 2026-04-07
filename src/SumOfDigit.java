import java.util.Arrays;

public class SumOfDigit {
    //RECURSIVE APPROACH...
//    public static int sOfDigit(int n){
//        if(n==0) {
//            return 0;
//        }
//       return (n%10)+(sOfDigit(n/10));
//    }

    // METHOD APPROACH...
    public static void sOfDigit(int n){
        int sum =0;
        while (n!=0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(sum);
    }
    public static void main (String[] args){
        // FIRST APPROACH....
//        int num = 565214;
//        String str = String.valueOf(num);
//        int [] digit = new int[str.length()];
//        int sum=0;
//        for(int i=0; i<str.length(); i++){
//            digit[i] = Character.getNumericValue(str.charAt(i));
//             sum += digit[i];
//        }
//        System.out.println(sum);


       sOfDigit(5885);
    }
}
