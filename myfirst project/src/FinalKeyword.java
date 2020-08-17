import jdk.swing.interop.SwingInterOpUtils;

public class FinalKeyword {
    public static void main(String[] args) {

    /*   final double INTEREST_RATE = 0.069; // interest rate %6.9 *** if you put FINAL in front of it it means;
                                          // you make it the same for all the time when you use it in you coding

        System.out.println(Math.PI); // by typing PI system will initialize it because it's defined info for java

        String MyFirstMessage = "Do your best!";
        String MySecondMessage = " and never give up!";

        System.out.println(MyFirstMessage+MySecondMessage);    // This is how concatenating Strings

        MyFirstMessage += ",\n\t";      // meaning that you want to add ", and give space in the front" to your message.!

        System.out.println(MyFirstMessage+MySecondMessage);       */

        String Ramazan_sMessage = "vagvb;asbkvvfljbvafivbkafsj,valvsfbvdfvhbadfvbdflvdfljvdfvbk;vbdf;kcb a;kb v;v v";
        int textsize = Ramazan_sMessage.length(); // counting letters(char) and assigning them to textsize as integer value.!

        System.out.println(textsize);

        char letter = Ramazan_sMessage.charAt(5) ; // end result will be 6th chr not the 5th one because;
                                                   // order of the char starts from 0 then 1,2,3,4,5..
        System.out.println(letter);

        System.out.println(Ramazan_sMessage.toLowerCase());
        System.out.println(Ramazan_sMessage.toUpperCase());
    }
}
