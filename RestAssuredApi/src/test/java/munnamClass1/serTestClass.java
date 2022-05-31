package munnamClass1;

import PojoSereliaztion.Bookingdates;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class serTestClass {

    @Test
    public void Serialization() {
        Bookingdates book = new Bookingdates("2021-10-03", "2021-10-09");
        Ser1 serialization1 = new Ser1("Hassan", "Iqbal", 111, "289000", book, "1000");


        given().body(serialization1).contentType(ContentType.JSON).when().post("https://restful-booker.herokuapp.com/booking").then().log().all();


    }

}
