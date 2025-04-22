import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ApiTest {

    @Test
    public void testGetPostById() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");

        // Status Code = 200
        assertEquals(response.getStatusCode(), 200);

        // Verifică prezența unor câmpuri în body
        String body = response.getBody().asString();
        assertTrue(body.contains("userId"));
        assertTrue(body.contains("title"));
        assertTrue(body.contains("body"));
    }

        @Test
        public void testCreatePost() {
        String requestBody = "{\n" +
                "  \"title\": \"QA Test Title\",\n" +
                "  \"body\": \"This is a test post created by RestAssured\",\n" +
                "  \"userId\": 123\n" +
                "}";

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts");

        assertEquals(response.getStatusCode(), 201);

        String responseBody = response.getBody().asString();
        assertTrue(responseBody.contains("QA Test Title"));
        assertTrue(responseBody.contains("123"));
    }
}


