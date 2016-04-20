
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
    "prop18",
    "prop53",
    "prop19",
    "prop17",
    "prop49",
    "prop4",
    "prop10",
    "prop9",
    "prop20",
    "prop11",
    "prop21",
    "prop22"
})
public class Props implements Cloneable {

    @JsonProperty("prop18")
    private String prop18;
    @JsonProperty("prop53")
    private String prop53;
    @JsonProperty("prop19")
    private String prop19;
    @JsonProperty("prop17")
    private String prop17;
    @JsonProperty("prop49")
    private String prop49;
    @JsonProperty("prop4")
    private String prop4;
    @JsonProperty("prop10")
    private String prop10;
    @JsonProperty("prop9")
    private String prop9;
    @JsonProperty("prop20")
    private String prop20;
    @JsonProperty("prop11")
    private String prop11;
    @JsonProperty("prop21")
    private String prop21;
    @JsonProperty("prop22")
    private String prop22;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Props() {
    	super();
    }

    /**
     * 
     * @param prop53
     * @param prop18
     * @param prop19
     * @param prop17
     * @param prop4
     * @param prop49
     * @param prop9
     * @param prop10
     * @param prop11
     * @param prop20
     * @param prop21
     * @param prop22
     */
    public Props(String prop18, String prop53, String prop19, String prop17, String prop49, String prop4, String prop10, String prop9, String prop20, String prop11, String prop21, String prop22) {
        this.prop18 = prop18;
        this.prop53 = prop53;
        this.prop19 = prop19;
        this.prop17 = prop17;
        this.prop49 = prop49;
        this.prop4 = prop4;
        this.prop10 = prop10;
        this.prop9 = prop9;
        this.prop20 = prop20;
        this.prop11 = prop11;
        this.prop21 = prop21;
        this.prop22 = prop22;
    }

    /**
     * 
     * @return
     *     The prop18
     */
    @JsonProperty("prop18")
    public String getProp18() {
        return prop18;
    }

    /**
     * 
     * @param prop18
     *     The prop18
     */
    @JsonProperty("prop18")
    public void setProp18(String prop18) {
        this.prop18 = prop18;
    }

    /**
     * 
     * @return
     *     The prop53
     */
    @JsonProperty("prop53")
    public String getProp53() {
        return prop53;
    }

    /**
     * 
     * @param prop53
     *     The prop53
     */
    @JsonProperty("prop53")
    public void setProp53(String prop53) {
        this.prop53 = prop53;
    }

    /**
     * 
     * @return
     *     The prop19
     */
    @JsonProperty("prop19")
    public String getProp19() {
        return prop19;
    }

    /**
     * 
     * @param prop19
     *     The prop19
     */
    @JsonProperty("prop19")
    public void setProp19(String prop19) {
        this.prop19 = prop19;
    }

    /**
     * 
     * @return
     *     The prop17
     */
    @JsonProperty("prop17")
    public String getProp17() {
        return prop17;
    }

    /**
     * 
     * @param prop17
     *     The prop17
     */
    @JsonProperty("prop17")
    public void setProp17(String prop17) {
        this.prop17 = prop17;
    }

    /**
     * 
     * @return
     *     The prop49
     */
    @JsonProperty("prop49")
    public String getProp49() {
        return prop49;
    }

    /**
     * 
     * @param prop49
     *     The prop49
     */
    @JsonProperty("prop49")
    public void setProp49(String prop49) {
        this.prop49 = prop49;
    }

    /**
     * 
     * @return
     *     The prop4
     */
    @JsonProperty("prop4")
    public String getProp4() {
        return prop4;
    }

    /**
     * 
     * @param prop4
     *     The prop4
     */
    @JsonProperty("prop4")
    public void setProp4(String prop4) {
        this.prop4 = prop4;
    }

    /**
     * 
     * @return
     *     The prop10
     */
    @JsonProperty("prop10")
    public String getProp10() {
        return prop10;
    }

    /**
     * 
     * @param prop10
     *     The prop10
     */
    @JsonProperty("prop10")
    public void setProp10(String prop10) {
        this.prop10 = prop10;
    }

    /**
     * 
     * @return
     *     The prop9
     */
    @JsonProperty("prop9")
    public String getProp9() {
        return prop9;
    }

    /**
     * 
     * @param prop9
     *     The prop9
     */
    @JsonProperty("prop9")
    public void setProp9(String prop9) {
        this.prop9 = prop9;
    }

    /**
     * 
     * @return
     *     The prop20
     */
    @JsonProperty("prop20")
    public String getProp20() {
        return prop20;
    }

    /**
     * 
     * @param prop20
     *     The prop20
     */
    @JsonProperty("prop20")
    public void setProp20(String prop20) {
        this.prop20 = prop20;
    }

    /**
     * 
     * @return
     *     The prop11
     */
    @JsonProperty("prop11")
    public String getProp11() {
        return prop11;
    }

    /**
     * 
     * @param prop11
     *     The prop11
     */
    @JsonProperty("prop11")
    public void setProp11(String prop11) {
        this.prop11 = prop11;
    }

    /**
     * 
     * @return
     *     The prop21
     */
    @JsonProperty("prop21")
    public String getProp21() {
        return prop21;
    }

    /**
     * 
     * @param prop21
     *     The prop21
     */
    @JsonProperty("prop21")
    public void setProp21(String prop21) {
        this.prop21 = prop21;
    }

    /**
     * 
     * @return
     *     The prop22
     */
    @JsonProperty("prop22")
    public String getProp22() {
        return prop22;
    }

    /**
     * 
     * @param prop22
     *     The prop22
     */
    @JsonProperty("prop22")
    public void setProp22(String prop22) {
        this.prop22 = prop22;
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
        return new HashCodeBuilder().append(prop18).append(prop53).append(prop19).append(prop17).append(prop49).append(prop4).append(prop10).append(prop9).append(prop20).append(prop11).append(prop21).append(prop22).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Props) == false) {
            return false;
        }
        Props rhs = ((Props) other);
        return new EqualsBuilder().append(prop18, rhs.prop18).append(prop53, rhs.prop53).append(prop19, rhs.prop19).append(prop17, rhs.prop17).append(prop49, rhs.prop49).append(prop4, rhs.prop4).append(prop10, rhs.prop10).append(prop9, rhs.prop9).append(prop20, rhs.prop20).append(prop11, rhs.prop11).append(prop21, rhs.prop21).append(prop22, rhs.prop22).append(additionalProperties, rhs.additionalProperties).isEquals();
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
