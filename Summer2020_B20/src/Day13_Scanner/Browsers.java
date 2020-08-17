package Day13_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browserName = "safari";

        switch(browserName){
            case "chrome":
                System.out.println("Opening chrome browser");
                break;
            case "fireFox":
                System.out.println("Opening FireFox browser");
                break;
            case "opera":
                System.out.println("Opening Opera browser");
                break;
            case "safari":
                System.out.println("Opening Safari browser");
                break;
            case "edge":
                System.out.println("Opening Edge browser");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }


    }
}
