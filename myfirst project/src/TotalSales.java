import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales;

        Scanner sc = new Scanner(System.in);

        System.out.println("for how many days do you have sales figures?");
        days = sc.nextInt();

        totalSales = 0;   // accumulator.!!!

        for (int count = 1; count <= days ; count++) {

            System.out.println("Enter the sales for day "+count);
            sales = sc.nextDouble();
            totalSales += sales;
        }

        //System.out.println("Total sales are $ " +totalSales);
        System.out.printf("Total sales are $%,.2f",totalSales);

    }
}
