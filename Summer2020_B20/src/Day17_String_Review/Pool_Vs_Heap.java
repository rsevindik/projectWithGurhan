package Day17_String_Review;

public class Pool_Vs_Heap {
    public static void main(String[] args) {

            String s1 = "Cybertek";  // String pool
            String s2 = "Cybertek";  // String pool and there is only one and the same object for s1 & s2

            String s3 = new String("Cybertek"); // heap
            String s4 = new String("Cybertek"); // heap meaning that in heap memory there are 2 different objects due to their dif. locations

            String s5 = "cybertek"; // this is a new string literal object  in pool due to its different first char

            System.out.println( s1 == s2); // true

            System.out.println(s1 == s3); // false

            System.out.println( s3 == s4); // false

            System.out.println(s5 == s2) ;  // false

            System.out.println(s5 == s1); // false
            System.out.println("the answer" +s1.equals(s3));

    }
}
