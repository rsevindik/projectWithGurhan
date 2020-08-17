package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,9));

       // Predicate<Integer> lessThan5 = p -> p  < 5;

       // list.removeIf(lessThan5);

        list.removeIf(p ->p<5);   // autonomic way of creating predicate by using lambda exp.
        System.out.println(list);

        System.out.println("======================");

        Predicate<Integer> oddNumbers = p -> p%2 != 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i =0; i<=100; i++){

            numbers.add(i);
        }

        numbers.removeIf(oddNumbers); // removes all odd numbers
        numbers.removeIf( p -> p%2 ==0); // removes if the number is even num

        System.out.println(numbers); // after removing both odds and evens then list will be [] empty.!

        System.out.println("==========================================");

        ArrayList<String>names = new ArrayList<>();

        names.addAll(Arrays.asList("Marry", "Maria","Musa", "Ramazan", "Muhammed", "Mirgule"));

        // names.removeIf(each -> each.startsWith("M"));  / removes all names starts with "M"
        names.removeIf(each -> each.startsWith("M") && each.endsWith("y")); // only  removes name (Mary) which starts
                                                                            // with "M" and ends with "y"

        System.out.println(names);

        System.out.println("===========================");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));

        nums.removeIf( p -> Collections.frequency(nums, p) != 1 );// elements that are not unique

        System.out.println(nums);

        System.out.println("===========================");

        ArrayList<Character> chars = new ArrayList<>();

        chars.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));

       // chars.removeIf( p ->  p >= 48 && p <= 57 || p >= 65 && p <= 90 || p >= 97 && p <= 122);// elements that are not unique

        chars.removeIf(   p-> (Character.isLetter(p) && Character.isDigit(p) ));

        System.out.println(chars);


    }
}
