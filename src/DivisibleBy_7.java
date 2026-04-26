public class DivisibleBy_7 {
    public static void main(String[] args) {
        int number = 7;
        for(int i = 1; i<=1000; i++){
            if(i%number==0){
                System.out.println(i);
            }
        }
    }
}
