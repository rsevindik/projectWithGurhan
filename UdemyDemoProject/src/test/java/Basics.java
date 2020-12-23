import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Basics {
    public static void main(String[] args) throws IOException {
        //TODO Auto-generated method stub
        // validate if Add place API is working as expected
        /*
        Add (POST) Place ==> Update place with new address ==> get place to validate if new address is present in response

        given- all input details
        when - submit the API
        Then - validate the response

        content of the file to string in body ==> convert content of file into Byte first then convert Byte data into String
         */
        RestAssured.baseURI="http://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
               // .body(Payload.addPlace())
                .body(new String(Files.readAllBytes(Paths.get("/Users/yagmur/Desktop/PostmanRegres/addPlace.json"))))
                .when().post("maps/api/place/add/json")
        .then().assertThat().statusCode(200).body("scope",equalTo("APP")) //import static org.hamcrest.Matchers.*;
        .header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();

        System.out.println(response);

        JsonPath js=new JsonPath(response);//to parse string value into json
        String placeID = js.getString("place_id"); //get the string out of the (place_id) path
        System.out.println("placeID = " + placeID);

        //UPDATE place
        String newAddress="Uzem Dersaneleri,USAK";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"place_id\": \""+placeID+"\",\n" +
                        "    \"address\": \""+newAddress+"\",\n" +  // added new address instead of hard coded.!
                        "    \"key\": \"qaclick123\"\n" +
                        "}")
                .when().put("maps/api/place/update/json")
                .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));

    //Get Place; no body, therefore no header content-type needed (we do not send request just receive info by retrieving
        Response getPlaceResponse = given().log().all().queryParam("key","qaclick123")
                .queryParam("place_id", placeID)
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response(); //Json is a class which accepts STRING args

        // JsonPath js2 = new JsonPath(getPlaceResponse);
        // will be removed because we created reusable methods in a separated class to increase readability. It was used for parse/convert string into json and store it in js2 objt.!!

        JsonPath js2 = ReusableMethods.rawToJson(getPlaceResponse);//converting raw string(getPlaceResponse) into json and store it in json obj (js2)
        String actualAddress = js2.getString("address"); // from js2 json object extracting string with the path of "address"
        System.out.println("actualAddress = " + actualAddress);

        Assert.assertEquals(actualAddress,newAddress); // we implement cucumber testNG (can also use JUnit) for assertions

    }
}
