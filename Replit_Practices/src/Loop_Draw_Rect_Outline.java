import java.util.Scanner;

public class Loop_Draw_Rect_Outline {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();




        for (int k = 1; k <=n ; k++) {
            System.out.println("x");
            for (int m = 1; m <=3 ; m++) {
                System.out.print("x");
            }
            System.out.println();
        }




    }
}
