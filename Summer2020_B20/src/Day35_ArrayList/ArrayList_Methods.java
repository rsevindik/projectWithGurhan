package Day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Aalia");


        earlyBirdList.set(2, "Aslan");
        earlyBirdList.set(0, "lan");

        System.out.println(earlyBirdList);

        earlyBirdList.clear();

        System.out.println(earlyBirdList);
        System.out.println(earlyBirdList.size());

        System.out.println("===========================================");

        // remove(int index)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  //0
        list.add(2);  //1
        list.add(3);  //2
        list.add(4);  //3
        list.add(5); // 4

        list.remove(2);  //[1, 2, 4, 5]
        //list.remove(4);
        list.remove(3); // [1, 2, 4]

        System.out.println(list);

        System.out.println("===============================================");

        // remove(Element)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  //0
        list2.add(2);  //1
        list2.add(3);  //2
        list2.add(4);  //3
        list2.add(5); // 4

        // int a = 1; // [1, 3, 4, 5]

        Integer a = 1; //[2, 3, 4, 5]

        list2.remove(a);

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");  //0
        list3.add("Liliia"); //1
        list3.add("Bulnet"); //2
        list3.add("Viorel"); //3
        list3.add("Musa");  //4

        //  list3.remove(2);
        list3.remove("bulnet");

        System.out.println(list3);
        /*
        1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
    3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
         */
        System.out.println("=============================");
        ArrayList<Integer> numbers = new ArrayList<>(5);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.set(4, 0);
        System.out.println(numbers);

        System.out.println("===========task-2=============");

        ArrayList<Integer> numbers2 = new ArrayList<>(5);

        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);

        for (int i = 0; i < 5; i++) {
            if (numbers2.get(i) % 2 != 0) {
                numbers2.set(i, (i + 1) * 2);
            }
        }
        System.out.println(numbers2);

        System.out.println("===========task-3=============");

        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5));

        //Integer numbers3[] = {1, 1, 2, 3, 3, 4, 5};
        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer each : numbers3) {
            int count = 0;
            for (Integer number : numbers3) {
                if (number.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(each);
            }
        }
        System.out.println(uniques);
    }
}