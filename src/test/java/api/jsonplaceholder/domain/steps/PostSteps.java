package api.jsonplaceholder.domain.steps;

import api.jsonplaceholder.domain.models.Post;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostSteps {

    public Response createPost(Post post, String endPoint) {
        return given()
                    .contentType("application/json")
                    .body(post)
                .when()
                    .post(endPoint)
                .then()
                    .extract()
                    .response();

    }
}
