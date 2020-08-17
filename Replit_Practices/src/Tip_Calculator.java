import java.util.Scanner;

public class Tip_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split:");
        String isGroup = input.nextLine();

        System.out.println("Number of people:");
        int numOfPeople = input.nextInt();
        String people = " ";

        System.out.println("Check amount:");
        double checkAmount = input.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality = input.next();

        double totalTip = 0;
        if (serviceQuality.equalsIgnoreCase("Excellent")){
            totalTip += checkAmount* .25;
        }else if(serviceQuality.equalsIgnoreCase("Great")){
            totalTip += checkAmount* .20;
        }else if(serviceQuality.equalsIgnoreCase("Good")){
            totalTip += checkAmount* .15;
        }else if(serviceQuality.equalsIgnoreCase("Fair")){
            totalTip += checkAmount* .10;
        }else if(serviceQuality.equalsIgnoreCase("Poor")){
            totalTip += checkAmount* .5;
        }
        for(int p = 1; p <= numOfPeople; p++){
            people += "&";
        }

        double totalToPay = checkAmount+totalTip;

        System.out.println("Number of people entered:"+people);
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+(totalToPay)/numOfPeople);
        System.out.println("Tip per person: "+totalTip/numOfPeople);

    }
}
