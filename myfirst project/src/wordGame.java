import javax.swing.*;

public class wordGame {
    public static void main(String[] args) {

        String input, name, city, college, profession, animalType, petName;
        int age;

        name = JOptionPane.showInputDialog("What is your Name?");
        input = JOptionPane.showInputDialog("What is your age?");
        age = Integer.parseInt(input);
        animalType = JOptionPane.showInputDialog("Type of pet?");
        city = JOptionPane.showInputDialog("Name of the City?");
        college = JOptionPane.showInputDialog("Name of the College?");
        profession = JOptionPane.showInputDialog("What is your Profession?");
        petName = JOptionPane.showInputDialog("What is your pet's name?");


        JOptionPane.showMessageDialog(null, "There once was a person named " + name+ " " +
                "who lived in " + city+ ". At the age of " +age+ "," +name+ " went to college at " +college+"."
                +name+ " graduated and went to work as a " +profession+ ". Then, " +name+ " adopted a(n) " +animalType+ " named " +petName+
                ". They both lived happily ever after! ");

        System.exit (0);
    }
}
/*
 String input;        // For reading input
            String name;        // The user's name
            int hours;          // The number of hours worked
            double payRate;     // The user's hourly pay rate
            double grossPay;    // The user's gross pay

            name = JOptionPane.showInputDialog("What is your name? "); // Get the user's name.

            input = JOptionPane.showInputDialog("How many hours did you work this week? "); // Get the hours worked.

            hours = Integer.parseInt(input); // Convert the input to an int.

            input = JOptionPane.showInputDialog("What is your hourly pay rate? "); // Get the hourly pay rate.

            payRate = Double.parseDouble(input); // Convert the input to a double.

            grossPay = hours * payRate; // Calculate the gross pay.

            JOptionPane.showMessageDialog(null, "Hello " + name +
                        ". Your gross pay is $" + grossPay);   // Display the results.

            System.exit(0); // End the program.
 */