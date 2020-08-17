package Day11_NestedIf_Ternary;

public class NestedIf_Practice2 {
    public static void main(String[] args) {

        int day = 8;
        boolean validNumber = day >= 1 && day <=7;
        String result = " ";

        if(validNumber){
            if(day == 1){
                result = "Mon";
            }
            else if(day == 2){
                result = "Tue";
            }
            else if(day == 3){
                result = "Wed";
            }
            else if(day == 4){
                result = "Thu";
            }
            else if(day == 5){
                result = "Fri";
            }
            else if(day == 6){
                result = "Sat";
            }else{
                result = "Sun";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);

        System.out.println("==============Ternary============");

        String result2 = (day == 1)? "Mon" : (day == 2)? "Tue" : (day == 3)? "Wed" : (day == 4)? "Thu": (day == 5)?
                "Fri": (day ==6)? "Sat": (day ==7)? "Sun": "Not Valid";

        System.out.println(result2);
    }
}
