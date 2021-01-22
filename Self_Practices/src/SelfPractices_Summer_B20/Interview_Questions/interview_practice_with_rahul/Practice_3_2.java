package SelfPractices_Summer_B20.Interview_Questions.interview_practice_with_rahul;

import java.util.Random;

public class Practice_3_2 {
    public static void main(String[] args) {

        // creating a random string and number!! USING RANDOM CLASS
        Random rand = new Random();

        int rand_int = rand.nextInt(1000);
        System.out.println("Random Num between 0 and 1000: "+rand_int);

        double rand_double = rand.nextDouble();
        System.out.println("Random double num between 0 and 1: "+rand_double);

        // 2nd Way; USING MATH CLASS
        System.out.println("Math.random() = " + Math.random());

        /* 3rd Way; USING Apache commons - lang API
        String radNumWithApache = RandomStringUtils.randomNumeric(10); // you must dowload apache commons - lang API with maven rep.
        System.out.println("RandomStringUtils.randomNumeric() = " + radNumWithApache);
         */


    }






}
