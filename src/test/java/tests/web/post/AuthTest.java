package tests.web.post;

import io.qameta.allure.Severity;
import lombok.AuthRequest;
import lombok.AuthResponse;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.restassured.RestAssured.given;
import static model.Specs.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthTest {

    String loginUrl = "/api/login",
            email = "eve.holt@reqres.in",
            password = "cityslicka",
            token = "QpwL5tke4Pnpja7X4",
            error = "user not found";

    @Test
    @Tag("AuthTest")
    @Severity(CRITICAL)
    void checkAuthStatusWith200() {

        // @formatter:off
        AuthRequest authRequest = new AuthRequest(email, password);
        AuthResponse authResponse = given()
                .spec(request)
                .body(authRequest)
                .when()
                .post(loginUrl)
                .then()
                .spec(responseSpecStatus200)
                .extract().as(AuthResponse.class);
        assertEquals(token, authResponse.getToken());
        // @formatter:on
    }

    @Test
    @Tag("AuthTest")
    @Severity(CRITICAL)
    void checkAuthStatusWith400() {

        // @formatter:off
        AuthRequest authRequest = new AuthRequest(email, password);
        AuthResponse authResponse = given()
                .spec(request)
                .body(authRequest)
                .when()
                .post(loginUrl)
                .then()
                .spec(responseSpecStatus400)
                .extract().as(AuthResponse.class);
        assertEquals(error,authResponse.getError());
        // @formatter:on
    }

}
