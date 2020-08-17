package Office_Hours.Practice_07_15_2020;

public class Frequency_Of_Words2 {
    public static void main(String[] args) {
        String str = "JavajavaJavajava".toLowerCase();

        int count=0;
        while(str.contains("java")){    // repeated if statement (Looping)
            str = str.replaceFirst("java","");
            count++;
        }
        System.out.println(count);

    }
}
