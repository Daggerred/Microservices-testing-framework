package com.example.tests.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserApiTest {

    @Test
    public void testGetUsers() {
        Response response = RestAssured.get("http://localhost:8080/users");
        response.then().statusCode(200);
        // Add more validation code here
    }
}
