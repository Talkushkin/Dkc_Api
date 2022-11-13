package tests.web;

import org.junit.jupiter.api.Test;
import tests.TestBase;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static model.Endpoints.*;

public class ServicesTest extends TestBase {
    @Test
    void check200StatusServices() {

        given()
                .auth().basic(basicEmail, basicPassword)
                .log().uri()
                .get(baseURI + servicesUrl)
                .then()
                .statusCode(200)
                .log().status();
    }
}
