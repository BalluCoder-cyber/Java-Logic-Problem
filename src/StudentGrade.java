import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the math number out of 100 :");
        double math = sc.nextDouble();
        System.out.print("enter the science number out of 100 :");
        double science = sc.nextDouble();
        System.out.print("enter the english number out of 100 :");
        double english  = sc.nextDouble();
        System.out.print("enter the hindi number out of 100 :");
        double hindi = sc.nextDouble();
        System.out.print("enter the com number out of 100 :");
        double com = sc.nextDouble();

        double average = (math+science+english+hindi+com)/5;

        if(average > 85){
            System.out.println("grade A");
        } else if (average < 85 && average > 75) {
            System.out.println("grade B");
        } else if (average < 75 && average> 65) {
            System.out.println("grade C");
        }else if (average < 65 && average> 33) {
            System.out.println("grade D");
        }else{
            System.out.println("you are fail");
        }

    }
}
