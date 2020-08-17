import java.util.Scanner;

public class QuizQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        char a = s.next().charAt(0);

        //your code here

       if(a == ('b')){
           System.out.println(a+" is correct");
       }
       else if(a == 'a' || a == 'c'){
           System.out.println(a+" is wrong");
       }else{
           System.out.println(a+" is not a valid answer");
       }
    }
}
