package ShortReviewVideos;

public class Ternary {  // must be boolean statement; true or false

    public static void main(String[] args) {
        int n1= 15, n2 = 10;
        String greater = " ";  // or instead of String creat another variable called max and assign it to n1 if n1>n2.!
/**
        if(n1>n2){
            greater = n1+" is greater";
        }else{
            greater = n2+" is greater";
        }
 */
        /*
        int bill = 1400;
        int discount = (bill > 2000)? 15:10;
        System.out.println(discount);

         bill = 2400;
        int quantity = 12;
        if (bill > 1000) {
            if (quantity > 11) {
                discount = 10;
            }else{
                discount = 9;
            }
        }else{
            discount = 5;
        }
        discount = (bill > 1000)? (quantity > 11)? 10:9:5;
        System.out.println(discount);

         */

        greater = (n1>n2)? n1+" is greater" : n2+" is greater";
        System.out.println(greater);
    }
}
