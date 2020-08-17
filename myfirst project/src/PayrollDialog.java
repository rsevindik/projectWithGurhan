import javax.swing.JOptionPane;
/**
 This program demonstrates using dialogs with JOptionPane.
 */
public class PayrollDialog {
        public static void main(String[] args) {

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

    }
}
