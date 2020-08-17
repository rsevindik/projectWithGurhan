package ShortReviewVideos;

public class switchStatements {

    public static void main(String[] args) {
        int restaurantRate = 6; // char restaurantRate = 'A'; then use A,B,C.. for cases not numbers
        String rating = " ";  // optional but if you use then add sout at the end for printing result.!
                                  // no BOOLEAN, DOUBLES OR FLOATS.!
        switch(restaurantRate){  // only char, short,byte,int or String can be used for switch statement
            case 1:                     // but it does not require another sout at the end.!
                rating = "my favorite"; // the same as System.out.println("my favorite");
                break;
            case 2:                  // listed cases have the same value and will print the same output/end result.!
            case 3:
                rating = "Good";      // for option 2 and 3 we will get "Good"..!
                break;
            case 4:
            case 5:
                rating = "not bad";
                break;
            case 6:
            case 7:
            case 8:
                rating = "could be better";
                break;
            case 9:
            case 10:
                rating = "the worst I've ever seen";
                break;
            default:                               // IS NOT NECESSARY.!
                rating = "haven't dined so far!";
                break;                            // FOR THE LAST STATEMENT break; IS NOT NECESSARY SINCE THERE IS: }
        }
        System.out.println(rating);
    }
}
