import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Resuablility {

    private static RequestSpecification request;

    @BeforeClass
    public static void createSpecification() {
        request = new RequestSpecBuilder()
                //.setBaseUri("http://api.zippopotam.us")
                .build();
    }
    @Test
    public void UseCreatedSpecification() {
        given().
                spec(request).
                when().
               // get("us/90210").
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().statusCode(200).
                body("places[0].'place name'", equalTo("Beverly Hills"));
    }
    @Test
    public void useExtractMethod()
    {
        String placename =
        given().spec(request)
                .when()
                .get("http://zippopotam.us/us/90210")
                .then()
                .extract()
                .path("places[0].'place name'");

        Assert.assertEquals(placename, "Beverly Hills");
    }
}


