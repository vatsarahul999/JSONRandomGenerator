
package cm.JSONMaker.models;

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

}
