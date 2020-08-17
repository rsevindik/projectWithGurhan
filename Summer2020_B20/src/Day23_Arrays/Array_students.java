package Day23_Arrays;

public class Array_students {
    public static void main(String[] args) {

       // String students = "Muhtar", "Nadir", "Asia";

       String [] students = {"Cybertek","Muhtar", "Nadir", "Asia", "Saim"}; //[] will store more than data into the same variable
                //index #       0           1        2        3

       String name1 =  students[1];  // index 1 will return "Muhtar" but 8 will give you "index out of bounds" error.!

        System.out.println(name1);
        System.out.println("===============================");

        String [] studentName = {"Mike","Adam","Tonny","John","Amy"};
        int [] scores = {85,70,95,90,100};

        for (int i = 0; i <=4 ; i++) {
            System.out.println(studentName[i]+" : " +scores[i]);
        }
        System.out.println("==============================");

        String [] classMates = new String [5];
        classMates [0] ="Ramazan";
        classMates [2] = "Sevindik";
        classMates [1] = "Adam";
        classMates [3] = "Zehra";
        classMates [4] = "Betul";

        for (int i = 0; i <=classMates.length-1 ; i++) {
            System.out.println(classMates[i]);  // if no assigned names will only return null empty String.!

        }


    }
}



