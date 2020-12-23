import files.Payload;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.Test;

public class SumOfPriceValidation {

    //        6. Verify if Sum of all Course prices matches with Purchase Amount
    @Test
    public void sumOfCourses(){

        int sum =0;
        JsonPath js = new JsonPath(Payload.coursePrice()); //to parse json courseprice value but you can also use POJO classes
        int count = js.getInt("courses.size()");
        for (int i = 0; i <count ; i++) {
            int price = js.getInt("courses["+i+"].price");
            int copies = js.getInt("courses["+i+"].copies");
            int amount = price*copies;
            System.out.println("amount"+" for the course "+(i+1)+" = "+ amount);
            sum += amount;
        }
        System.out.println("sum = " + sum);
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        Assert.assertEquals(sum, purchaseAmount);     //Expected: 1162 but Actual: 910 this needs to be fixed by dev in API json document(in payload)

    }
}
