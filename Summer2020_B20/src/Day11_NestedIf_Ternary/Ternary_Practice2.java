package Day11_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        int num = 100;
        String result3 = " ";

        if(num > 0){
            result3 = "Positive";
        }else if (num < 0){
            result3 = "Negative";
        }
        else{
            result3 = "Zero";
        }
        System.out.println(result3);

        System.out.println("========================");

        String result4 = num > 0 ? "Positive" : num < 0 ? " Negative" : "Zero";

        System.out.println(result4);

        System.out.println("========================");

        int a = 10, b= 10;

        String result = a > b ? "a is greater" : b > a ? " b is greater" : "they are equal";

        System.out.println(result);


    }
}
