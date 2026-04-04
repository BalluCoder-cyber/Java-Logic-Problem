public class SumOfNaturalnum {
    // third method...
    public static int naturalSum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String args[]){
       //First method...
        int n = 3;
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);

        //Second FORMULA method...
        int a = 4;
        int add = a*(a+1)/2;
        System.out.println(add);
        System.out.println(naturalSum(3));
    }
}
