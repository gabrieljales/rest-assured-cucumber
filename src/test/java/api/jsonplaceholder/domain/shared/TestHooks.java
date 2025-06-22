package api.jsonplaceholder.domain.shared;

import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class TestHooks {
    @Before
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
