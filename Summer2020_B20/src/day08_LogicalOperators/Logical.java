package day08_LogicalOperators;

public class Logical {

    public static void main(String[] args) {

        // !: opposite boolean (true/false)

        boolean r1 = 9 > 7; // true
        boolean r2 = !r1;   // false

        System.out.println(r1);
        System.out.println(r1 + " : " +r2);

        System.out.println(!false);
        System.out.println(!true);

        boolean r3 = !false == true; // true == true (yes it's true)

        System.out.println(r3);

        boolean r4 = true == !true; // true == false (no it's false)

        boolean r5 = 9 > 5 && 9 >10; // false


    }
}
