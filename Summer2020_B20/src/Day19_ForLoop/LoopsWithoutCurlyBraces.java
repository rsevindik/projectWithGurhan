package Day19_ForLoop;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        for (int i = 5; i < 10; i++) {
            System.out.println("Hello");
        }

        System.out.println("=====================");

        for (int i = 1; i <= 5 ; i++)
            System.out.println("Hello");   // repeat 5 times
        System.out.println("How are you"); // print only one due to missing "{".!
    }
}
