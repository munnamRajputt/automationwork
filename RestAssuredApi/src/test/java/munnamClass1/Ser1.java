package munnamClass1;

import PojoSereliaztion.Bookingdates;

public class Ser1 {
    //("Jim","Brown",111,true,bookingdates,"Breakfast")

    public String firstname;
    public String lastname;
    public int totalprice;
    public String depositpaid;
    public Bookingdates bookingdates;
    public String additionalneeds;

    public Ser1(String firstname, String lastname, int totalprice, String depositpaid, Bookingdates bookingdates, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }
}
