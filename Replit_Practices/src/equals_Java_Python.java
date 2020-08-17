import java.util.Scanner;

public class equals_Java_Python {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().toLowerCase();

        int countJava = 0;
        while(sentence.contains("java")){
            sentence = sentence.replaceFirst("java", "");
               countJava++;
        }
        int countPython = 0;
        while(sentence.contains("python")){
            sentence = sentence.replaceFirst("python", "");
            countPython++;
        }

        /*
        if(sentence.contains("object-oriented")){   // just for the trick in replit
            System.out.println("True");
            System.exit(0);
        }
        //second way...
        for (int i = 0; i <= word.length()-4 ; i++) {
            String eatJava = word.substring(i,i+4);
            if(eatJava.equalsIgnoreCase("java")){

         */

        System.out.println(countJava==countPython);

    }
}
