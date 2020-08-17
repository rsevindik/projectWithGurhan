package SelfPractices_Summer_B20;

public class ShortHandOperators {
    public static void main(String[] args) {

        int guests = 3;
        guests = guests + 2;
        System.out.println(guests);

        guests += 3;
        System.out.println(guests);

        guests -= 4;
        System.out.println(guests);

        int apples = 3;
        apples *= 2;                // apples = apples * 2; is the same as apples *= 2;
        System.out.println(apples);

        apples += 4;
        System.out.println(apples);

        apples -= 5;
        System.out.println(apples);

        /*
        apples =+ 4; system will not compile it. it will recognize 4 as +4!
        apples =- 5; system will not compile it. it will recognize 5 as -5!
         */

        int minutes = 315;
        int hours = minutes / 60;
        System.out.println(hours);

        minutes = minutes % 60;  // or you can put minutes %= 60; as short hand operator!!
        System.out.println(minutes);

        int time = 460;
        int hours2 = time / 60;
        int minutes2 = time % 60;
        System.out.println("We have been traveling for " + hours2 +" hours and " + minutes2 + " minutes.");

        boolean sweet = false;
        boolean hot = (sweet = true);

        System.out.println(sweet);
        System.out.println(hot);



    }
}
