package ShortReviewVideos;

public class StringObjects {
    public static void main(String[] args) {

        String country = "Turkey is my home country";
        System.out.println(country.toUpperCase()); // TURKEY
        System.out.println(country.toLowerCase()); //turkey
        System.out.println(country.length());  // 6
        System.out.println(country.charAt(2)); // r  (starts from 0,1-2-3-4-...)
        System.out.println(country.startsWith("T.C.")); // boolean : true or false.!
        System.out.println(country.contains("is"));     // boolean : true or false.!
        System.out.println(country.indexOf("e"));
        System.out.println(country.substring(2, 15)); //2: rkey is my home country or 2,15:rkey is my ho (inbetween)
        System.out.println(country.trim());
    }
}
