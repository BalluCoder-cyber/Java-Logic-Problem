import java.util.ArrayList;

public class Array {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(62);
        arr.add(49);
        arr.add(23);
        arr.add(18);
        arr.add(182);
        arr.add(122);
        arr.add(32);

        System.out.println(arr);

        ArrayList<Integer> result = new ArrayList<>();
        for(Integer integer : arr) {
            if (integer % 7 == 0) {
                result.add(integer);
            }

        }
        System.out.println(result);

    }
}
