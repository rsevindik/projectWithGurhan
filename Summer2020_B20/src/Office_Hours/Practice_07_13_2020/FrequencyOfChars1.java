package Office_Hours.Practice_07_13_2020;

public class FrequencyOfChars1 {
    public static void main(String[] args) {

        String str = "ramazan";      // O2P1Q2, use charAt to retrieve every single char
        String nonDuplicates = ""; // OPQ

        //removing duplicates
        for (int i = 0; i <= str.length()-1 ; i++) {  // i: index number
            String s = ""+ str.charAt(i);  // O O P Q Q
            if(! nonDuplicates.contains(s)){ // does not contain !..when it's true then we will add this char to nondupl
                nonDuplicates += s;          // if statement is false then s value(char) won't be added
            }
        }
        System.out.println("unique chars: "+nonDuplicates);

        // frequency (how many times repeated (Counter)
        String result = "";

        for (int j = 0; j <= nonDuplicates.length()-1 ; j++) {
            char ch = nonDuplicates.charAt(j);//that's how we can get every single char then store it into a string(Result)
            int count = 0; // will help us to count frequency but in order to be able to compare the char one by one (Loop)

            for (int i = 0; i <= str.length()-1 ; i++) {  //you can not go by decrement since there is no negative index (0 is the smallest)
                char each = str.charAt(i);
                if (each == ch) {
                    count += 1;
                }
            }

    /*
        char ch1 = nonDuplicates.charAt(0);//that's how we can get every single char then store it into a string(Result)
        int count1 = 0; // will help us to count frequency but in order to be able to compare the char one by one (Loop)
        for (int i = 0; i <= str.length()-1 ; i++) {  //you can not go by decrement since there is no negative index (0 is the smallest)
            char each = str.charAt(i);
            if(each == ch1){
                count1 +=1;
        }
        }
                result += ""+ch1+count1;  // by adding ""+ you will concat chars to the string.!
                char ch2 = nonDuplicates.charAt(1);
                int count2 = 0;
                String result2 = "";
                for (int i = 0; i <= str.length()-1 ; i++) {
                    char each = str.charAt(i);
                    if(each == ch2){
                        count2 +=1;
                    }
                }
                result2 += ""+ch2+count2;
                char ch3 = nonDup.charAt(2); // Q
                int count3 = 0;
                for(int i = 0; i <= str.length()-1; i++){
                    char each = str.charAt(i);
                    if(each == ch3){
                    count3++;
            }
        }
        result += ""+ch3+count3;
     */
            result += ""+ch+count;
        }
        System.out.println("Frequency of each char: "+result);
    }
}
