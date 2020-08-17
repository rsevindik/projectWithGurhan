import java.util.Scanner;

public class count_Hi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;
        for(int i = 0; i <= str.length()-2; i++){

            String lookingForHi = str.substring(i, i+2);

            if(lookingForHi.equalsIgnoreCase("hi")){
                count++;
            }
        }

        System.out.println(count);




    }
}
