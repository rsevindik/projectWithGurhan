package files;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {

    public static XmlPath rawToXml(Response r){

        String respon = r.asString();
        XmlPath x = new XmlPath(respon);
        return x;
    }

    public static JsonPath rawToJson(Response r){ //String varibale will be parsed to json format

        String respon = r.asString();
        JsonPath x = new JsonPath(respon);
        return x;                             //since we return value it must be jsonpath return type in the method
    }
    public static String getSessionKey(){
        RestAssured.baseURI="http://localhost:8080";
        Response res = given().header("Content-Type","application/json")
                .body("")
                .when().post()
    }


}
