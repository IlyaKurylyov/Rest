package Rest;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class DeliveryRest {
    @BeforeAll
    public static void setup(){
        //ПОЛУЧАЕМ ТОКЕН
        Response response =
                given().
                        header("Content type","application/json").
                        body("""
                                {
                                "username": "user7",
                                "password": "hellowuser7"
                                 }""").
                when().
                post("http://51.250.6.164:8080/login/student").
                then().
                        statusCode(200).extract().response();

        //ЗАПОЛНЯЕМ HEADERS
        Map<String,String> headers = new HashMap<>();
        headers.put("Content type","application/json");
        headers.put("Authorization","Bearer" + response.body().asString());

        //ПОЛУЧЕНИЕ СПИСКА ЗАКАЗОВ
        Response responseOrders =
                given().
                        headers(headers).
                when().
                    get("http://51.250.6.164:8080/orders").
                then().
                        statusCode(200).extract().response();
        System.out.println(responseOrders.body().asString());

    }

}
