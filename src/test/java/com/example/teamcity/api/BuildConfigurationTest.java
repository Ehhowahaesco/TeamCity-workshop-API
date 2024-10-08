package com.example.teamcity.api;

import com.example.teamcity.api.models.*;
import com.example.teamcity.api.spec.*;
import org.apache.http.HttpStatus;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class BuildConfigurationTest extends BaseApiTest{
//    @Test
//    public void buildConfigurationTest(){
//        var token = RestAssured.get("http://admin:admin@localhost:8111/authenticationTest.html?crsf")
//                .then().assertThat().statusCode(HttpStatus.SC_OK)
//                .extract().asString();
//        System.out.println("aaaaaaaaaaaaa" + token);
//    }

    @Test
    public void buildConfigurationTest(){
        var user = User.builder()
                .username("admin")
                .password("admin")
                .build();

        var token = RestAssured
                .given()
                .spec(Specifications.getSpec().authSpec(user))
                .get("/authenticationTest.html?crsf")
                .then().assertThat().statusCode(HttpStatus.SC_OK)
                .extract().asString();

        System.out.println(token);
    }
}
