public class LudoDice {
    public static int diceLudo(int n){
        int oppo = 7-n;
        return oppo;
    }
    public static void main(String[]args){

        System.out.println( diceLudo(3));
    }
}
