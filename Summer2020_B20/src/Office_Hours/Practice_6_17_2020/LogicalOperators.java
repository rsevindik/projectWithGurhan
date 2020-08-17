package Office_Hours.Practice_6_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean r1 = !true != true;
        //          false != true ==> True
        System.out.println(r1);

        boolean r2 = !r1;
        //          !true = false
        System.out.println(r2);

        System.out.println(!!!!!false); // even # of "!" will keep it the same otherwise; changed

        boolean result1 = 9>10 || "Java" == "Java" || 'A' == 'a';
        //               false  or      true       or   false  = true
        System.out.println(result1);  // true

        boolean result2 = "Java" != "Python" && "McGrover" == "Good Guy";
         //                     true         and           false
        System.out.println(result2); // false






    }
}
