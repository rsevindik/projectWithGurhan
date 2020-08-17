public class  SimpleFor {
    public static void main(String[] args) {

        for (int number = 1; number <= 5; number++){
            System.out.println(number + " Hello");
        }

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int number;
        System.out.println("Number\tNumber \n\t\tsquared");
        System.out.println("======================");

        for (number = 0; number <= 10 ; number++) {
            System.out.println(number+ "\t\t" +number*number);
        }

    }

}


