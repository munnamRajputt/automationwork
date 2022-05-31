import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class XMLResponse {

    @Test
    public void XMLClasResp() {
        given().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().
                //log().all().
                body("response.places[0].place.'place name'", equalTo("Beverly Hills"));
    }
@Test
public void SecondClass()
{
    given().
            when().
            get("http://zippopotam.us/us/90210").
            then().
            assertThat().
            log().all().
            body("places[0].'place name'", equalTo("Beverly Hills"));
}
}