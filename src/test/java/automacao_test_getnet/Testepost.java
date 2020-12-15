package automacao_test_getnet;

import static org.junit.Assert.*;

import org.junit.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;


public class Testepost {     

        private Object ok;

		@Test
        public void TestePost() {
        	String baseURI = "https://reqres.in/api/login";
        	String myJson = "{\"email\":\"eve.holt@reqres.in\",\"password\": \"cityslicka\"}";

        	given().
        		contentType(ContentType.JSON).
        		body(myJson).
        	when().
        		post(baseURI).
        	then().
        		statusCode(200).
        		body("token",
        		containsString("QpwL5tke4Pnpja7X4"));
        	}

		private Object containsString(String string) {
			
			return ok;
		}
}