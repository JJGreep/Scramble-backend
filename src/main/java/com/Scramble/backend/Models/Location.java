package com.Scramble.backend.Models;



import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "locality",
    "city",
    "city_id",
    "latitude",
    "longitude",
    "zipcode",
    "country_id",
    "locality_verbose"
})
public class Location implements Serializable
{

    @JsonProperty("address")
    private String address;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("city")
    private String city;
    @JsonProperty("city_id")
    private Integer cityId;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("country_id")
    private Integer countryId;
    @JsonProperty("locality_verbose")
    private String localityVerbose;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4314026726854708301L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param zipcode
     * @param address
     * @param city
     * @param latitude
     * @param locality
     * @param localityVerbose
     * @param cityId
     * @param countryId
     * @param longitude
     */
    public Location(String address, String locality, String city, Integer cityId, String latitude, String longitude, String zipcode, Integer countryId, String localityVerbose) {
        super();
        this.address = address;
        this.locality = locality;
        this.city = city;
        this.cityId = cityId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zipcode = zipcode;
        this.countryId = countryId;
        this.localityVerbose = localityVerbose;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("city_id")
    public Integer getCityId() {
        return cityId;
    }

    @JsonProperty("city_id")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @JsonProperty("country_id")
    public Integer getCountryId() {
        return countryId;
    }

    @JsonProperty("country_id")
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("locality_verbose")
    public String getLocalityVerbose() {
        return localityVerbose;
    }

    @JsonProperty("locality_verbose")
    public void setLocalityVerbose(String localityVerbose) {
        this.localityVerbose = localityVerbose;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(zipcode).append(address).append(city).append(latitude).append(locality).append(localityVerbose).append(cityId).append(additionalProperties).append(countryId).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(zipcode, rhs.zipcode).append(address, rhs.address).append(city, rhs.city).append(latitude, rhs.latitude).append(locality, rhs.locality).append(localityVerbose, rhs.localityVerbose).append(cityId, rhs.cityId).append(additionalProperties, rhs.additionalProperties).append(countryId, rhs.countryId).append(longitude, rhs.longitude).isEquals();
    }

}
