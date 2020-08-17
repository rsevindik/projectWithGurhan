import java.util.Scanner;

public class IfStatement_Black_Jack_Keep_Hand {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();
        /*
     h+P>21 ==> busts
     h>p   ==>loses
     h==p  ==>tie
     h<p   ==>Wins
     */
        if((house+player)>21){
            System.out.println("bust");
        }else if(house>player){
            System.out.println("player lose");
        }else if(house<player){
            System.out.println("player wins");
        }else if(house==player){
            System.out.println("ties");
        }
    }
}
