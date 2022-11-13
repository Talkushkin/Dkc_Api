package tests.web;


import org.junit.jupiter.api.Test;
import tests.TestBase;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import static model.Endpoints.*;

public class AuthTest extends TestBase {

    @Test
    void check200StatusWithAuthBasic() {

        given()
                .auth().basic(basicEmail, basicPassword)
                .log().uri()
                .get(baseURI)
                .then()
                .statusCode(200)
                .log().status();
    }
}
