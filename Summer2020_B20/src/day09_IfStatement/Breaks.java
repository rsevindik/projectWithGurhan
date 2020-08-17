package day09_IfStatement;

public class Breaks {
    public static void main(String[] args) {

      String itsBreakTime = "Yes";

      if(itsBreakTime == "Yes"){
          System.out.println("Take a 15' break");
      }else{
          System.out.println("Keep working");
      }
        System.out.println("=======w/Ternary==============");

      String itsBreakTime2 = (itsBreakTime == "Yes")? "Take a 15' break" : "Keep working";
        System.out.println(itsBreakTime2);

        System.out.println("===============================");

      int a = 1000;
      int b = 200;

      if(a>b){
          System.out.println(a+" is the max number");
      }else{
          System.out.println(b+" is the max number");
      }
        System.out.println("=======w/Ternary==============");
      String max = (a>b)? a+" is the max number": b+" is the max number";
        System.out.println(max);
    }
}
