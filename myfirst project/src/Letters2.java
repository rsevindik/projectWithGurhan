import java.net.StandardSocketOptions;

public class Letters2 {
    public static void main(String[] args) {

        char letter;

        letter = 65;  // unicode = ascii
        System.out.println(letter);
        letter = 97; // 65 = 32 will execute the lower case because 32 is the differences between upper and lower characters
        System.out.println(letter);

        String name;
        int age;
        double annualPay;
        name = "Ramazan Sevindik";
        age = 39;
        annualPay = 100000;

        System.out.println("My name is " +name+ "," + " my age is " +age+ " and " +
                "\nI hope to earn " +annualPay+ " per year.");

        String firstName, middleName, lastName;
        firstName = "Ramazan";
        middleName = "Adam";
        lastName = "Sevindik";

        String firstInitial, middleInitial, lastInitial;
        firstInitial = "R.";
        middleInitial = "A.";
        lastInitial = "S.";

        System.out.println(firstName + "," + middleName+ "," + lastName + ".");

        System.out.println(firstInitial + "," + middleInitial+ "," + lastInitial + ".");


    }
}
