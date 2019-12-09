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
    "has_menu_status",
    "res_id"
})
public class R implements Serializable
{

    @JsonProperty("has_menu_status")
    @Valid
    private HasMenuStatus hasMenuStatus;
    @JsonProperty("res_id")
    private Integer resId;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7117993748489450287L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public R() {
    }

    /**
     * 
     * @param hasMenuStatus
     * @param resId
     */
    public R(HasMenuStatus hasMenuStatus, Integer resId) {
        super();
        this.hasMenuStatus = hasMenuStatus;
        this.resId = resId;
    }

    @JsonProperty("has_menu_status")
    public HasMenuStatus getHasMenuStatus() {
        return hasMenuStatus;
    }

    @JsonProperty("has_menu_status")
    public void setHasMenuStatus(HasMenuStatus hasMenuStatus) {
        this.hasMenuStatus = hasMenuStatus;
    }

    @JsonProperty("res_id")
    public Integer getResId() {
        return resId;
    }

    @JsonProperty("res_id")
    public void setResId(Integer resId) {
        this.resId = resId;
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
        return new HashCodeBuilder().append(hasMenuStatus).append(additionalProperties).append(resId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof R) == false) {
            return false;
        }
        R rhs = ((R) other);
        return new EqualsBuilder().append(hasMenuStatus, rhs.hasMenuStatus).append(additionalProperties, rhs.additionalProperties).append(resId, rhs.resId).isEquals();
    }

}
