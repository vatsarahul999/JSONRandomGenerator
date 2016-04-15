package cm.JSONMaker.models;

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
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "cartAdditions",
    "carts"
})
public class Events {

    @JsonProperty("cartAdditions")
    private List<CartAddition> cartAdditions = new ArrayList<CartAddition>();
    @JsonProperty("carts")
    private List<Cart> carts = new ArrayList<Cart>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Events() {
    }

    /**
     * 
     * @param carts
     * @param cartAdditions
     */
    public Events(List<CartAddition> cartAdditions, List<Cart> carts) {
        this.cartAdditions = cartAdditions;
        this.carts = carts;
    }

    /**
     * 
     * @return
     *     The cartAdditions
     */
    @JsonProperty("cartAdditions")
    public List<CartAddition> getCartAdditions() {
        return cartAdditions;
    }

    /**
     * 
     * @param cartAdditions
     *     The cartAdditions
     */
    @JsonProperty("cartAdditions")
    public void setCartAdditions(List<CartAddition> cartAdditions) {
        this.cartAdditions = cartAdditions;
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

}
