import java.util.Scanner;

public class Has_A_Java {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()-1>=4){
            String ch1 = word.substring(0, 4);
            String ch2 = word.substring(1, 5);
            if(ch1.equalsIgnoreCase("java") || ch2.equalsIgnoreCase("java")){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }else if(word.length()-1<4){
            System.out.println("false");
        }
    }
}
