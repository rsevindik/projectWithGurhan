package Day21_Loops;

public class DoWhile_Practice {
    public static void main(String[] args) {
        int num = 1;

        do{

            System.out.print(num+ " ");
            num++;
        }while(num <= 20);

        System.out.println("====================");

        System.out.println();

        System.out.println(num); // just to see the current value of it.!

        System.out.println("=====================");

        char ch = 'Z';
        do{
            System.out.println(ch+ " ");
            ch--;
        }while(ch >= 'A');
    }
}
