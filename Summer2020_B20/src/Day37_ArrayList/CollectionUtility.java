package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100, 20,0,-1,-3,400, 500, 5000));

        Integer max = Collections.max( list ); // max number
        Integer min = Collections.min( list ); // min number

        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);

        System.out.println("===============================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ramazan", "Islam", "Muhtar", "Saim", "Asiya", "Muhtar"));

        //replaceAll method.!
        Collections.replaceAll(names, "Muhtar", "Fatime");  // [Ramazan, Islam, Fatime, Saim, Asiya, Fatime]

        System.out.println(names);

    }
}
