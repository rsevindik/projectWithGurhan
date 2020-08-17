import java.util.ArrayList;
import java.util.Scanner;

public class Group_Practice {
    /*
    Write a program that will print the shortest word in the given array str.
    String [] strArray = {java, cable, red, vivid, remedy, grace};
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        int shortestLength = str[0].length();

        for(String each : str){
            if(each.length()< shortestLength){
                shortestLength = each.length();
                System.out.println(each);
            }

        }

        System.out.println("===============================");

        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = scan.nextLine();

        }

        //write your code below
        String longestWord = words [0];
        for( String each : words){
            if(longestWord.length()< each.length()){
                longestWord= each;

            }
        }
        System.out.println(longestWord);

    }

}
