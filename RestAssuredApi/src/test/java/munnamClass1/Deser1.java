package munnamClass1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Deser1 {

    @JsonProperty("post code")
    public String postcode;
    public String country;
    @JsonProperty("country abbreviation")
    public String countryabbreviation;
    public List<Deser2> places;

    //make construtor for objects names
    public Deser1(String postcode, String country, String countryabbreviation, List<Deser2> places) {
        this.postcode = postcode;
        this.country = country;
        this.countryabbreviation = countryabbreviation;
        this.places = places;
    }

}
