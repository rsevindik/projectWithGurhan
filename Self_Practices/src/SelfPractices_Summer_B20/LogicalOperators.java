package SelfPractices_Summer_B20;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(2 < 4 && 4 < 6);

        boolean b = 10 == 10 && false;
        System.out.println(b);

        String drink = "tea";  // if yu change "Coffee' to 'Tea" then statement will be FALSE (which was TRUE before!
        boolean hot = true;
        boolean free = true;

        boolean bool = drink.equals("coffee") && hot && free;  // if you use '&' sing '&&' double and sign, then system
        System.out.println(bool);                 // will focus on all statement not just a small part of the statement

        bool = drink.equals("coffee") & hot;
        bool = drink.equals("coffee") && hot;
        System.out.println(bool);


        System.out.println(true || true);  // '|' pipe yada '||' pipes which stands for OR
        System.out.println(false || true); // and it means both needs to be true for true end result
        System.out.println(true || false);
        System.out.println(false || false);

        bool = 4 < 10 || 4 > 5;
        System.out.println(bool);

        bool = drink.equals ("tea") || drink.equals ("coffee");
        System.out.println(bool);

        bool = drink.equals ("water") || drink.equals ("coffee");
        System.out.println(bool);

        String model = "bmw";   // you want to buy bmw but audi is also okay for you!
        bool = model.equals("bmw") || model.equals("audi"); // if you put AND (& or &&) this is wrong statement!!
        System.out.println(bool);

        System.out.println(!false);  // ! means NOT

        bool = !true;
        System.out.println(bool);

        bool = !bool;
        System.out.println(bool);

        // ^ exclusive or known as logical XOR operator meaning that if they are the same = false,
        // if they are different then end result will be true!!
        // ^ also stands for power in math such as 10 ^ 4 = 10*10*10*10

        System.out.println(true ^ true);  // false
        System.out.println(false ^ true); // true
        System.out.println(true ^ false); // true
        System.out.println(false ^ false); // false

        hot = true;
        free = true;
        System.out.println(hot ^ free);  // true ^ true is false !!

        // Precedence (order) of logical operators (using more than one operators at the same time!!
        /*
        ! is evaluated first,
        && second,
        || third
         */
                         //  T      or       F       , then the end result will be TRUE
        System.out.println(!(false) || true && false);

                        //  F      and      T       , then the end result will be FALSE
        System.out.println(!(true) && true || false);

           //  !(  T   and(  T   or   T )) => => !(T and T) => => ! T , then the end result will be FALSE
        bool = !(1 < 8 && (5 > 2 || 3 < 5));
        System.out.println(bool);





    }
}
