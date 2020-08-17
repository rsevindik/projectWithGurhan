public class TestConditionalOperator {

    public static void main(String[] args) {

        double score = 55;

        if (score < 60)
            System.out.println("Your grade is: Fail.");
        else
            System.out.println("Your grade is: Pass.");

        System.out.println("Your grade is: " +       //shorthand operation instead if-else
                (score <60 ? "Fail." : "Pass." ));

    }
}
