package day07_Unary_ShortHand;

public class ShortHand {

    public static void main(String[] args) {

        int a = 100;
        a *= a;
        System.out.println(a);

        int b = 2;
        b *= 3;
        System.out.println(b);

        int c =300;
        c -= 100;
        System.out.println(c);

        System.out.println("==============================");

        int z = 300;
        z += 200;
        System.out.println(z);

        String schoolName = "Cybertek";
        schoolName += " School";      // schoolName = schoolName + "School"
        System.out.println(schoolName);

        String fullName = "Donald";
        fullName += "Trump";

        System.out.println(fullName);

        int budget = 100000;

        budget /=2;       // shorthand operator /=2 means dividing by 2
        System.out.println(budget);

        int q = 100;

        System.out.println(q/2);
        System.out.println(q);

        int x = 100;
        x /= 2;
        System.out.println(x);

        x *= 2;

        int num = 100;
        num %= 3 ;
        System.out.println(num);

        double num2 = 400.5;
        num2 %=2;
        System.out.println(num2);












    }
}
