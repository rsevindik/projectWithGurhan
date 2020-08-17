package Office_Hours.Practice_07_14_2020;

public class Unique_Words {
    public static void main(String[] args) {

        String[] words = { "C#", "C#", "Python", "Python", "Java", "C++", "Ruby"};
        //                  0      1      2         3        4       5

        for(String b: words){

            int count = 0;
            for(String a : words){
                if(a.equals(b)){
                    count++;
                }
            }

            if(count == 1){ //1 for unique but if you change it to 2 it means which elements are repeated 2 times (there are two the same)
                System.out.println(b);
            }

        }


            }
        }

/*   here is the steps need to be repeated according to the numbers of element in array
        String s = words[0];
        int count = 0;

        for(String a : words){
            if(a.equals(s)){
                count++;
            }
        }
        if(count ==1){
            System.out.println(s);
        }

 */


