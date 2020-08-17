package Day22_NestedLoop;

public class NestedLoop3 {
    public static void main(String[] args) {

        int j = 1;
        while(j<=10){                       //outer loop creates multiple numbers of lines
          for (int i = 1; i <=5 ; i++) {   // creating a sing line with many *
              System.out.print(" * ");
          }
            System.out.println();
               j++;
        }
    }
}
