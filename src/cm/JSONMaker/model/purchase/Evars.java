package cm.JSONMaker.model.purchase;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "evars"
})
public class Evars implements Cloneable {

    @JsonProperty("evars")
    private Evars_ evars;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Evars() {
    	super();
    }

    /**
     * 
     * @param evars
     */
    public Evars(Evars_ evars) {
        this.evars = evars;
    }

    /**
     * 
     * @return
     *     The evars
     */
    @JsonProperty("evars")
    public Evars_ getEvars() {
        return evars;
    }

    /**
     * 
     * @param evars
     *     The evars
     */
    @JsonProperty("evars")
    public void setEvars(Evars_ evars) {
        this.evars = evars;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
        return new HashCodeBuilder().append(evars).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Evars) == false) {
            return false;
        }
        Evars rhs = ((Evars) other);
        return new EqualsBuilder().append(evars, rhs.evars).append(additionalProperties, rhs.additionalProperties).isEquals();
    }
    public Object clone(){
    	try{
    		return super.clone();
    	}
    	catch (Exception e){
    		return null;
    	}
    }

}