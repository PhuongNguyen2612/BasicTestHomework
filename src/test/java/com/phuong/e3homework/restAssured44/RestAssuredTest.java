package com.phuong.e3homework.restAssured44;

import com.phuong.e3homework.BaseTest;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class RestAssuredTest extends RestAssuredBaseTest{

    @Test
    public void testingRestAssuredSimpleEndpointVerification() {
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "Lviv")
                .addParam("days", "1");

        Response rp = RestAssured.given(spec.build()).get("/current.json");

        LOGGER.info("Messages....");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("Lviv"));

    }

    @Test
    public void testDay(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "Lviv")
                .addParam("days", "-1");

        Response rp = RestAssured.given(spec.build()).get("/current.json");

        LOGGER.info("Messages ..... ");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("Lviv"));

    }
}
