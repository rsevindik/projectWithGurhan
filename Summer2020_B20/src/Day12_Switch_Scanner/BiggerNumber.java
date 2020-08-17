package Day12_Switch_Scanner;

public class BiggerNumber {
    public static void main(String[] args) {

        double n1 = 100, n2 = 200, n3 = 300;

        boolean n1IsBigger = n1>n2 && n1 > n3;
        boolean n2IsBigger = !n1IsBigger & n2>n3;
      //  boolean n3IsBigger = !(n1IsBigger && n2IsBigger); (not necessary.!)

        String result = " ";

        if(n1IsBigger){
            result = "n1 is bigger";
        }else if(n2IsBigger){
            result = "n2 is bigger";
        }else {           // meaning that if n3 is bigger.!
            result = "n3 is bigger";
        }

        System.out.println(result);

        System.out.println("============w/Ternary=============");

        String result2 = (n1IsBigger)?"n1 is bigger" : (n2IsBigger)? "n2 is bigger" : "n3 is bigger";

        System.out.println(result2);



    }
}
