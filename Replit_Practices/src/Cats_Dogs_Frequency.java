import java.util.Scanner;

public class Cats_Dogs_Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next().toLowerCase();

       while(word.contains("cat")){
           word=word.replaceFirst("cat","");   // new str assignment.!
           countOfCats++;

        }
        System.out.println("Numbers of cats: "+countOfCats);


        while(word.contains("dog")){
            word=word.replaceFirst("dog","");   // new str assignment.!
            countOfDogs++;

        }
        System.out.println("numbers of dog: "+countOfDogs);

        System.out.println("Are the numbers of cats and dogs the same in the str?" +(countOfCats==countOfDogs));
        }
    }
