package org.example;
import com.google.gson.Gson;
import rest.dto.Order;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;
import static org.hamcrest.Matchers.*;
///import

public class RestTest {

    @Test
    public void SerialisedTest(){
        Order requestorder = new Order();

        requestorder.setStatus("OPEN");
        requestorder.setCourierId(123);
        requestorder.setCustomerName("JoJo");
        requestorder.setCustomerPhone("12345678");
        requestorder.setComment("Faster!");

        Gson gson = new Gson();
        String StringRequestOrder = gson.toJson(requestorder);

        given().contentType("application/json")
                .body(StringRequestOrder)
        .when()
                .post("http://51.250.6.164:8080/test-orders")
        .then()
                .statusCode(200)
                .body("status",equalTo(requestorder.getStatus()));
    }
}
//Check