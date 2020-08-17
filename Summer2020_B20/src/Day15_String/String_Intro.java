package Day15_String;
import java.lang.String; // import statement
import java.util.Scanner;
public class String_Intro {

    public static void main(String[] args) {
        String str = "Cybertek";
        Scanner input = new Scanner(System.in);

        String name1 = "Ramazan";
        String name2 = "Sevindik"; // out of pool.!
        String name3 = new String ("is from");  // in the string pool (original, name of the parameter)
        String name4 = new String("Turkey");

                String s1 = "Cat";
                String s2 = "Cat";

                String d1 = "Dog";
                String d2 = "dog";
;
        System.out.println(name1+ " " +name2+ " " + name3 + " "+name4);
        System.out.println(s1 == s2);  // those are the same objects
        System.out.println(d1 == d2);
        System.out.println(d1 = d2);

        String t1 = new String ("Tiger");
        String t2 = new String ("Tiger");
        System.out.println(t1 == t2);  //  they are different object cretaed in different locations i the java heap.!

        String c1 = "Cybertek";  // in the string pool
        String c2 = new String("Cybertek"); // in the heap
        String c3 = new String("Cybertek"); // in the heap.!
        String c4 = "Cybertek";
        String c5 = "cybertek";

        System.out.println(c1 == c2); // false
        System.out.println(c2==c3);   // false
        System.out.println(c1 == c4); // true
        System.out.println(c4 == c5); // false




    }
}
