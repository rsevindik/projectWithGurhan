import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class Car_Insurance {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
         name= scan.nextLine();

         System.out.println("Do you have a US driver license?");
        String driverLicense = scan.next();

        if(driverLicense.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            System.out.println("Enter your zip code");
        }
        int zipCode = scan.nextInt();

        if(zipCode == 20910 || zipCode == 20740){
            premium +=60;

        }else if(zipCode == 22102 || zipCode == 22103){
            premium +=30;
        }else{
            premium +=50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();

        if(vehicleOwnership.equalsIgnoreCase("owned")){
            premium +=10;
        }else{
            premium +=20;
        }

    }
}
