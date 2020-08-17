public class Checkpoint_3_23_b {
    public static void main(String[] args) {

        int temp = 78, base = 46, population;

         population = temp > 45 ? base*10 : base * 2;

        System.out.println(population);

        int month = 1;

        if (month == 1){
            System.out.println("January");
        }
        else if (month == 2){
            System.out.println("February");
        }
        else if (month == 3){
            System.out.println("March");
        }else{
            System.out.println("Error: Invalid Month");
        }

    }
}
