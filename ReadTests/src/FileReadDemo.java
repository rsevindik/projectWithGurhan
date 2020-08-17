import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner keyboard = new Scanner(System.in);
        
       System.out.print("Enter the filename: ");
       String filename = keyboard.nextLine();
       
       File fi = new File(filename);
       Scanner file_reader = new Scanner(fi);
       
        while(file_reader.hasNext()){

            String friendName = file_reader.nextLine();
            System.out.println(friendNAme);
        }

        do {
            String friendName = file_reader.nextLine();
            System.out.println(friendName);
        }while (file_reader.hasNext());

         file_reader.close();
        
        }
        
        
        
    }
}
