package Office_Hours.Practice_06_23_2020;

public class IfStatement_Quiz {
    public static void main(String[] args) {


        int score = 0;
        if(score==0){     //2 independent (Single) if statement.!!
            score +=50;
        }
        if(score !=0){
            score += 50;
        }
        System.out.println(score);

        System.out.println("============================");

        char grade = 'A';
        boolean passed = grade == 'A' || grade == 'B'; // true
        boolean passed2 = grade == 'C' || grade == 'D'; // false

        if(passed || passed2){  // t or f ==> true  (this statement will be executed!
            System.out.println("You passed the exam.!");
        }else{
            System.out.println("You failed.!");
        }
        System.out.println("==================================");

        int number = 10;   // Don't forget only one and always the first one will get executed.!
        if(--number >10){
            System.out.println("Hello Cybertek " +number);
        }else{
            System.out.println("Hello World "+number);
        }
        System.out.println("==================================");
        boolean x = true;
        boolean y = !x == false; // y = false == false which is true then (both x and y are true.!)
        boolean z = y; // true

        if(x){
            System.out.println("x");  // all will be get executed due to single statement (they are independent)
        }
        if(y){
            System.out.println("y");  // if it was a multi if-else-else statement then
                                     // only one and the first one will be executed.! ****************
        }
        if(z){
            System.out.println("z");
        }
        System.out.println("============================");
        int x2 = 10;
        int y2 = x2++;
        // y2 = 10, x2=11 due to the post increment.!
        System.out.println(y2++ + " "+ x2++ +" " + y2);
                        // 10  + conc.11 + conc. 11
        // and also;
        int X = 10;
        int Y = X++;

        // y = 11     X = 12

        System.out.println( Y++ + " " +  X++ +" " + Y +" "+ X );
        //                   10 + " " +   11 + "  " + 11    12



    }
}
