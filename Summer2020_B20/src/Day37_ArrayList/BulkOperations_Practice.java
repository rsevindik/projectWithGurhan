package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

      //  ArrayList<String> students = new ArrayList<>(Arrays.asList());

        System.out.println("=========================");
        ArrayList<String> group1 = new ArrayList<>();
        // add students' names

        group1.addAll ( Arrays.asList( "Ahmet", "Aigerim", "Beyza", "Ramazan", "Bledar", "Edward", "Galila",
                "Guljannat", "Kamol","Mike", "Nurshat", "Olesea", "Omer", "Roman", "Said", "Uladzislau", "Violetta"));

        // verify your mentor and one of your close friend's name is in this list or not

        System.out.println(group1.containsAll( Arrays.asList("Guljannat", "Kamol", "Mike")));

        System.out.println("=========================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(1,1,1,1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));

        System.out.println(nums);

        // remove all 1,2,5,10,11

        nums.removeAll( Arrays.asList(1,2,5,10,11));
        System.out.println(nums);

        System.out.println("=========================");

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll( Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,7,7,8,8,9,9, 10,11,12,13));
        //ony keep elements of 1,2,3,9

        num1.retainAll(Arrays.asList(1,2,3,9));
        // num1.removeAll(Arrays.asList(1,2,3,9));

        System.out.println(num1);

        System.out.println("==================");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll( Arrays.asList( "Ahmed", "Muhtar", "Ahmed", "Virginia","Beslan", "Ibrahim","Ahmed" ));

        System.out.println(employees);

        employees.removeAll(Arrays.asList("Ahmed")); // removes matching ones

        // employees.retainAll(Arrays.asList("Ahmed"));  // removes non matching ones
        System.out.println(employees);




    }
}
