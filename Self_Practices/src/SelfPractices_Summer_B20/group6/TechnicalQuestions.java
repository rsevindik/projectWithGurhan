package SelfPractices_Summer_B20.group6;
import java.util.Arrays;
import java.util.Scanner;

public class TechnicalQuestions {
    public static void main(String[] args) {

        System.out.println("=====Aigerim=====");
        // how would you test an ATM machine? be specific about your plan,scenario(s) and test cases and some other test related action items please
        // what are we doing with the following code sequence, why is the result ..?
        String[] arr = {"Said", "Ahmet"};
        arr[0] = arr[1];
        arr[1] = arr[0];
        System.out.println(Arrays.toString(arr));
        // [Ahmet, Ahmet]
        System.out.println("=====Beyza=====");
        // could you please walk us through how we can create a new maven project to automize opening a google web page and closes
        // by using the given array below, get the following results and compare them output1: 1 2 3 4 5  output2: [1, 2, 3, 4, 5]
        int[] arr1 = {1, 2, 3, 4, 5};

        for (int each : arr1) {
            System.out.print(each);
        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));


        System.out.println("=====Violetta=====");
        // by using the given String text below, create your code sequence to please comma(,) between the letters (output:[A, B, C, D, E, F, G] or A, B, C, D, E, F, G)
        // what is tag in HTML how do we use it, give an example for clickable element visible on the web page and takes you to a specific URL once you click on it, please.!
        String word = "ABCDEFG";
        String[] AllCharacters = word.split("");
        // all characters from the string  as an array
        // splits the String character by character

        System.out.println(Arrays.toString(AllCharacters));

        String Str = "Java";
        char[] ch = Str.toCharArray();//no (“ “)

        System.out.println(Arrays.toString(ch));

        // Print: [A, B, C, D, E, F, G]  and [j, a, v, a]

        System.out.println("=====Edward=====");
        // Tell me your day to day activities (5 min)
        // by using the following 3D array please get me the result of;
        int[][][] num3D = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8, 9}}};
        //Print 1 2 3 4 5 6 7 8 9

        for (int[][] each : num3D) {
            for (int[] each1 : each) {
                for (int each2 : each1) {
                    System.out.print(each2);
                }
            }
        }
        System.out.println();
        System.out.println("=====Said=====");
        // What is your main responsibilities in your team and/or at your work environment (5 min)
        // please look at the following 2 different code sequences below. if there is a bug and if it's fixable please fix it then get the results and then compare those results. (3 min)
        char[] characters = {'a', 'b', 'c', 'd', 'e'};
        for (char each : characters) {

            System.out.print(each + " ");

            if (each == 'b')
                continue;  // abc
            // =====if there is a bug please fix it then get the results and then compare those two coding sequences, ====//
            int[] numbers = {10, 20, 30, 40};

            for (int eachValues : numbers) {
                if (eachValues == 20) {
                    continue;
                    //  System.out.print(eachValues + " ");
                }

            }
        }
        System.out.println();
        System.out.println("=====Ahmet=====");
        // tell my about your current/most recent project (5 min)
     /* starting from the following array int[] array= {2,5,1,4,7,6,3}; please get the following result; [7, 6, 5, 4, 3, 2, 1] by writing your code sequence and briefly explain.(3)

            public static int[] Sort(int[] arr) {
                Arrays.sort(arr);
                int[]numbers=new int[arr.length];
                int z=0;
                for(int i=arr.length-1;i>=0;i--) {
                    numbers[z]=arr[i];
                    z++;
                }
                return numbers;
            }
            public static void main(String[] args) {
                int[] array= {1,2,3,4,5,6,7};
                Sort(array);
                System.out.println(Arrays.toString(array));
            }
        }
      */
        System.out.println("=====Nurshat=====");
        // how and when you are estimating user stories? and how this process will help your team to create sprint back log?
        // by using the following code sequence, predict what would be your output if you add different branch statement one at a time, then explain your reasoning
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                //continue; // break; // return; // System.exit(0);  // close();
            }
            System.out.println(i);
        }
        System.out.println("Completed");

        System.out.println("=====Roman=====");

        float num10 = Float.parseFloat("5.5");  // none
        System.out.println(num10 + 5.6);

        Integer num1 = Integer.parseInt("12");   // Auto-boxing
        System.out.println(num1);

        byte z1 = Byte.valueOf("123");//unboxing
        System.out.println(z1);

        boolean A = Boolean.parseBoolean("CybertekBatch20");//any string other than true will return false
        System.out.println(A);

        boolean c = Boolean.parseBoolean("TruE");//noncasesensitive so return us true
        System.out.println(c);

        //Short D=Double.parseDouble("19");//short wrapper class is only  dedicated to short primitive.you can not assign like that
        //System.out.println(D);

        Integer z4 = Integer.valueOf("1234");//none
        System.out.println(z4);

        System.out.println("=====RAMAZAN (just for practice) =====");

        String str = "aabbaaabbbcccccDDaaEEE";

        String RemoveDup = "";  // to store the non duplicated values of the str
        for (int i = 0; i < str.length(); i++) {
            if (!RemoveDup.contains(str.substring(i, i + 1))) {
                //if(!removedDuplicate.contains(""+str.charAt(i))) buda olur

                RemoveDup += str.substring(i, i + 1);
            }
        }
        System.out.println(RemoveDup);

        String result = "";  // to store the expected result

        for (int j = 0; j < RemoveDup.length(); j++) {
            int count = 0;  // count the numbers of apperances
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals(RemoveDup.substring(j, j + 1))) {
                    count++;
                }
            }
            result += RemoveDup.substring(j, j + 1) + count;
        }
        System.out.println(result);
        // ====================================== //

        String str2 = "AABBCCDD";   // expected result = "A2B2C2D2";

        String expectedResult = "";

        int j = 0;
        while (j < str2.length()) {
            int count = 0;
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == str2.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str2.charAt(j) + "" + count;
            str2 = str2.replace("" + str2.charAt(j), "");
            // after adding the str.charAt(j),
        }
        System.out.println(expectedResult);

        System.out.println("========ramazan===");

        char[] ch1 = {'j', 'a', 'v', 'a'};
        String str1 = new String(ch1);
        System.out.println(str1);
        String[] str3 = {"j", "a", "v", "a"};
        String str4 = new String(String.valueOf(str3));
        System.out.println(str4);

        System.out.println("=====Musa=====");
        // what are unpair tags, give 3 examples.
        //  write a method that converts gallon into liters. input: 10.0 gallons output: 10.0 gallons equal to 37.5 liters

      //  GallonToLitter(10);
     //   KmToMiles(10);
      //  combineArrays(new String[] {"Fatma", "Ramazan"},new String[]{"Ahmet", "Zehra","Betul"});

    }//last curly brace of main method

    public static void GallonToLitter(double gallons) {
        // double gallon = new java.util.Scanner(System.in).nextDouble();
        double Liters = gallons * 3.75;
        System.out.println(gallons + " gallons equal to " + Liters + " liters");
    }

    public static void KmToMiles(double KM) {

        double Miles = KM * 0.612;
        System.out.println(KM + " km equals to " + Miles + " miles");
    }

    // ====================================== //

    public static void combineArrays(String[] str1, String[] str2) {

        String[] newArray = new String[str1.length + str2.length];
        int index = 0;
        for (String each : str1) {
            newArray[index] = each;
            index++;
        }
        for (String each : str2) {
            newArray[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }

    }