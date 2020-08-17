package Day11_NestedIf_Ternary;

import org.w3c.dom.ls.LSOutput;

public class DaysInMonths2 {
    public static void main(String[] args) {

        int month = 12;
        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month ==2;
        boolean days30 = month ==4 || month == 6 || month == 9 || month == 11;
     // boolean days31 = month ==1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10|| month == 12;

        String result = " ";

        if(validNumber){
            if(days28){
                result = "28 days";
            }
            else if (days30) {
                result = "30 days";
            }else{
                    result = "31 days";
                }
        }else{
            result = "Invalid";
        }

        System.out.println(result);

       // String result2 = days28 ? "28 days": days30? "30 days":days31? "31 days": "Invalid";

        String result2 = days28 ? "28 days": days30? "30 days":!(days28 && days30)? "31 days": "Invalid";

        System.out.println(result2);
    }

}
