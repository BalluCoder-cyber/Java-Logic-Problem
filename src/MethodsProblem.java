import java.util.Scanner;

public class MethodsProblem {

    public static int sumOfNumberPattern(int number){
        int sum = 0;
        for(int i = 1; i<= number; i++){
            for (int j=1; j<=i;j++){
                sum += i;
            }
        }
        return sum;
    }

    public static void chessColor() {
        Scanner s = new Scanner(System.in);
        System.out.println("you can pass chess COLUMN & ROW  in between 1 to 8 ;");
        System.out.print("Pass column :");
        int n = s.nextInt();
        System.out.print("Pass row :");
        int m = s.nextInt();
        if(n==m){
            System.out.println("BLACK");
        }
        System.out.println("WHITE");
    }

    public static double maximumResult(double a, double b, double c) {
        double result1 = a + b * c;
        double result2 = (a + b) * c;
        double result3 = a * b + c;
        double result4 = a * (b + c);
        if (result1 > result2 && result1 > result3 && result1 > result4) {
            return result1;
        } else if (result2 > result1 && result2 > result3 && result2 > result4) {
            return result2;
        } else if (result3 > result2 && result3 > result1 && result3 > result4) {
            return result3;

        } else
            return result4;
    }

    public static void armStrongNumber() {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        System.out.println("enter your number");
        int n = s.nextInt();
        String str = Integer.toString(n);
        int power = str.length();
        int temp = n;
        while (n != 0) {
            int result = n % 10;
            n = n / 10;
            sum = sum + Math.pow(result, power);
        }

        if (temp == sum) {
            System.out.println("this number is armstrong");
        } else {
            System.out.println("this number is not not armstrong");
        }
    }

    public static int sumOfTwoNumber(int num1, int num2) {
        return num1 + num2;
    }

    public static boolean isPrime(int num) {
        return num % 2 == 0;

    }

    public static boolean isDivisibleBy_7(int num) {
        return num % 7 == 0;
    }

    public static int numReverse(int num) {
        int result = 0;
        while (num != 0) {
            int value = num % 10;
            num = num / 10;
            result = result * 10 + value;
        }
        return result;
    }

    public static void switchUse() {
        Scanner s = new Scanner(System.in);
        System.out.println("input add, sub, multi, quit");
        System.out.print("Enter you input:");
        String input = s.nextLine();
        while (!input.equals("quit")) {
            switch (input) {
                case "add":
                    System.out.println("adding...");
                    break;
                case "multi":
                    System.out.println("mul...");
                    break;
                case "sub":
                    System.out.println("sub...");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
            System.out.println("input add, sub, multi, quit");
            input = s.nextLine();
        }

    }

    public static void gradeSystem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the math number out of 100 :");
        double math = sc.nextDouble();
        System.out.print("enter the science number out of 100 :");
        double science = sc.nextDouble();
        System.out.print("enter the english number out of 100 :");
        double english = sc.nextDouble();
        System.out.print("enter the hindi number out of 100 :");
        double hindi = sc.nextDouble();
        System.out.print("enter the com number out of 100 :");
        double com = sc.nextDouble();

        double average = (math + science + english + hindi + com) / 5;

        if (average > 85) {
            System.out.println("grade A");
        } else if (average < 85 && average > 75) {
            System.out.println("grade B");
        } else if (average < 75 && average > 65) {
            System.out.println("grade C");
        } else if (average < 65 && average > 33) {
            System.out.println("grade D");
        } else {
            System.out.println("you are fail");
        }
    }

    public static void evenOddNum(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void multiplicationTable(int tableOf) {

        System.out.println("enter the number");
        int n = tableOf;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }

    public static void swappingUsingTemp(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("After Swapping m = " + m + " n = " + n);
    }

    public static int sumOfNaturalNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void binaryConvertor(int n) {
        int[] binaryNum = new int[10000];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
    }

    public static void simpleInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle amount...");
        float P = sc.nextInt();
        System.out.println("enter the rate of given amount...");
        float R = sc.nextInt();
        System.out.println("enter the time of given amount...");
        float T = sc.nextInt();
        float SimpleInterest = (P * R * T) / 100;
        System.out.println("the simple interest = " + SimpleInterest);
    }

    public static int sumOf_N_Squares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return (sum);
    }

    public static int oppositeOfDice(int diceNumber) {
        int oppo = 7 - diceNumber;
        return oppo;
    }

    public static int sumOfAllNumber_Digit(int number) {
        int sum = 0;
        while (number != 0) {
            int r = number % 10;
            sum = sum + r;
            number = number / 10;
        }
        return sum;
    }

    public static void compoundInterest() {
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

    public static void patter1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void patter2() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patter3() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void patter4() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patter5() {
        for (int i = 1; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static int areaOfRectangle(int length,int width){
        return length*width;
    }

    public static double areOfTriangle(int base, int height){
        return (0.5)*base*height;
    }

    public static double areaOfKite (double diagonal1,double diagonal2){
        return (0.5)*diagonal1*diagonal2;
    }

    public static void hollowSquarePattern6(int n , int m){
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int factorialOfNumber(int number){
        if (number==1) return 1;
        return number*(factorialOfNumber(number-1));
    }

    public static void main(String[] args) {


        System.out.println(sumOfTwoNumber(55, 22));     // Method No.1

        System.out.println(isPrime(7));                 // Method No.2

        System.out.println(isDivisibleBy_7(77));        // Method No.3

        System.out.println(numReverse(264));            // Method No.4

        switchUse();                                    // Method No.5

       gradeSystem();                                   // Method No.6

        evenOddNum(78);                                 // Method No.7

        multiplicationTable(4);                         // Method No.8

        swappingUsingTemp(54,67);                       // Method No.9

        System.out.println(sumOfNaturalNum(15));        // Method No.10

        binaryConvertor(12);                            // Method No.11

        simpleInterest();                               // Method No.12

        System.out.println(sumOf_N_Squares(3));         // Method No.13

        System.out.println( oppositeOfDice(5));         // Method No.14

        System.out.println("the sum of number of each digit = "+sumOfAllNumber_Digit(8558)); // Method No.15

        compoundInterest();                         // Method No.16

        patter1();                                  // Method No.17

        patter2();                                  // Method No.18

        patter3();                                  // Method No.19

        patter4();                                  // Method No.20

        patter5();                                  // Method No.21

        armStrongNumber();                          // Method No.22

        System.out.println("Maximum result = "+ maximumResult(2,5,3)); // Method No.23

        chessColor();                                // Method No.24

        System.out.println( sumOfNumberPattern(3));  // Method No.25

        System.out.println(areaOfRectangle(4,5));    // Method No.26

        System.out.println(areOfTriangle(4,5));      // Method No.27

        System.out.println(areaOfKite(2.5,5.5));     // Method No.28

        hollowSquarePattern6(7,5);                   // Method No.29

        System.out.println(factorialOfNumber(4));      // Method No.30

    }
}
