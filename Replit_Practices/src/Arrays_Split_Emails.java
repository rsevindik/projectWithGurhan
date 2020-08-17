import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Split_Emails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();


        String [] ch = email.split("");
        //System.out.println(Arrays.toString(ch));


        int count = 0;
        for(String each : ch){
            if(each.equals("@")){
                count++;
            }

        }
        if(count == 0 || count >1){
            System.out.println("Invalid email");
        }else{
            String [] Id_Domain = email.split("@");
            //  System.out.println(Arrays.toString(Id_Domain));

            System.out.println("Email id: "+Id_Domain[0]);
            System.out.println("Email domain: "+Id_Domain[1]);


        }

    }
}
