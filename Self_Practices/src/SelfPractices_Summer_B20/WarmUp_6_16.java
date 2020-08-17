package SelfPractices_Summer_B20;

public class WarmUp_6_16 {
    public static void main(String[] args) {

        int a = 7, b = 0, c = - 3;

        if (a > b && a > c) {
            System.out.println(a + " is the maximum number!");
        }
        if (a > c && b > c) {
            System.out.println(c + " is the minimum number!");
        }
        if (a > b && b > c) {
            System.out.println(b + " is the median number!");
        }

        System.out.println("==============================");

        int age = 19;
        String Id1 = "DriverLicense";
        String Id2 = "SchoolId";

        boolean eligibleAge = age >= 18;
        boolean Id = Id1 == "DriverLicense" || Id2 == "StateId";

        boolean eligibleToBuyAlcohol = eligibleAge && Id;

        System.out.println("Customer is eligible to buy alcohol: " + eligibleToBuyAlcohol);


    }
}
