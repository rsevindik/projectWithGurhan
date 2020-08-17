package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList( 100,90,85,75,55,45,73,73,35,47,60, 87, 77, 67, 57, 47, 93, 83, 73, 63, 53, 43) );

        ArrayList<Integer> gradeA = new ArrayList<>();
        gradeA.addAll( list);
        gradeA.removeIf( each -> each <90);
        System.out.println("there are "+gradeA.size()+" grades of 'A' and those grades are: "+gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(list);    // add all the grades from list into the gradeB
        gradeB.removeIf( p -> (p<80 || p >89));               // instead of (gradeA.addAll(list);)
        System.out.println("there are "+gradeB.size()+" grades of 'B' and those grades are: "+gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>(list);
        gradeC.removeIf( p -> (p<70 || p >79));
        System.out.println("there are "+gradeC.size()+" grades of 'C' and those grades are: "+gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>(list);
        gradeD.removeIf( p -> !(p>=60 && p <70));            // you can also use && logic with different approach (!)
        System.out.println("there are "+gradeD.size()+" grades of 'D' and those grades are: "+gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>(list);
        gradeF.removeIf(p-> p>59); // or you can remove all the other grades (A,B,C,D) then the left over is "grade F"
        /*
        gradeF.removeAll( gradeA );
        gradeF.removeAll( gradeB );
        gradeF.removeAll( gradeC );
        gradeF.removeAll( gradeD );
        */
        System.out.println("there are "+gradeF.size()+" grades of 'F' and those grades are: "+gradeF);

    }
}
