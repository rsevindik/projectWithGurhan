package Day28_Recaps;
/*
1. write a program return the frequency of a word from a string
 */
public class Frequency_Of_Word {
    public static void main(String[] args) {

        String str = "Javajava".toLowerCase();

        //substring(0,4) ==> java
        //substring (1,5) ==> avaj
        //substring (2,6) ==> vaja
        //substring (3,7) ==> ajav
        //substring (4,8) ==> java  8 will not cause IOB error since it will be excluded

        //substring(i, i+4)

        // "java"


        int count = 0;                                  // INTERVIEW QUESTION
        for (int i = 0; i <= str.length()-4 ; i++) { // i: 0,1,2,3,4,5,6,7
                                                    // in order to exit after reaching last index length()-4
                String s = str.substring(i,i+4);   // note that the num you add to i will be subtracted from length to keep it in bound.!
                if(s.equals("java")){
                    count++;
                }

        }
        System.out.println(count);

    }
}
