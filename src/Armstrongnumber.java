import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        System.out.println("enter your number");
        int n = s.nextInt();
        String str = String.valueOf(n);
        int power = str.length();
        int temp = n;
        while (n != 0) {
            int result = n % 10;
            n = n / 10;
            sum = sum+Math.pow(result,power);
        }

        if (temp == sum) {
            System.out.println("this number is armstrong");
        } else {
            System.out.println("this number is not not armstrong");
        }
    }
}
