import java.util.*;

public class BinaryConvertion {
    public static void dectobinary(int n){
        int[] binaryNum = new int[10000];
        int i = 0;
        while(n > 0){
            binaryNum[i] = n % 2;
            n = n/2;
            i++;
        }
        for(int j = i-1; j>=0; j--){
            System.out.print(binaryNum[j]);
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER...");
        int n = sc.nextInt();
        System.out.println("dec = "+ n);
        System.out.print("binary = ");
        dectobinary(n);

    }
}
