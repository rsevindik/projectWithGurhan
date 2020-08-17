public class Literals {

    public static void main(String [] args) {


        int apples = 20;
System.out.println("Today we sold " + apples + " bushels of apples.");   // Text1 + variables + Text2

int oranges = 2;
System.out.println("Today, we sold "+ oranges +" buckets of oranges.");  // text1 + variable + text2

int onebushelappleprice = 10;
int onebucketorangeprice = 8;

System.out.println("Todays sales:");
System.out.print("\t" + apples+ " b. of apple: "+ apples * onebushelappleprice+"\n");      // or you can use printLN to move on the next line
System.out.print("\t " + oranges+" b. of orange: "+ oranges * onebucketorangeprice+"\n");

    }
}
