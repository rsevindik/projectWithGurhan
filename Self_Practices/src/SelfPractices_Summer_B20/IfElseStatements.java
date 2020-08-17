package SelfPractices_Summer_B20;

public class IfElseStatements {
    public static void main(String[] args) {

      /*  int age = 15;
        if (age < 16) {
            System.out.println("Too Young");
        } else {
            System.out.println("Welcome!");

       */

        int age2 = 25;
        if (age2 > 0) {
            if (age2 > 16) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too Young");
            }
        } else {
            System.out.println("Error");

            int age = 25;
            if (age <= 0) {
                System.out.println("Error");
            } else if (age <= 16) {
                System.out.println("Too Young");
            } else if (age < 100) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Really?");

                int age3 = 22;
                int money = 800;

                if (age3 > 18) {
                    if (money > 500) {
                        System.out.println("Welcome!");

                        int age4 = 22;
                        int money1 = 800;

                        if (age4 > 18 && money1 > 500) {
                            System.out.println("Welcome!");


                            //The OR operator (||) checks if any one of the conditions is true.
                            //The condition becomes true, if any one of the operands evaluates to true.
                            int age5 = 25;
                            int money3 = 100;

                            if (age5 > 18 || money3 > 500) {
                                System.out.println("Welcome!");

                                //The NOT (!) logical operator is used to reverse the logical state of its operand.
                                // If a condition is true, the NOT logical operator will make it false.
                                int age6 = 25;
                                if(!(age6 > 18)) {
                                    System.out.println("Too Young");
                                } else {
                                    System.out.println("Welcome");
                                }

                            }
                        }
                    }
                }
            }

        }
    }
}

