import java.util.Scanner;

public class repeated_Separator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String output = word;
        while(count>=2){
            output += separator+word;

            count--;
        }

        System.out.println(output);


    }
}
