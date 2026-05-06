import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("enter your num");
//        int num = s.nextInt();
//        for(int i =2;i<num;i++){
//            if(num%i == 0){
//                System.out.println("prime");
//
//            }else{
//                System.out.println("not prime");
//            }
//        }


                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your choice: ");
                String input = sc.nextLine();

                // Remove leading and trailing spaces
                input = input.trim().toLowerCase();

                switch (input) {
                    case "apple":
                        System.out.println("You chose apple!");
                        break;
                    case "banana":
                        System.out.println("You chose banana!");
                        break;
                    case "orange":
                        System.out.println("You chose orange!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }





