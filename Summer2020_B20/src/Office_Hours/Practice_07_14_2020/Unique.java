package Office_Hours.Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {
        String str = "ABABC";   // "C" will be our output (Only the ones frequency is 1 will be added)
        String expectedResult = "";

        for (int j = 0; j <= str.length()-1 ; j++) { // outer loop only helps going one by one between each char.!
            char ch = str.charAt(j);
            int count = 0;  // it's out of loop cuz don't need to be repeated(Frequency)
            for (int i = 0; i <= str.length()-1 ; i++) { // helps counting frequency and assign it to the count(variable)
                char each = str.charAt(i);
                if(each == ch){
                    count +=1;
                }
            }
            if(count == 1){   // unique
                expectedResult += ch;
            }
        }


        System.out.println(expectedResult);

     /*  the following part needs to be repeated as many times as the length of str therefore we need another loop
        char ch = str.charAt(0);
        int count = 0;  // it's out of loop cuz don't need to be repeated(Frequency)
        for (int i = 0; i <= str.length()-1 ; i++) { // helps counting frequency
           char each = str.charAt(i);
            if(each == ch){
                count +=1;
            }
        }
        if(count == 1){
            expectedResult += ch;
        }

      */



    }
}
