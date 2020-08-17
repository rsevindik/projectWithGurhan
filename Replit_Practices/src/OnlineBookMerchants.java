import java.util.Scanner;

public class OnlineBookMerchants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total numbers of books you will purchase");
        int nBooksPurchased = scan.nextInt();

        int freeBooks = 0;
        System.out.println("you are a premium customers: True or False");
        boolean isPremiumCustomer = scan.nextBoolean();

        if (isPremiumCustomer) {
            if (nBooksPurchased >= 8) {
                freeBooks = (nBooksPurchased / 8) * 2;
                System.out.println("you will get " + freeBooks + " of your new books for free Today.!");
                System.out.println("you will only pay for " + (nBooksPurchased - freeBooks));
            } else if (nBooksPurchased >= 5) {
                freeBooks = nBooksPurchased / 5;
                System.out.println("you will get " + freeBooks + " of your new books for free Today.!");
                System.out.println("you will only pay for " + (nBooksPurchased - freeBooks));
            } else if (nBooksPurchased < 5) {
                freeBooks = 0;
                System.out.println(freeBooks);
            }
        }

        if (!isPremiumCustomer) {
            if (nBooksPurchased >= 12) {
                freeBooks = (nBooksPurchased / 12) * 2;
                System.out.println("you will get " + freeBooks + " of your new books for free Today.!");
                System.out.println("you will only pay for " + (nBooksPurchased - freeBooks));
            } else if (nBooksPurchased >= 7) {
                freeBooks = nBooksPurchased / 7;
                System.out.println("you will get " + freeBooks + " of your new books for free Today.!");
                System.out.println("you will only pay for " + (nBooksPurchased - freeBooks));
            } else if (nBooksPurchased < 7) {
                        freeBooks = 0;
                        System.out.println(freeBooks);
                    }

                    scan.close();
                }
            }

        }