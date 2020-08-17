import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = input.nextInt();
        int nonSeniorCitizens = input.nextInt();

        System.out.println("What is new citizen's age?");
        int age = input.nextInt();

        if(age>=65){
            System.out.println("Senior Citizen");
            seniorCitizens++;
        }
        if(age<65){
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens++;
        }
        System.out.println("New seniorCitizens count "+ seniorCitizens);
        System.out.println("New nonSeniorCitizens count "+ nonSeniorCitizens);
    }
}
