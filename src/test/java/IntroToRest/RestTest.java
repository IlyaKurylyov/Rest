package IntroToRest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;


public class RestTest {



    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10})
    public void parameter(int id){

        given()
                .accept("*/*")
        .when()
                .get("http://51.250.6.164:8080/test-orders/{id}",id)
                .then()
                .statusCode(200)
                .body("status",equalTo("OPEN"),
                        "courierId",equalTo(null));
    }
}
