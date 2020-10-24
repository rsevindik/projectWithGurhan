import javax.swing.*;

/**
 This program demonstrates using dialogs with JOptionPane.
 */
public class CircuitBoardProfit_JOptionPane {
    public static void main(String[] args) {

        String input;
        double retailPrice, profitPercentage=.4, profit;


        input = JOptionPane.showInputDialog("Please enter the retail price for your item");

        retailPrice = Double.parseDouble(input); // Convert the input to a double.

        profit = retailPrice * profitPercentage; // Calculate the gross pay.

        JOptionPane.showMessageDialog(null, "The profit earned for this product is $"
                                        + profit);   // Display the results.

        System.exit(0); // End the program.

    }
}
