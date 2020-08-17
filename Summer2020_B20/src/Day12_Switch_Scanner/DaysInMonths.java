package Day12_Switch_Scanner;

import Day11_NestedIf_Ternary.DaysInMonth;

public class DaysInMonths {
    public static void main(String[] args) {

        int month = 10;
        String result = " ";
        switch (month){

            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;

            case 2:
                result = "28 days";

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;

            default:
                result = "Invalid";
        }
        System.out.println(result);   // make sure put it after the switch's }

    }
}
