import java.util.Scanner;

public class vehicleRecalls {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int modelYear = input.nextInt();
        boolean recall1 = modelYear>=1995 && modelYear<=1998;
        boolean recall2 = modelYear>=2001 && modelYear<=2002;
        boolean recall3 = modelYear>=2004 && modelYear<=2006;
        boolean recall4 = modelYear>=2015 && modelYear<=2017;
        boolean recall = recall1 || recall2 || recall3 || recall4;

        if(recall){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}
