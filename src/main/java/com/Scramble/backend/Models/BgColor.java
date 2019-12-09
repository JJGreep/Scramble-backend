
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
    "type",
    "tint"
})
public class BgColor implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("tint")
    private String tint;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7384962830438418244L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BgColor() {
    }

    /**
     * 
     * @param type
     * @param tint
     */
    public BgColor(String type, String tint) {
        super();
        this.type = type;
        this.tint = tint;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("tint")
    public String getTint() {
        return tint;
    }

    @JsonProperty("tint")
    public void setTint(String tint) {
        this.tint = tint;
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
        return new HashCodeBuilder().append(additionalProperties).append(type).append(tint).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BgColor) == false) {
            return false;
        }
        BgColor rhs = ((BgColor) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(tint, rhs.tint).isEquals();
    }

}
