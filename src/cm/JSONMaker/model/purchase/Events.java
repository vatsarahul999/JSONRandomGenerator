
package cm.JSONMaker.model.purchase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "purchase",
    "carts"
})
public class Events implements Cloneable{

    @JsonProperty("purchase")
    private List<Purchase> purchase = new ArrayList<Purchase>();
    @JsonProperty("carts")
    private List<Cart> carts = new ArrayList<Cart>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Events() {
    	super();
    }

    /**
     * 
     * @param carts
     * @param purchase
     */
    public Events(List<Purchase> purchase, List<Cart> carts) {
        this.purchase = purchase;
        this.carts = carts;
    }

    /**
     * 
     * @return
     *     The purchase
     */
    @JsonProperty("purchase")
    public List<Purchase> getPurchase() {
        return purchase;
    }

    /**
     * 
     * @param purchase
     *     The purchase
     */
    @JsonProperty("purchase")
    public void setPurchase(List<Purchase> purchase) {
        this.purchase = purchase;
    }

    /**
     * 
     * @return
     *     The carts
     */
    @JsonProperty("carts")
    public List<Cart> getCarts() {
        return carts;
    }

    /**
     * 
     * @param carts
     *     The carts
     */
    @JsonProperty("carts")
    public void setCarts(List<Cart> carts) {
        this.carts = carts;
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
        return new HashCodeBuilder().append(purchase).append(carts).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Events) == false) {
            return false;
        }
        Events rhs = ((Events) other);
        return new EqualsBuilder().append(purchase, rhs.purchase).append(carts, rhs.carts).append(additionalProperties, rhs.additionalProperties).isEquals();
    }
    public Object clone(){
    	try{
    		return super.clone();
    	}
    	catch(Exception e){
    		return null;
    	}
    }

}
