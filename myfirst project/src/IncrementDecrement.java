public class IncrementDecrement {
    public static void main(String[] args) {

        int number =4;

        System.out.println("number is "+number);
        System.out.println("I will increment number. ");

        number++; // number = number +1; // postfix increment

        System.out.println("Now, number is "+number);
        System.out.println("I will decrement number.");

        number--;

        System.out.println("Now, number is "+number);


        System.out.println("Now, I will Increment number by prefix. ");

        ++number; // prefix decrement

        System.out.println("Now, number is "+number);
        System.out.println("Its time to decrement by prefix");

        --number;

        System.out.println("Finally, number is "+number);

    }
}


