import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.next();

        //your code here
        float price = 0;

        if(in.equalsIgnoreCase("burger") || in.equalsIgnoreCase("chicken")){
            System.out.println("price 10.0");
        }
        if(in.equalsIgnoreCase("soda")){
            System.out.println("2.0");
        }

        s.close();
    }
}
