package model;


import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static org.hamcrest.Matchers.containsString;


public class Specs  {

    public static final String basicEmail = "extyl";
    public static final String basicPassword = "extyl";
    public static final String baseUrl = "https://reqres.in";

    public static RequestSpecification request = with()
            .baseUri(baseUrl)
            .auth().basic(basicEmail, basicPassword)
      //      .basePath("/login=yes")
            .log().uri()
            .log().body()
            .contentType(ContentType.JSON);

    public static ResponseSpecification responseSpecStatus200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
         //  .expectBody(containsString("success"))
            .build();

    public static ResponseSpecification responseSpecStatus500 = new ResponseSpecBuilder()
            .expectStatusCode(500)
            .build();

    public static ResponseSpecification responseSpecStatus404 = new ResponseSpecBuilder()
            .expectStatusCode(404)
            .build();

    public static ResponseSpecification responseSpecStatus502 = new ResponseSpecBuilder()
            .expectStatusCode(502)
            .build();

    public static ResponseSpecification responseSpecStatus503 = new ResponseSpecBuilder()
            .expectStatusCode(503)
            .build();

    public static ResponseSpecification responseSpecStatus400 = new ResponseSpecBuilder()
            .expectStatusCode(400)
            .build();
}

