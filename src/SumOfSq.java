import java.util.Scanner;

public class SumOfSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first value ");
        int num1 = sc.nextInt();

        System.out.println("Enter your second value ");
        int num2 = sc.nextInt();
        double sq1 = Math.pow(num1,2);
        double sq2 = Math.pow(num2,2);
        System.out.println(sq1+sq2);


    }
}
