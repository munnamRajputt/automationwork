package pojoDeserelization;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {

    @JsonProperty("post code")
    public String postCode;
    public String country;
    @JsonProperty("country abbreviation")
    public String countryAbbreviation;
    public List<Places> places;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }

    public List<Places> getPlaces() {
        return places;
    }

    public void setPlaces(List<Places> places) {
        this.places = places;
    }
}
