
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
    "name",
    "category",
    "units",
    "revenue",
    "evars"
})
public class Product implements Cloneable  {

    @JsonProperty("name")
    private String name;
    @JsonProperty("category")
    private String category;
    @JsonProperty("units")
    private Integer units;
    @JsonProperty("revenue")
    private Double revenue;
    @JsonProperty("evars")
    private Evars__ evars;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    super();
    }

    /**
     * 
     * @param category
     * @param name
     * @param evars
     * @param units
     * @param revenue
     */
    public Product(String name, String category, Integer units, Double revenue, Evars__ evars) {
        this.name = name;
        this.category = category;
        this.units = units;
        this.revenue = revenue;
        this.evars = evars;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The category
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The units
     */
    @JsonProperty("units")
    public Integer getUnits() {
        return units;
    }

    /**
     * 
     * @param units
     *     The units
     */
    @JsonProperty("units")
    public void setUnits(Integer units) {
        this.units = units;
    }

    /**
     * 
     * @return
     *     The revenue
     */
    @JsonProperty("revenue")
    public Double getRevenue() {
        return revenue;
    }

    /**
     * 
     * @param revenue
     *     The revenue
     */
    @JsonProperty("revenue")
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    /**
     * 
     * @return
     *     The evars
     */
    @JsonProperty("evars")
    public Evars__ getEvars() {
        return evars;
    }

    /**
     * 
     * @param evars
     *     The evars
     */
    @JsonProperty("evars")
    public void setEvars(Evars__ evars) {
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
        return new HashCodeBuilder().append(name).append(category).append(units).append(revenue).append(evars).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return new EqualsBuilder().append(name, rhs.name).append(category, rhs.category).append(units, rhs.units).append(revenue, rhs.revenue).append(evars, rhs.evars).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
