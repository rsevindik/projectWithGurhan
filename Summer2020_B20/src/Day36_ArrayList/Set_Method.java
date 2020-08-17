package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Set_Method {
    public static void main(String[] args) {

        //ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList((1, 2, 3, 4, 5));
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10); //0
        list1.add(10); //1
        list1.add(10); //2
        list1.add(10); //3
        list1.add(10); //4

        list1.set(list1.size()-1,0);
        System.out.println(list1);

        System.out.println("================================");
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <=20 ; i++) {
            list2.add(i);
        }
        System.out.println(list2);

        for (int i = 0; i <=list2.size()-1 ; i++) {
            Integer each = list2.get(i);

            if(each % 2 != 0){
                list2.set(i, each*2);
            }else{
                list2.set(i,each*3);
            }
        }
        System.out.println(list2);
    }
}
