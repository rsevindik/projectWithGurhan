package Day28_Recaps;

import java.util.Arrays;

public class MultiDimensionalArray_Practice1 {
    public static void main(String[] args) {

        String[] group33 = {"Davut", "Dilara", "Nurmamet", "Nurbiye", "Pavlo", "Julaiti", "Virginia", "Zain", "Ali", "Etnick", "Aigul", "Mike", "Veola"};
        String[] group22 = {"Aiperi", "Aalia", "Rumiya", "Viorel", "Samir"};
        String[] group2 = {"Ali", "Anton", "Elif", "Filip", "Guljannat"};
        String[] group21 = {"Violeta", "Alla", "Adam", "Lilia"};
        String[] group17 = {"Elvira", "Zeliha", "Paban", "Asylkan", "Dilyar", "Roza", "Kamil", "Sedge"};

        String[][] Batch20 = {group33, group22, group2, group21, group17};

        for (int i = 0; i <= Batch20.length - 1; i++) {  // each array **********
            String[] eachGroup = Batch20[i];//since this will be used only 2 times then use Batch20[i] directly instead of eachGroup in the loop.!
            //  System.out.println(Arrays.toString(eachGroup));  // this will print out the groups
            for (int j = 0; j <= eachGroup.length - 1; j++) {   // each element *********
                String eachStudent = eachGroup[j];
                if (eachStudent.toLowerCase().contains("m")) {
                    System.out.println(eachStudent + ""); // any group which does not have a person includes "m" will not be printed.!
                }

            }
            System.out.println();

        }
    }
}

        // String arrGroup38 [] = {Sehri, Gelila, Miriguli Tuersun, Ceren}, {Beyza, Ramazan, Gulhanim, Dilnoza},
        // {Fatime Murat, Marcel}, {Ivan, Batireedui};