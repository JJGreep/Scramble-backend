
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
    "delivery",
    "takeaway"
})
public class HasMenuStatus implements Serializable
{

    @JsonProperty("delivery")
    private Integer delivery;
    @JsonProperty("takeaway")
    private Integer takeaway;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8779945592045477200L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HasMenuStatus() {
    }

    /**
     * 
     * @param delivery
     * @param takeaway
     */
    public HasMenuStatus(Integer delivery, Integer takeaway) {
        super();
        this.delivery = delivery;
        this.takeaway = takeaway;
    }

    @JsonProperty("delivery")
    public Integer getDelivery() {
        return delivery;
    }

    @JsonProperty("delivery")
    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    @JsonProperty("takeaway")
    public Integer getTakeaway() {
        return takeaway;
    }

    @JsonProperty("takeaway")
    public void setTakeaway(Integer takeaway) {
        this.takeaway = takeaway;
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
        return new HashCodeBuilder().append(delivery).append(additionalProperties).append(takeaway).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HasMenuStatus) == false) {
            return false;
        }
        HasMenuStatus rhs = ((HasMenuStatus) other);
        return new EqualsBuilder().append(delivery, rhs.delivery).append(additionalProperties, rhs.additionalProperties).append(takeaway, rhs.takeaway).isEquals();
    }

}
