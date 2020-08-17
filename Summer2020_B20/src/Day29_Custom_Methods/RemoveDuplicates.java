package Day29_Custom_Methods;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "vsdbswlbwbnwtjbvwrorwbasbvdfjbsdjfbv ";
        removeDuplicates(str);
    }
    public static void removeDuplicates(String str){
        String nonDuplicates = "";

        for(String each : str.split("")){
            if(!nonDuplicates.contains(each)){
                nonDuplicates += each;
            }
        }
        System.out.println(nonDuplicates);



    }
}
