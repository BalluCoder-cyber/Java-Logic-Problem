import java.util.Arrays;

public class Nth_fibonacciNum {
    static int[] fibo(int n){
        int[] arr = new int[n];
        int a = 0;
        int b = 1;
        int c;
        for(int i = 2; i < n ; i++){
            c = a+b;
            a = b;
            b = c;
            arr[i]=c;

        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibo(10)));

    }
}
