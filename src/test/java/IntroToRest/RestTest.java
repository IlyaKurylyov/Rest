package IntroToRest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;


public class RestTest {

    @Test
    public void GetOrder(){
        given()
                .accept("*/*")
        .when()
                .get("http://51.250.6.164:8080/test-orders/{id}",1)
                .then()
                .statusCode(200)
                .body("status",equalTo("OPEN"),
                        "courierId",equalTo(null));
    }
}
