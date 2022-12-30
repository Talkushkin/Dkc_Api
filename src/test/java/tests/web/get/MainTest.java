package tests.web.get;


import io.qameta.allure.Severity;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.restassured.RestAssured.given;
import static model.Specs.*;


public class MainTest extends TestBase {

    @Test
    @Tag("MainTestStatus200")
    @Severity(CRITICAL)
    void checkMainStatusWith200() {

        // @formatter:off
        given()
                .spec(request)
                .when()
                .get("/")
                .then()
                .spec(responseSpecStatus200);
        // @formatter:on
    }

    @Test
    @Tag("MainTest")
    @Severity(CRITICAL)
    void checkMainStatusWith404() {
        given()
                .spec(request)
                .when()
                .get("/")
                .then()
                .spec(responseSpecStatus404)
                .log().body();
    }

    @Test
    @Tag("MainTest")
    @Severity(CRITICAL)
    void checkMainStatusWith500() {
        given()
                .spec(request)
                .when()
                .get("/")
                .then()
                .spec(responseSpecStatus500)
                .log().body();
    }

    @Test
    @Tag("MainTest")
    @Severity(CRITICAL)
    void checkMainStatusWith502() {
        given()
                .spec(request)
                .when()
                .get("/")
                .then()
                .spec(responseSpecStatus502)
                .log().body();
    }

    @Test
    @Tag("MainTest")
    @Severity(CRITICAL)
    void checkMainStatusWith503() {
        given()
                .spec(request)
                .when()
                .get("/")
                .then()
                .spec(responseSpecStatus503)
                .log().body();
    }
}