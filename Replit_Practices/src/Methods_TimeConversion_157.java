import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Methods_TimeConversion_157 {
    public static void main(String[] args) {

        timeConversion("07:05:45PM");

    }
    public static void timeConversion(String s) {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("h:mm:ssa");
        LocalTime lTime = LocalTime.parse(s,s.length()==10 ? timeFormat : militaryTime);
        System.out.println(lTime.format(DateTimeFormatter.ISO_TIME));

        /*
        if(s.equals("12:00:00AM")){
		   System.out.println("00:00:00");
		 }else if(s.equals("12:00:00PM")){
		   System.out.println("12:00:00");
		 }else if(s.contains("AM")){

		   int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
		   s = s.replace("AM","");
		   if(hour == 12){
		     s = "00"+ s.substring(2);
		   }
		   System.out.println(s);

		 }else if(s.contains("PM")){
		   int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
		   hour +=12;
		   String newTime = hour+s.substring(s.indexOf(":")).replace("PM","");
		   System.out.println(newTime);
		 }
         */
    }
}
