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
    "count",
    "exponent",
    "unique"
})
public class Cart {

    @JsonProperty("count")
    private Long count;
    @JsonProperty("exponent")
    private Long exponent;
    @JsonProperty("unique")
    private String unique;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cart() {
    }

    /**
     * 
     * @param unique
     * @param count
     * @param exponent
     */
    public Cart(Long count, Long exponent, String unique) {
        this.count = count;
        this.exponent = exponent;
        this.unique = unique;
    }

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The exponent
     */
    @JsonProperty("exponent")
    public Long getExponent() {
        return exponent;
    }

    /**
     * 
     * @param exponent
     *     The exponent
     */
    @JsonProperty("exponent")
    public void setExponent(Long exponent) {
        this.exponent = exponent;
    }

    /**
     * 
     * @return
     *     The unique
     */
    @JsonProperty("unique")
    public String getUnique() {
        return unique;
    }

    /**
     * 
     * @param unique
     *     The unique
     */
    @JsonProperty("unique")
    public void setUnique(String unique) {
        this.unique = unique;
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
