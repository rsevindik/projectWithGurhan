import java.util.Scanner;

public class LaptopConfiguration {
    public static void main(String[] args) {
        double laptopPrice = 0;
        double screenSize = 5;
        String cpuType = "i7";
        String storageType = "SSD";
        String screenResolution = "4K";
        int memorySize = 1000;
        int ramSize = 4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        screenSize = scan.nextDouble();
        if(screenSize == 13.3){
            laptopPrice+=200;
        }if(screenSize == 15.0){
            laptopPrice+=300;
        }if(screenSize == 17.3){
            laptopPrice+=400;
        }
        System.out.println("Select CPU type:");
        cpuType = scan.next();
        if( cpuType.equalsIgnoreCase("i3")){
            laptopPrice+= 150;
        }if( cpuType.equalsIgnoreCase("i5")){
            laptopPrice+= 250;
        }if( cpuType.equalsIgnoreCase("i7")){
            laptopPrice+= 350;
        }
        System.out.println("Select RAM size:");
        ramSize = scan.nextInt();

        laptopPrice+= (ramSize/4)* 50;

        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();
        if(storageType.equalsIgnoreCase("HDD")){
            laptopPrice+=(memorySize/500)* 50;
        }if(storageType.equalsIgnoreCase("SSD")){
            laptopPrice+=(memorySize/500)*100;
        }
        System.out.println("Enter screen resolution:");
        screenResolution = scan.next();
        if(screenResolution.equalsIgnoreCase("FULLHD")){
            laptopPrice+=100;
        }if(screenResolution.equalsIgnoreCase("4K")){
            laptopPrice+=200;
        }
        System.out.println("Laptop price is: "+"$"+laptopPrice);


    }
}
