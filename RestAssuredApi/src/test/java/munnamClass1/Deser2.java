package munnamClass1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deser2 {

    @JsonProperty("place name")
    public String placename;
    public String longitude;
    public String state;
    @JsonProperty("state abbreviation")
    public String stateabbreviation;
    public String latitude;

    public Deser2(String placename, String longitude, String state, String stateabbreviation, String latitude) {
        this.placename = placename;
        this.longitude = longitude;
        this.state = state;
        this.stateabbreviation = stateabbreviation;
        this.latitude = latitude;
    }
}
