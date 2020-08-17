package day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {

        int age = 39;
        String citizenship = "USA";
        String firstName = "Ramazan";
        String lastName = "Sevindik";
        String fullName = firstName + " " +lastName;

        boolean eligibility = age>= 18 && citizenship == "USA";

        System.out.println(fullName+ " is eligible to vote: " +eligibility);

        boolean r6 = !true && false;  // false
        boolean r7 = !false && 9 > 8; // true

        boolean r8 = true == ! false || false == true;  // true or false = true.!
        boolean r9 = !false == false || true == !false; // false or true = true
        boolean r10 = !false == false && true == !false;

        System.out.println(10);












    }
}
