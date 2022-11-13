package tests.web;

import org.junit.jupiter.api.Test;
import tests.TestBase;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static model.Endpoints.*;

public class CatalogTest extends TestBase {

    @Test
    void check200StatusCatalog() {

        given()
                .auth().basic(basicEmail, basicPassword)
                .log().uri()
                .get(baseURI + catalogUrl)
                .then()
                .statusCode(200)
                .log().status();
    }
}
