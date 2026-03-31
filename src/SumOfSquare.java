import java.util.*;
public class SumOfSquare {
    public static int sumSquare(int n){
        int sum= 0;
        for(int i = 1; i <=n; i++){
            sum +=i*i;
        }
        return (sum);

    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("give me a number");
        int n = sc.nextInt();
        System.out.println(sumSquare(n));
    }
}
