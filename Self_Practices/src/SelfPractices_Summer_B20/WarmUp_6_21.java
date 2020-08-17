package SelfPractices_Summer_B20;

public class WarmUp_6_21 {
    public static void main(String[] args) {

        int n1 = 3, n2 = 9, n3 = 18;
        String result = (n1 > n2 && n1 > n3) ? "n1 is greater" : (n2 > n1 && n2 > n3) ? "n2 is greater" : (n3 > n1 && n3 > n2) ? "n3 is greater" : " ";
        System.out.println(result);

        System.out.println("==========WarmUp-2================");

        int age = 0;
        String ageGroup = " ";

        if (age >= 0 && age <= 150) {
            if (age > 21) {
                ageGroup = "Teenager";
            } else if (age >= 21 && age <= 55) {
                ageGroup = "Adult";
            } else if (age > 55){
                ageGroup = "Senior";
            }else{
                ageGroup = "Others: Not described!";
            }
        }else{
            ageGroup = "Could not find a group suitable for your age.!";
        }

        System.out.println(ageGroup);

    }
}