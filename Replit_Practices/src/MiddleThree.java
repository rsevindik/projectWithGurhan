import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        String result = " ";

            if(word.length()%2 !=0 && word.length()>=4){
                result = word.substring(word.length()/2-1,(word.length()/2+2));
            }else{
                result = "Invalid";
            }
            System.out.println(result);
        }

    }
