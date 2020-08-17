package day09_IfStatement;

public class Alcohol {

    public static void main(String[] args) {

        int age = 26;

        if(age >= 21){
            System.out.println("You are old enough to buy");
        }else{
            System.out.println("You are not able to buy");
        }

        String IsEligible = (age >=21)? "You are old enough to buy" : "You are not able to buy";
        System.out.println(IsEligible);
    }
}
