package model;


import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;


public class Specs  {


    public static final String baseUrl = "https://preprod.dkc.ru";

    public static RequestSpecification request = with()
            .baseUri(baseUrl)
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

