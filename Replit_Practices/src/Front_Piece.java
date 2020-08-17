import java.util.Arrays;
import java.util.Scanner;

public class Front_Piece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        for (int i = 0; i < size; i++) {
            if (size < 2) {
                System.out.println(Arrays.toString(num));
            } else {
                System.out.println("["+num[0]+", "+num[1]+"]");
                break;
            }
        }
        /*
          int[] temp = {0};
        if(size>1){
            temp =new int[2];
        }else {
            temp =new int[size];
        }
​
        for(int i = 0 ; i <= size-1 ; i++){
            if(i<2){
                temp[i] = num[i];
            }
        }
        System.out.println(Arrays.toString(temp));

         */
    }
}
