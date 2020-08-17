package day09_IfStatement;

public class Buy_Alcohol {

    public static void main(String[] args) {

        System.out.println("=========solution1=====================");

        int age = 22;
        boolean hasID = true;

        boolean eligible = hasID && age >= 21;

        if(eligible == true){  // (eligible) is enough
            System.out.println("Eligible to buy alcohol");
        }
        if(eligible != true){  // use (!eligible) instead
            System.out.println("Go buy your milk, it's on me");
        }

        System.out.println("=========solution2=====================");

        String result = "";  // temporary assigning a value in the memory to be recalled. during coding! *********

        if(eligible == true){ // (eligible) is enough
            result = "Eligible to buy alcohol";
        }if(eligible == false){//just put "else" instead of "if(eligible == false)"or (!eligible) which is easier
            result = "You are not old enough to buy alcohol";
        }
        System.out.println(result);

        System.out.println("=========solution3:Ternary=====================");

        String result2 = eligible? "Eligible to buy alcohol" : "You are not old enough to buy alcohol";

        System.out.println(result2);


    }
}
