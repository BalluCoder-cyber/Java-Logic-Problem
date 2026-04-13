public class ReverseNumber {
    public static int revNum(int n){
        int reverse = 0;
        while (n>0){
            reverse = reverse*10 +n%10;
            n=n/10;
        }
        return reverse;
    }
    public static void main(String[]args){
        int num = 22154578;
        System.out.println(revNum(num));

    }
}
