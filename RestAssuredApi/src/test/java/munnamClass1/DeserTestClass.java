package munnamClass1;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeserTestClass {

    //("Jim","Brown",111,true,bookingdates,"Breakfast")
    @Test
    public void serialization()
    {
        given().when().get("https://restful-booker.herokuapp.com/booking").then().log().all();
    }
}
