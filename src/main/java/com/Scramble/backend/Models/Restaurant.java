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
    "restaurant"
})
public class Restaurant implements Serializable
{

    @JsonProperty("restaurant")
    @Valid
    private Restaurant_ restaurant;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -12572269412027835L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Restaurant() {
    }

    /**
     * 
     * @param restaurant
     */
    public Restaurant(Restaurant_ restaurant) {
        super();
        this.restaurant = restaurant;
    }

    @JsonProperty("restaurant")
    public Restaurant_ getRestaurant() {
        return restaurant;
    }

    @JsonProperty("restaurant")
    public void setRestaurant(Restaurant_ restaurant) {
        this.restaurant = restaurant;
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
        return new HashCodeBuilder().append(restaurant).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restaurant) == false) {
            return false;
        }
        Restaurant rhs = ((Restaurant) other);
        return new EqualsBuilder().append(restaurant, rhs.restaurant).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
