import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
    public static void main(String[] args) {
        //TODO Auto-generate method stub

        JsonPath js = new JsonPath(Payload.coursePrice()); //mocking this api coz it's not in our environment yet
        // (while we are waiting for dev just complete testing with dummy variables then switch them with real api.

//        1. Print No of courses returned by API
        int count = js.getInt("courses.size()");
        System.out.println("count = " + count);

//        2.Print Purchase Amount
        int totalAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println("totalAmount = " + totalAmount);

//        3. Print Title of the first course  ****** hard coding to see how it works ********
        String titleOfFirstCourse = js.get("courses[0].title");
        System.out.println("Title Of the First Course= " + titleOfFirstCourse);

//        4. Print All course titles and their respective Prices
        for (int i = 0; i < count; i++) {
            String courseTitles = js.get("courses[" + i + "].title"); //within the ""string value by using parameterazing method add dynamic variable
            System.out.println("courseTitle " + (i + 1) + " = " + courseTitles);

            System.out.println("courseTitle " + (i + 1) + "'s price = " + js.get("courses[" + i + "].price").toString()); //print without creating variable
        }

//        5. Print no of copies sold by RPA Course; be careful about dynamic order, value (RPA would be in the 1st index instead 3rd)
        for (int i = 0; i < count; i++) {
            String courseTitles = js.get("courses[" + i + "].title"); //within the ""string value by using parameterizing method add dynamic variable
            if (courseTitles.equalsIgnoreCase("RPA")) { //check point = condition
                int copies = js.get("courses[" + i + "].copies");     // copies sold.!
                System.out.println("copies = " + copies);
                break;                                            // important for leaving the loop ones we found the specified object
            }
        }
    }
}

