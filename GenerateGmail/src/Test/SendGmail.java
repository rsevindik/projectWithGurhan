package Test;

import Library.Util;

public class SendGmail {
    /*
    get permission from gmail;
first Step:
                go to  :
                     https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                        Make sure that your google account allows third part app
     */

    public static void main(String[] args) {

String userName = "rsuzem@gmail.com";
String password = "ramadan2328";

String [] receiver = {"yagmur3401@yahoo.com", "rsuzem@gmail.com"};
String subject = "testing";
String text = "sending this message from my program";

int times = 5;
int count =1;
while(times >0){   // outer loop == sending multiple times
    for( String each : receiver){  // sending emails to multiple people at the same time

        System.out.println("Sending to: "+each);
        Util.sendEmails(userName, password,each, subject,text); //change the string into string array variable (Each)
    }

    System.out.println(count++);
    times--;
}

        System.out.println("Mission Completed");

    }
}
