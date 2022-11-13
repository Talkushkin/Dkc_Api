package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void SetUp() {
        RestAssured.baseURI = "https://preprod.dkc.ru";
    }
}
