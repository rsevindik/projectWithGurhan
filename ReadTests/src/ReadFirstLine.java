import javax.swing.text.Style;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFirstLine {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner keyb = new Scanner(System.in);

        System.out.print("Enter the name of a file: ");
        String filename = keyb.nextLine();

        File f = new File(filename);
        Scanner inputFile = new Scanner(f);

        String Line = inputFile.nextLine();

        System.out.println("The first line in the file is: ");
        System.out.println(Line);

        inputFile.close();




    }
}
