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
    "count",
    "exponent",
    "unique"
})
public class Cart implements Cloneable{

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("exponent")
    private Integer exponent;
    @JsonProperty("unique")
    private String unique;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cart() {
    	super();
    }

    /**
     * 
     * @param unique
     * @param count
     * @param exponent
     */
    public Cart(Integer count, Integer exponent, String unique) {
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
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The exponent
     */
    @JsonProperty("exponent")
    public Integer getExponent() {
        return exponent;
    }

    /**
     * 
     * @param exponent
     *     The exponent
     */
    @JsonProperty("exponent")
    public void setExponent(Integer exponent) {
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(exponent).append(unique).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cart) == false) {
            return false;
        }
        Cart rhs = ((Cart) other);
        return new EqualsBuilder().append(count, rhs.count).append(exponent, rhs.exponent).append(unique, rhs.unique).append(additionalProperties, rhs.additionalProperties).isEquals();
    }
    public Object clone(){  
        try{  
            return super.clone();  
        }catch(Exception e){ 
            return null; 
        }
    }

}