import java.util.Scanner;

public class PatientInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName=" ", lastName=" ", fullName, email, street, state, city, address, contacts;
        int age, zipCode;
        double height, weight;
        boolean isMarried = true;
        long workPhoneNumber, personalPhoneNumber;

        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
        lastName = scan.next();
        scan.nextLine();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city

        System.out.println("Enter your city");
        city = scan.next();

        System.out.println("Enter your state");
        state = scan.next();

        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your height");
        height = scan.nextDouble();

        System.out.println("Enter your weight");
        weight = scan.nextDouble();

        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();


        System.out.println("Patient personal information" + "\nFull name: "+lastName+", "+firstName+"\nAddress: "
                +street+", "+city+", "+state+" "+zipCode+"\nContacts: work phone number - "+workPhoneNumber+
                ", personal phone number - "+personalPhoneNumber+", email: "+email+"\nAge: "+age+"\nHeight: "
                +height+"\nWeight: "+weight+" pounds"+"\nMarried?: "+isMarried);

        scan.close();

    }
}
