import java.util.Scanner;

public class Find_Cube {

    //your code here
    public static void cube(int n){

        System.out.println(n*n*n);

    }



    //end cube

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        cube(n);


    }

}
