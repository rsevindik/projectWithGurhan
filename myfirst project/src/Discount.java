public class Discount {
    public static void main(String[] args) {

        double regularPrice = 59.0;
        double discount, salePrice;

        discount = regularPrice * 20/100;
        salePrice = regularPrice - discount;

        System.out.println("Regular Price: $" +regularPrice);
        System.out.println("Discount Amount: $" +discount);
        System.out.println("Sale Price: $"+salePrice);

    }

}
