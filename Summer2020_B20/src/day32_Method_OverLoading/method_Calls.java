package day32_Method_OverLoading;
import Library.Util;

import java.util.Arrays;

public class method_Calls {

    public static void main(String[] args) {

        String firstName = "elKEm";
        String lastName = "emEt";

        String fullName = Util.formatFullName(firstName, lastName);

        System.out.println(fullName);

        String uniqueChars = Util.uniques(fullName);

        System.out.println(uniqueChars);

        String reversedName = Util.reverse(fullName);

        System.out.println(reversedName);

        System.out.println("============================");

        int [] a = {200, 400, 500, 200, 1000, 50, 40, 30, 400, 56, 700};
        int n = 2000;

        a = Util.addElement(a,n);

        System.out.println(Arrays.toString(a));

    }
}
