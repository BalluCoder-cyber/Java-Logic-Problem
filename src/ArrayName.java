import java.util.ArrayList;
import java.util.List;


public class ArrayName {
    public static void main(String[]args){
        ArrayList<String> names = new ArrayList<>();

        names.add("balwant");
        names.add("rohit sharma");
        names.add("msd");
        names.add("jasprit");

        for(int i = 0; i <names.size(); i++){
          names.set(i,names.get(i).toUpperCase());
        }
        System.out.println(names);

        
    }

}
