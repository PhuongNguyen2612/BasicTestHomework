package com.phuong.homework.restAssured44;

import com.phuong.homework.test.restassured.RestAssuredBaseTest;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class RestAssuredTest extends RestAssuredBaseTest {

    @Test
    public void testLocationByName() {
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "Ho_Chi_Minh");

        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("Ho Chi Minh City"));
    }

    @Test
    public void testLocationByName1(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "Ho Chi");

        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("Ho Chi Minh City"));
    }

    @Test
    public void testLocationByName2(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "HO CHI MINH");

        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("Ho Chi Minh City"));
    }

    @Test
    public void testLocationByName3(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "Ho Chi");
        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("Ho Chi Minh City"));
    }

    @Test
    public void TestLocationByIP(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "100.0.0.1");
        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("Tewksbury"));
    }

    @Test
    public void TestLocationByZip(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "10001");
        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("New York"));
    }

    @Test
    public void TestLocationByPostCode(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "SW1");
        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("location.name", Matchers.equalTo("Westminster"));
    }

    @Test
    public void TestLocationByMetar(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "metar:EGLL");
        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("location.country", Matchers.equalTo("United Kingdom"));
    }

    @Test
    public void testLocationNameNotMatching() {
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709")
                .addParam("q", "HoChiMinh");

        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().log().all().body("error.message", Matchers.equalTo("No matching location found."));
    }

    @Test
    public void testMissingLocationParam(){
        String baseUrl = "http://api.weatherapi.com/v1";
        RequestSpecBuilder spec = new RequestSpecBuilder();
        spec.setBaseUri(baseUrl)
                .addParam("key", "29bebb4c6e3844ffafe115519210709");

        Response rp = RestAssured.given(spec.build()).get("/current.json");

        rp.then().assertThat().log().all().body("error.message", Matchers.equalTo("Parameter q is missing."));
    }

}