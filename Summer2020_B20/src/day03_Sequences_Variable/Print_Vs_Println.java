package day03_Sequences_Variable;

public class Print_Vs_Println {

    public static void main(String[] args) {

        System.out.print("A"); /*take out "ln" at the end which will make end result to be
                                 executed next to each other not in different lines */
        System.out.print("B");

        System.out.print("C");

        System.out.println("===============");

        System.out.print("A\nB\n C\n");  // no comma or space necessary but space will
                                         // leave space in the front.!


    }
}
