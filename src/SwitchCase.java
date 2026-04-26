import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input add, sub, multi, quit");
        String input = sc.nextLine();
        while (!input.equals("quit")) {
            switch (input) {
                case "add":
                    System.out.println("adding...");
                    break;
                case "multi":
                    System.out.println("sub...");
                    break;
                case "sub":
                    System.out.println("mul...");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
            System.out.println("input add, sub, multi, quit");
            input = sc.nextLine();
        }

    }
}
