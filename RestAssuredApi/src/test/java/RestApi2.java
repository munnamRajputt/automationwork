import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RestApi2 {

    @Test
    public void callApi(){
//        given().
//                when().
//                get("http://zippopotam.us/us/90210").
//                then().
//                assertThat().
//                log().all().
//                body("places[0].'place name'", equalTo("Beverly Hills"));
                given().
                when().get("http://zippopotam.us/us/90210").
                then().assertThat().log().all().
                        statusCode(200).
                        contentType(ContentType.JSON).
                        contentType("application/json").
                body("places[0].'place name'", equalTo("Beverly Hills"));
    }
 @Test
    public void hamercrest()
    {
        given().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().
                body("places[0].state", equalTo("California")).
                log().all().
                body("places.'place name'", hasItem("Beverly Hills")).
                body("places.state", hasSize(1)).
                body("places.'place name'", not(equalTo("Beverly")));
    }
}
