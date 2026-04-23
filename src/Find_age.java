import java.util.Scanner;

public class Find_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current year");
        int currYear = sc.nextInt();
        System.out.println("Enter your Birth year");
        int birthYear = sc.nextInt();
        int age = currYear-birthYear;
        System.out.println("Your age is = "+ age);

    }
}
