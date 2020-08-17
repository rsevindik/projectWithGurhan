package Day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(95); // autoboxing index 0
        scores.add(100);//                  1 --->2
        scores.add(85); //                  2 --->3
        scores.add(1, 65);// 1       but you cannot skip order and add 5th element.!


        System.out.println(scores);

        System.out.println(scores.get(2)); // 100 as an element of Integer wrapper class array

        System.out.println(scores.size());

    }
}
