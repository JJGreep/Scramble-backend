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
    "results_found",
    "results_start",
    "results_shown",
    "restaurants"
})
public class Search implements Serializable
{

    @JsonProperty("results_found")
    private Integer resultsFound;
    @JsonProperty("results_start")
    private Integer resultsStart;
    @JsonProperty("results_shown")
    private Integer resultsShown;
    @JsonProperty("restaurants")
    @Valid
    private List<Restaurant> restaurants = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5760821028995973701L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Search() {
    }

    /**
     * 
     * @param resultsFound
     * @param resultsShown
     * @param restaurants
     * @param resultsStart
     */
    public Search(Integer resultsFound, Integer resultsStart, Integer resultsShown, List<Restaurant> restaurants) {
        super();
        this.resultsFound = resultsFound;
        this.resultsStart = resultsStart;
        this.resultsShown = resultsShown;
        this.restaurants = restaurants;
    }

    public Search(int resultsFound, int resultsStart, int resultsShown, List<Restaurant_> restaurants) {
    }

    @JsonProperty("results_found")
    public Integer getResultsFound() {
        return resultsFound;
    }

    @JsonProperty("results_found")
    public void setResultsFound(Integer resultsFound) {
        this.resultsFound = resultsFound;
    }

    @JsonProperty("results_start")
    public Integer getResultsStart() {
        return resultsStart;
    }

    @JsonProperty("results_start")
    public void setResultsStart(Integer resultsStart) {
        this.resultsStart = resultsStart;
    }

    @JsonProperty("results_shown")
    public Integer getResultsShown() {
        return resultsShown;
    }

    @JsonProperty("results_shown")
    public void setResultsShown(Integer resultsShown) {
        this.resultsShown = resultsShown;
    }

    @JsonProperty("restaurants")
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    @JsonProperty("restaurants")
    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
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
        return new HashCodeBuilder().append(restaurants).append(additionalProperties).append(resultsFound).append(resultsStart).append(resultsShown).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Search) == false) {
            return false;
        }
        Search rhs = ((Search) other);
        return new EqualsBuilder().append(restaurants, rhs.restaurants).append(additionalProperties, rhs.additionalProperties).append(resultsFound, rhs.resultsFound).append(resultsStart, rhs.resultsStart).append(resultsShown, rhs.resultsShown).isEquals();
    }

}
