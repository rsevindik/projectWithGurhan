package Day25_Java_Practices;

public class FirstThreeChars {

    public static void main(String[] args) {
        String [] words = {"Apple", "Banana", "Strawberry", "Java", "Python"};

        for (int i = 0; i <=words.length-1 ; i++) {
            System.out.print(words[i].substring(0,3)+" ");
        }
        System.out.println();
        for(String each : words){
            System.out.print(each.substring(0,3)+" ");
        }


    }
}
