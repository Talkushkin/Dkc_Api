package tests.web;

import org.junit.jupiter.api.Test;
import tests.TestBase;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static model.Endpoints.*;

public class CartTest extends TestBase {
    @Test
    void check200StatusCart() {

        given()
                .auth().basic(basicEmail, basicPassword)
                .log().uri()
                .get(baseURI + cartUrl)
                .then()
                .statusCode(200)
                .log().status();
    }

}
