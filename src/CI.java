import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount =");
        double p = sc.nextInt();
        System.out.print("Enter rate of interest =");
        double r = sc.nextInt();
        System.out.print("Enter time period in year=");
        double t = sc.nextInt();

        double a = p * Math.pow(1 + r / 100, t);
        System.out.println("amount after full time period=" + a);
        double ci = a - p;
        System.out.print("the compound interest=" + ci);

    }
}