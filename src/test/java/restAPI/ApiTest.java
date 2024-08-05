package restAPI;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

	public class ApiTest {

		/*
		 * public static void main(String[] args) { RestAssured.baseURI =
		 * "https://jsonplaceholder.typicode.com";
		 * 
		 * given() .when() .get("/posts/1") .then() .statusCode(200) .body("userId",
		 * equalTo(1)) .body("id", equalTo(1)) .body("title", notNullValue()); }
		 */

		    @Test
		    public void testGetEndpoint() {
		        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		        given()
		        .when()
		            .get("/posts/1")
		        .then()
		            .statusCode(200)
		            .body("userId", equalTo(1))
		            .body("id", equalTo(1))
		            .body("title", notNullValue());
		    }
		}




