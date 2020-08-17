package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(1,1,2,2,3,3,3,4,5,6,7,8));

        list.removeIf( p -> Collections.frequency(list, p) !=1);   // p represent each element in list, -> is the lambda expression
        System.out.println(list);

        System.out.println("===========================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList( "Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        names.removeIf( p -> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));

        System.out.println(names);
        System.out.println("===========================");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll( Arrays.asList( 100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>();
        gradeOfA.addAll(grades);
        gradeOfA.removeIf( p -> p < 90 || p >100);
        System.out.println("there are "+gradeOfA.size()+" grades of 'A' and those grades are: "+gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>();
        gradeOfB.addAll(grades);
        gradeOfB.removeIf( p -> p < 80 || p > 89);
        System.out.println("there are "+gradeOfB.size()+" grades of 'B' and those grades are: "+gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>();
        gradeOfC.addAll(grades);
        gradeOfC.removeIf( p -> p < 70 || p >79);
        System.out.println("there are "+gradeOfC.size()+" grades of 'C' and those grades are: "+gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>();
        gradeOfD.addAll(grades);
        gradeOfD.removeIf( p -> p < 60 || p > 69);
        System.out.println("there are "+gradeOfD.size()+" grades of 'D' and those grades are: "+gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 90-100
        gradeOfF.addAll(grades);
        gradeOfF.removeIf( p ->  p < 0 || p>59);
        System.out.println("there are "+gradeOfF.size()+" grades of 'F' and those grades are: "+gradeOfF);

    }
}
