import java.util.*;
public class EvenOdd {
    public static void main (String[] args){
        //first method...
        Scanner sc = new Scanner(System.in);
        System.out.println("give me the number....");
        int n = sc.nextInt();
        if(n%2==0){
           System.out.println("this is even number");
       }
       else {
            System.out.println("this is odd number");
        }


    }
}
