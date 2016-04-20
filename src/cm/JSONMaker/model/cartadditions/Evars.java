package cm.JSONMaker.model.cartadditions;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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

}
	