package ShortReviewVideos;

import java.util.Arrays;

public class For_Each_Loop {
    public static void main(String[] args) {

        int [] intArray = {1,2,3,4,5,11,6,123};
        for(int item : intArray){

            if(item %2 ==0)
            System.out.println("Even Number : "+ item);
        }
        System.out.println("==============================");
        String[] strs = {"aaa", "bb", "dddd" };   // strs is the collection name.!
        for(String letters: strs){
            if(letters.contains("b")){
                System.out.println("found b getting out");
                break;
            }
            System.out.println(letters + " ");
        }
        System.out.println("==============================");
        for(int i=0; i< strs.length; i++){
            String letters = strs[i];
            System.out.println(letters);
        }
        for (int i = 0; i < strs.length; i++) {
            strs[i] = "item"+i;
            System.out.println("new value "+i+" "+strs[i]);
        }
        System.out.println("==============================");
            for(String item : strs){
                item = "aaa";
                System.out.println(item);
        }
        System.out.println(Arrays.toString(strs));
        System.out.println("==============================");

        for (int i = 0; i <= 10; i++) {

            if(i%2 != 0){
                continue;
            }
            System.out.println("even Numbers "+i);

            if(i == 6){
                break;
            }
        }
    }
}
