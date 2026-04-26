import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int revers = 0;
        System.out.println("enter your number");
        int n = s.nextInt();
        int temp = n;
        while (n != 0) {
            int result = n % 10;
            n = n / 10;
            revers = revers * 10 + result;
        }

        if (temp == revers) {
            System.out.println("this number is palindrom");
        } else {
            System.out.println("this number is not palindrom");
        }

    }
}
