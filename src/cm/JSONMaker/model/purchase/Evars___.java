
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
    "eVar16"
})
public class Evars___ {

    @JsonProperty("eVar16")
    private String eVar16;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Evars___() {
    	super();
    }

    /**
     * 
     * @param eVar16
     */
    public Evars___(String eVar16) {
        this.eVar16 = eVar16;
    }

    /**
     * 
     * @return
     *     The eVar16
     */
    @JsonProperty("eVar16")
    public String getEVar16() {
        return eVar16;
    }

    /**
     * 
     * @param eVar16
     *     The eVar16
     */
    @JsonProperty("eVar16")
    public void setEVar16(String eVar16) {
        this.eVar16 = eVar16;
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
        return new HashCodeBuilder().append(eVar16).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Evars___) == false) {
            return false;
        }
        Evars___ rhs = ((Evars___) other);
        return new EqualsBuilder().append(eVar16, rhs.eVar16).append(additionalProperties, rhs.additionalProperties).isEquals();
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
