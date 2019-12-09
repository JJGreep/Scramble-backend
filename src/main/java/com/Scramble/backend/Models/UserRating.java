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
    "aggregate_rating",
    "rating_text",
    "rating_color",
    "rating_obj",
    "votes"
})
public class UserRating implements Serializable
{

    @JsonProperty("aggregate_rating")
    private Double aggregateRating;
    @JsonProperty("rating_text")
    private String ratingText;
    @JsonProperty("rating_color")
    private String ratingColor;
    @JsonProperty("rating_obj")
    @Valid
    private RatingObj ratingObj;
    @JsonProperty("votes")
    private Integer votes;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5180852175881167359L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserRating() {
    }

    /**
     * 
     * @param ratingObj
     * @param ratingColor
     * @param votes
     * @param ratingText
     * @param aggregateRating
     */
    public UserRating(Double aggregateRating, String ratingText, String ratingColor, RatingObj ratingObj, Integer votes) {
        super();
        this.aggregateRating = aggregateRating;
        this.ratingText = ratingText;
        this.ratingColor = ratingColor;
        this.ratingObj = ratingObj;
        this.votes = votes;
    }

    @JsonProperty("aggregate_rating")
    public Double getAggregateRating() {
        return aggregateRating;
    }

    @JsonProperty("aggregate_rating")
    public void setAggregateRating(Double aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    @JsonProperty("rating_text")
    public String getRatingText() {
        return ratingText;
    }

    @JsonProperty("rating_text")
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    @JsonProperty("rating_color")
    public String getRatingColor() {
        return ratingColor;
    }

    @JsonProperty("rating_color")
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    @JsonProperty("rating_obj")
    public RatingObj getRatingObj() {
        return ratingObj;
    }

    @JsonProperty("rating_obj")
    public void setRatingObj(RatingObj ratingObj) {
        this.ratingObj = ratingObj;
    }

    @JsonProperty("votes")
    public Integer getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Integer votes) {
        this.votes = votes;
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
        return new HashCodeBuilder().append(ratingObj).append(ratingColor).append(votes).append(ratingText).append(additionalProperties).append(aggregateRating).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserRating) == false) {
            return false;
        }
        UserRating rhs = ((UserRating) other);
        return new EqualsBuilder().append(ratingObj, rhs.ratingObj).append(ratingColor, rhs.ratingColor).append(votes, rhs.votes).append(ratingText, rhs.ratingText).append(additionalProperties, rhs.additionalProperties).append(aggregateRating, rhs.aggregateRating).isEquals();
    }

}
