package day03_Sequences_Variable;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 100000;
        double tax = 0.28;

        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;

        System.out.println(totalTax);

        System.out.println(salaryAfterTax);
    }
}
