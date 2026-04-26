import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your num");
        int num = s.nextInt();
        for(int i =2;i<num;i++){
            if(num%i == 0){
                System.out.println("prime");

            }else{
                System.out.println("not prime");
            }
        }

    }


}