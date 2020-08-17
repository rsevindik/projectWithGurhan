package Office_Hours.Practice_07_15_2020;

public class Frequency_Of_Words {
    public static void main(String[] args) {
/*
        String str = "cat cat cat cat cat cat";

        int count = 0;
        while(str.contains("cat")){
            count++;

            str = str.replaceFirst("cat","");  // DON'T FORGET TO ASSIGN IT TO THE NEW STR.!!

        }
        System.out.println(count);

 */
        String str = "cat dog cat dog cat cat".toLowerCase();
        // str=str.toLowerCase();      is also possible.!! but if you go one by one then place toLowerCase after str(s)

        int countOfDog = 0;
        while(str.contains("do")){
            countOfDog++;

            str = str.replaceFirst("dog","");  // DON'T FORGET TO ASSIGN IT TO THE NEW STR.!!

        }
        System.out.println(countOfDog);
        int countOfCat = 0;
        while(str.contains("cat")){
            countOfCat++;

            str = str.replaceFirst("cat","");  // DON'T FORGET TO ASSIGN IT TO THE NEW STR.!!

        }
        System.out.println("dog: "+countOfDog);
        System.out.println("cat:"+countOfCat);

        System.out.println(countOfCat == countOfDog);

    }
}
