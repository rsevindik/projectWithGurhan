package day08_LogicalOperators;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 101;

        boolean even = number % 2 == 0;
        boolean odd = number % 2 != 0;

        if(even){
            System.out.println(number+ " is an even number");
        }
        if(odd){
            System.out.println(number+ " is an odd number");
        }
    }
}
