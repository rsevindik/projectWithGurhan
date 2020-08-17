package SelfPractices_Summer_B20;

public class IncrementDecrement {
    public static void main(String[] args) {

        int apples = 0;
        System.out.println(apples);
        System.out.println(++apples);
        System.out.println(apples);
        System.out.println(apples++);
        System.out.println(apples);
        --apples;                    // instead of System.out.println(--apples); you use --apples;
        System.out.println(apples);
        System.out.println(apples--);

        int pears = 3;
                     // 4    * 5 /   4     +    2   => 7
        int basket = ++pears * 5 / pears-- + --pears;
        System.out.println(basket);
        System.out.println(pears);

        int counter = 10;
        counter = counter + 1;   // counter is 11

        System.out.println(counter++); // will print 11 but value of the counter will be 12
        counter--;                     // now counter will be 11
        System.out.println(--counter); // at this point counter will be printed as 10-1 (because its pre-decrement)





    }
}
