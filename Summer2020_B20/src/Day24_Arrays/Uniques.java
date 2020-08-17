package Day24_Arrays;
/*
write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
     */
public class Uniques {
    public static void main(String[] args) {
        String str = "aabccd";
        String uniques = "";

        for (int i = 0; i <=str.length()-1 ; i++) {

            char ch = str.charAt(i);        // a a b c c d
            int first = str.indexOf(ch);    // 0 0 2 3 3 5  : first time this ch occurred
            int last = str.lastIndexOf(ch); // 1 1 2 4 4 5  : last time this ch occurred means did not repeat (only one time have been
                                            // seen in exactly the same spot=index num)
            if(first == last){
                uniques +=ch;
            }
        }
        System.out.println();
    }


}
