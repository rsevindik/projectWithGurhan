import static io.restassured.RestAssured.*;

import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

public class DynamicJson {

    @Test
    public void addBook(){
        RestAssured.baseURI="http://216.10.245.166";
        Response resp = given().header("Content-Type", "application/json")
                .body(Payload.addBook())
                .when().post("/Library/AddBook.php")
                .then().log().all().assertThat().statusCode(200)
                .extract().response();
        JsonPath js = ReusableMethods.rawToJson(resp);
        String id = js.get("ID");
        System.out.println("id = " + id);

    }
    /*
    @Test
    public void addBook(){                // this is like a hard coding needs to be unified and executed again and again
        RestAssured.baseURI="http://216.10.245.166";
        String response = given().header("Content-Type", "application/json") //test will fail coz book already exists
                .body(Payload.addBook())
                .when().post("/Library/AddBook.php")
                .then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        JsonPath js = ReusableMethods.rawToJson(response);
        String id = js.get("ID");
        System.out.println("id = " + id);
    }
    */
}
