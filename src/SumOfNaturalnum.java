public class SumOfNaturalnum {
    public static void main(String args[]){
       //First method...
        int n = 23;
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);

        //Second FORMULA method...
        int a = 23;
        int add = a*(a+1)/2;
        System.out.println(add);
    }
}
