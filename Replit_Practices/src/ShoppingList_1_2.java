import java.util.Scanner;

public class ShoppingList_1_2 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");

        String item1 = scan.next();
        //  int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter Item2 and its price:");

        String item2 = scan.next();
        //  int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter Item3 and its price:");

        String item3 = scan.next();
        //  int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        double totalPrice = price1+price2+price3;
/*
        if(count1>0 && count2 >0 && count3>0){
            totalPrice = (price1*count1) + (price2*count2) + (price3*count3);
            System.out.println("Item1: "+item1+" Price: "+(price1*count1)+", Item 2: "+item2+
                    " Price: "+(price2*count2)+", Item3: "+item3+" Price: "+(price3*count3));
        }else if(count1>0 && count2>0){
            totalPrice = (price1*count1) + (price2*count2);
            System.out.println("Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+
                    " Price: "+(price2*count2));
        }else if(count1>0 && count3 >0){
            totalPrice = (price1*count1) + (price3*count3);
            System.out.println("Item1: "+item1+" Price: "+(price1*count1)+", Item3: "+item3+" Price: "+(price3*count3));
        }else if(count2>0 && count3 >0){
            totalPrice = (price2*count2) + (price3*count3);
            System.out.println("Item 2: "+item2+" Price: "+(price2*count2)+", Item3: "+item3+" Price: "+(price3*count3));
        }else{
            totalPrice = 0;
        }
   */
    System.out.println("===================easiest-way=================");
   /**

        totalPrice = price1*count1+count2*price2+price3*count3;
        if(count1>0){
        report += "Item1: "+item1+" Price: "+(price1*count1)+",";
        if(count2>0){
        report += "Item2: "+item2+" Price: "+price2*count2;
        }else{
        report += "Item3: "+item3+" Price: "+price3*count3;
        }

  */

        System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3);
        System.out.println("Total price: "+totalPrice);

        scan.close();
    }
}

