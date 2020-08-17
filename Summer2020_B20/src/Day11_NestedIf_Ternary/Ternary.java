package Day11_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {

        int num = 100;
        String result = " ";

        if(num%2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }
        System.out.println(result);

        System.out.println("============Ternary=============");

        String result2 = (num%2 == 0) ? "Even" : "Odd";

        System.out.println(result2);

        System.out.println("===================ex-2===============");

        int num1 = 1000;
        int num2 = 20;
        int max1 = 0;

        if(num1 > num2){
            max1 = num1;
        }else{
            max1 = num2;
        }
        System.out.println(max1);

        int max2 = (num1 > num2) ? num1 : num2;

        System.out.println(max2);

        System.out.println("===================ex-3 & task1===============");

        int age = 22;
        String citizen = "USA";
        boolean eligible = true;

        if(age > 21){
            eligible = true;
        }else{
            eligible = false;
        }

        System.out.println(eligible);

        String eligible2 = (age > 21) ? "true" : "false";

        /**
        boolean eligible3 = (age > 21) ? true : false;
         */

        System.out.println(eligible2);

        System.out.println("===================task-2===============");

        String vote = (age > 21 && citizen == "USA") ? "Eligible to vote" : "NOT eligible to vote";

        System.out.println(vote);

    }
}
