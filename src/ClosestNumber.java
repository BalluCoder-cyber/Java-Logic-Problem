public class ClosestNumber {
    public static int closeNumber(int a,int b){
        int q = a/b;
        int n1 = b*q;
        int n2 = (a*b) > 0 ? (b*(q+1)) : (b*(q-1)) ;
        if(Math.abs(b-n1) < (Math.abs(b-n2))){
            return n1;
        }
        return n2;

    }

    public static void main(String []args){
        System.out.println(closeNumber(29,7));

    }
}
