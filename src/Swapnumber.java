import java.util.*;
public class Swapnumber {
    //SECOND METHOD SWAPPING USING THIRD VARIABLE...
   /* public static void Swappingusingtemp(int m , int n){
        int temp= m;
        m=n;
        n= temp;
        System.out.println("After Swapping m = "+m + " n = "+n);
    }*/


    // THIRD METHOD USING XOR....
    public static void swappingUsingXOR(int m, int n){
        //logic
        System.out.println("before swapping m = "+ m + " n = "+n);
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("After Swapping m = "+m + " n = "+n);

    }
    public static void main (String[] args){

        // FIRST METHOD OF SWAPPING TWO NUMBER.....
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number a and b");
        System.out.println("enter first number a");
        int a = sc.nextInt();
        System.out.println("enter second number b");
        int b = sc.nextInt();
        // swapping...
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping a = " + a +", b = "+b );  */

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M and N ...");
        int m = sc.nextInt();
        int n = sc.nextInt();
        Swappingusingtemp(m,n);  */



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M and N ...");
        int m = sc.nextInt();
        int n = sc.nextInt();
        swappingUsingXOR(m,n);

    }
}
