import java.util.Scanner;

public class countJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next().toLowerCase();


        int countJava = 0;

        while(word.contains("java")){

            word = word.replaceFirst("java", "");

        /*
        for (int i = 0; i <= word.length()-4 ; i++) {
            String eatJava = word.substring(i,i+4);
            if(eatJava.equalsIgnoreCase("java")){

         */
                countJava++;
        }

        System.out.println(countJava);

    }
}
