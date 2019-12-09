
package com.Scramble.backend.Models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "reviews"
})
public class AllReviews implements Serializable
{

    @JsonProperty("reviews")
    @Valid
    private List<Object> reviews = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2289568315825540017L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AllReviews() {
    }

    /**
     * 
     * @param reviews
     */
    public AllReviews(List<Object> reviews) {
        super();
        this.reviews = reviews;
    }

    @JsonProperty("reviews")
    public List<Object> getReviews() {
        return reviews;
    }

    @JsonProperty("reviews")
    public void setReviews(List<Object> reviews) {
        this.reviews = reviews;
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
        return new HashCodeBuilder().append(reviews).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllReviews) == false) {
            return false;
        }
        AllReviews rhs = ((AllReviews) other);
        return new EqualsBuilder().append(reviews, rhs.reviews).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
