import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import PojoSereliaztion.Bookingdates;
import pojoDeserelization.Root;
import PojoSereliaztion.Serialization;

import static io.restassured.RestAssured.given;

public class RestApi {

    @Test(enabled=true)
    public void callApiDeserailize(){
//        given().when().then().assertThat().body()

//               , body();

       Root root =  given().
                when().
                get("http://zippopotam.us/us/90210").
                as(Root.class);

       System.out.println(root.places.get(0).latitude);

        Assert.assertEquals(1,
                root.places.size());






//                then().
//                assertThat().
//              //  body("places[0].'state'", equalTo("California"));
//        assert ("places.'place name'", hasSize(1)).
//
//        //  statusCode(200).
//                log().all();
               // body("places[0].'place name'", equalTo("Beverly Hills"));
    }

    @Test
    public void serializationApi(){

        Bookingdates bookingdates = new Bookingdates("2018-01-01","2019-01-01");
        Serialization serialization = new Serialization("Jim","Brown",111,true,bookingdates,"Breakfast");
        given().contentType(ContentType.JSON).body(serialization).when().post("https://restful-booker.herokuapp.com/booking").then().log().all();
    }
}