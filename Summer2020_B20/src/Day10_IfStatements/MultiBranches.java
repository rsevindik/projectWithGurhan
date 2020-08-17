package Day10_IfStatements;

public class MultiBranches {
    public static void main(String[] args) {

        int number = 100;

        if(number > 0){
            System.out.println(number+ " is positive");
        }
        if(number < 0){
            System.out.println(number+ " is negative");
        }
        if(number == 0){
            System.out.println(number+ " is zero");
        }

        System.out.println("===========way#2==========");

        if(number > 0){
            System.out.println(number+ " is positive");
        }else if(number < 0){
            System.out.println(number+ " is negative");
        }else{
            System.out.println(number+ " is zero");
        }
        System.out.println("===========w/ternary==========");

        String result = number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero";

        System.out.println(result);
    }
}
