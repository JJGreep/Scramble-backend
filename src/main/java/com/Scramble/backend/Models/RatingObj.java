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
    "title",
    "bg_color"
})
public class RatingObj implements Serializable
{

    @JsonProperty("title")
    @Valid
    private Title title;
    @JsonProperty("bg_color")
    @Valid
    private BgColor bgColor;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8332879949121991284L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RatingObj() {
    }

    /**
     * 
     * @param bgColor
     * @param title
     */
    public RatingObj(Title title, BgColor bgColor) {
        super();
        this.title = title;
        this.bgColor = bgColor;
    }

    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("bg_color")
    public BgColor getBgColor() {
        return bgColor;
    }

    @JsonProperty("bg_color")
    public void setBgColor(BgColor bgColor) {
        this.bgColor = bgColor;
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
        return new HashCodeBuilder().append(additionalProperties).append(title).append(bgColor).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RatingObj) == false) {
            return false;
        }
        RatingObj rhs = ((RatingObj) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(title, rhs.title).append(bgColor, rhs.bgColor).isEquals();
    }

}
