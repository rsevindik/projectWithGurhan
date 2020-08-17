import javax.swing.JOptionPane;

public class MultipleNestedDecisionStructure_TestScores {
    public static void main(String[] args) {


        int testScore; // for numeric test score
        String input;  // to hold the user's input

        input = JOptionPane.showInputDialog("Enter your test score and get your final grade: "); // get User's input
        testScore = Integer.parseInt(input);

        if (testScore < 60)
        {
            JOptionPane.showMessageDialog(null, "Your final grade is: F.");
        } else {
            if (testScore < 70)
            {
                JOptionPane.showMessageDialog(null, " Your final grade is: D.");
            } else {
                if (testScore < 80)
                {
                    JOptionPane.showMessageDialog(null, " Your final grade is: C.");
                } else {
                    if (testScore < 90) {
                        JOptionPane.showMessageDialog(null, " Your final grade is: B.");
                    } else {
                        JOptionPane.showMessageDialog(null, " Your final grade is: A.");
                    }
                }
            }
        }
        System.exit(0);
    }
}
