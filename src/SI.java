import java.util.*;
public class SI {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle amount...");
        float P = sc.nextInt();
        System.out.println("enter the rate of given amount...");
        float R = sc.nextInt();
        System.out.println("enter the time of given amount...");
        float T = sc.nextInt();
        float SimpleInterest = (P*R*T)/100;
        System.out.println("the simple interest = " +SimpleInterest);
    }
}
