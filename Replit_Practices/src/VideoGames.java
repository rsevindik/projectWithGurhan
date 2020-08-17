import java.util.Scanner;

public class VideoGames {
    public static void main(String[] args) {
        //Write your code here

        Scanner input = new Scanner(System.in);

        int numberOfCandies, numberOfGumballs;
        System.out.println("Enter number of coupons:");
        int numberOfCoupons = input.nextInt();

        if(numberOfCoupons >= 10){
            System.out.println("Number of Candies: "+ (numberOfCoupons/10));
            System.out.println("Number of Gumballs: "+ (numberOfCoupons%10)/3);
        }
        else if(numberOfCoupons < 10 && numberOfCoupons >=3){
            System.out.println("Number of Candies: 0");
            System.out.println("Number of Gumballs: "+ (numberOfCoupons/3));
        }else{
            System.out.println("Not enough coupons");
        }

    }
}
