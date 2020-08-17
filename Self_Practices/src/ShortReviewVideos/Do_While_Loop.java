package ShortReviewVideos;

public class Do_While_Loop {
    public static void main(String[] args) {
    /*
        int apples = 1;
        int totalApples = 10;//but you cannot move this to do boy and replace it(totalApples with 10 in while statement since its out of do body.!
        do{
            System.out.println("Eating an apple - "+apples);
            apples++; //if you don't use this while statement will not get false eventual and prog. will run none stop.!
        }while(apples <= totalApples);  //will run and print the statement until condition becomes false.!! original one was <=10;

        System.out.println(totalApples);

        System.out.println("=====================================');

        int number = 1;
        int until = 10;

        do{
            System.out.println(number + ", ");
    //        number++;              we can also merge increment to the while conditional statement as follow
    //    }while(number <= until);

        }while(++number<= until);   // find a reasonable answer for that.!

     */
        System.out.println("==============================");

        int number = 1;
        int countDownTo = 10;

        do{
            System.out.print(countDownTo+ ", ");   // starting number.!!
            countDownTo--;                          // action moving up or down.!!
        }while(countDownTo >= number);
    }
}
