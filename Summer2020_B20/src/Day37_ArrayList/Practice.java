package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(1,1,1,2,2,2,3,3,4,4,5,6,6,6,6,7,7));
        
        // remove all numbers less than 5 in the list

        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i) < 5){
                list.remove(i);  // will not return accurate result but only removes one in the list since the
                                // arrayList's size is dynamic and index numbers will shift
            }
        }
        System.out.println(list);
    }
}
