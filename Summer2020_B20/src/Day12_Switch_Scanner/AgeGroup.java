package Day12_Switch_Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 19;

        String ageGroup = " ";

        if(age > 0 && age <=150){

         /*   if(age < 21){
                ageGroup = "Teenager";
            }else if(age <= 55){      //
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }

          */

         ageGroup = (age<21)? "Teenager" : (age<=55)? "Adult" : "Senior";

        }else{
            ageGroup = "Invalid";
        }

        System.out.println(ageGroup);

    }
}
