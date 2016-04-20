
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
    "reportSuite",
    "timeGMT",
    "receivedTimeGMT",
    "hitIdHigh",
    "hitIdLow",
    "mcVisIdHigh",
    "mcVisIdLow",
    "visIdHigh",
    "visIdLow",
    "visIdType",
    "props",
    "evars",
    "events",
    "products",
    "geoCountry",
    "geoRegion",
    "geoCity",
    "geoZip",
    "geoDMA",
    "geoLatitude",
    "geoLongitude",
    "connectionType",
    "topLevelDomain",
    "languageAbbrev",
    "language",
    "searchEngine",
    "bot",
    "operatingSystem",
    "browserType",
    "browser",
    "javascriptVersion",
    "monitorWidth",
    "monitorHeight",
    "monitorColorDepth",
    "mobileDeviceType",
    "mobileDeviceName",
    "mobileManufacturer",
    "mobileScreenWidth",
    "mobileScreenHeight",
    "mobileCookieSupport",
    "mobileColorDepth",
    "mobileAudioSupport",
    "mobileVideoSupport",
    "pageURL",
    "pageName",
    "usesPersistentCookie",
    "homePage",
    "browserHeight",
    "browserWidth",
    "javaEnabled",
    "ip",
    "isErrorPage",
    "purchaseId",
    "referrer",
    "state",
    "userAgent",
    "plugins",
    "currency",
    "hitSource",
    "transactionId",
    "truncated",
    "zip"
})
public class Example implements Cloneable{

    @JsonProperty("reportSuite")
    private String reportSuite;
    @JsonProperty("timeGMT")
    private Integer timeGMT;
    @JsonProperty("receivedTimeGMT")
    private Integer receivedTimeGMT;
    @JsonProperty("hitIdHigh")
    private Integer hitIdHigh;
    @JsonProperty("hitIdLow")
    private Integer hitIdLow;
    @JsonProperty("mcVisIdHigh")
    private Integer mcVisIdHigh;
    @JsonProperty("mcVisIdLow")
    private Integer mcVisIdLow;
    @JsonProperty("visIdHigh")
    private Integer visIdHigh;
    @JsonProperty("visIdLow")
    private Integer visIdLow;
    @JsonProperty("visIdType")
    private Integer visIdType;
    @JsonProperty("props")
    private Props props;
    @JsonProperty("evars")
    private Evars evars;
    @JsonProperty("events")
    private Events events;
    @JsonProperty("products")
    private List<Product> products = new ArrayList<Product>();
    @JsonProperty("geoCountry")
    private String geoCountry;
    @JsonProperty("geoRegion")
    private String geoRegion;
    @JsonProperty("geoCity")
    private String geoCity;
    @JsonProperty("geoZip")
    private String geoZip;
    @JsonProperty("geoDMA")
    private Integer geoDMA;
    @JsonProperty("geoLatitude")
    private Double geoLatitude;
    @JsonProperty("geoLongitude")
    private Double geoLongitude;
    @JsonProperty("connectionType")
    private String connectionType;
    @JsonProperty("topLevelDomain")
    private String topLevelDomain;
    @JsonProperty("languageAbbrev")
    private String languageAbbrev;
    @JsonProperty("language")
    private String language;
    @JsonProperty("searchEngine")
    private String searchEngine;
    @JsonProperty("bot")
    private String bot;
    @JsonProperty("operatingSystem")
    private String operatingSystem;
    @JsonProperty("browserType")
    private String browserType;
    @JsonProperty("browser")
    private String browser;
    @JsonProperty("javascriptVersion")
    private String javascriptVersion;
    @JsonProperty("monitorWidth")
    private Integer monitorWidth;
    @JsonProperty("monitorHeight")
    private Integer monitorHeight;
    @JsonProperty("monitorColorDepth")
    private String monitorColorDepth;
    @JsonProperty("mobileDeviceType")
    private String mobileDeviceType;
    @JsonProperty("mobileDeviceName")
    private String mobileDeviceName;
    @JsonProperty("mobileManufacturer")
    private String mobileManufacturer;
    @JsonProperty("mobileScreenWidth")
    private Integer mobileScreenWidth;
    @JsonProperty("mobileScreenHeight")
    private Integer mobileScreenHeight;
    @JsonProperty("mobileCookieSupport")
    private Boolean mobileCookieSupport;
    @JsonProperty("mobileColorDepth")
    private String mobileColorDepth;
    @JsonProperty("mobileAudioSupport")
    private String mobileAudioSupport;
    @JsonProperty("mobileVideoSupport")
    private String mobileVideoSupport;
    @JsonProperty("pageURL")
    private String pageURL;
    @JsonProperty("pageName")
    private String pageName;
    @JsonProperty("usesPersistentCookie")
    private Integer usesPersistentCookie;
    @JsonProperty("homePage")
    private Integer homePage;
    @JsonProperty("browserHeight")
    private Integer browserHeight;
    @JsonProperty("browserWidth")
    private Integer browserWidth;
    @JsonProperty("javaEnabled")
    private Boolean javaEnabled;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("isErrorPage")
    private Boolean isErrorPage;
    @JsonProperty("purchaseId")
    private String purchaseId;
    @JsonProperty("referrer")
    private String referrer;
    @JsonProperty("state")
    private String state;
    @JsonProperty("userAgent")
    private String userAgent;
    @JsonProperty("plugins")
    private String plugins;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("hitSource")
    private Integer hitSource;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("zip")
    private String zip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    	super();
    }

    /**
     * 
     * @param visIdLow
     * @param visIdHigh
     * @param usesPersistentCookie
     * @param truncated
     * @param javaEnabled
     * @param mobileVideoSupport
     * @param browserHeight
     * @param receivedTimeGMT
     * @param geoZip
     * @param geoDMA
     * @param mcVisIdLow
     * @param javascriptVersion
     * @param monitorHeight
     * @param languageAbbrev
     * @param topLevelDomain
     * @param connectionType
     * @param monitorColorDepth
     * @param mobileCookieSupport
     * @param mobileScreenWidth
     * @param mobileDeviceName
     * @param referrer
     * @param browserWidth
     * @param language
     * @param geoCountry
     * @param hitSource
     * @param visIdType
     * @param operatingSystem
     * @param transactionId
     * @param plugins
     * @param userAgent
     * @param events
     * @param state
     * @param monitorWidth
     * @param timeGMT
     * @param geoLatitude
     * @param pageURL
     * @param currency
     * @param hitIdHigh
     * @param mobileColorDepth
     * @param browser
     * @param mobileAudioSupport
     * @param evars
     * @param isErrorPage
     * @param products
     * @param homePage
     * @param zip
     * @param hitIdLow
     * @param mcVisIdHigh
     * @param pageName
     * @param reportSuite
     * @param geoLongitude
     * @param browserType
     * @param mobileManufacturer
     * @param geoRegion
     * @param mobileDeviceType
     * @param ip
     * @param bot
     * @param purchaseId
     * @param props
     * @param searchEngine
     * @param mobileScreenHeight
     * @param geoCity
     */
    public Example(String reportSuite, Integer timeGMT, Integer receivedTimeGMT, Integer hitIdHigh, Integer hitIdLow, Integer mcVisIdHigh, Integer mcVisIdLow, Integer visIdHigh, Integer visIdLow, Integer visIdType, Props props, Evars evars, Events events, List<Product> products, String geoCountry, String geoRegion, String geoCity, String geoZip, Integer geoDMA, Double geoLatitude, Double geoLongitude, String connectionType, String topLevelDomain, String languageAbbrev, String language, String searchEngine, String bot, String operatingSystem, String browserType, String browser, String javascriptVersion, Integer monitorWidth, Integer monitorHeight, String monitorColorDepth, String mobileDeviceType, String mobileDeviceName, String mobileManufacturer, Integer mobileScreenWidth, Integer mobileScreenHeight, Boolean mobileCookieSupport, String mobileColorDepth, String mobileAudioSupport, String mobileVideoSupport, String pageURL, String pageName, Integer usesPersistentCookie, Integer homePage, Integer browserHeight, Integer browserWidth, Boolean javaEnabled, String ip, Boolean isErrorPage, String purchaseId, String referrer, String state, String userAgent, String plugins, String currency, Integer hitSource, String transactionId, Boolean truncated, String zip) {
        this.reportSuite = reportSuite;
        this.timeGMT = timeGMT;
        this.receivedTimeGMT = receivedTimeGMT;
        this.hitIdHigh = hitIdHigh;
        this.hitIdLow = hitIdLow;
        this.mcVisIdHigh = mcVisIdHigh;
        this.mcVisIdLow = mcVisIdLow;
        this.visIdHigh = visIdHigh;
        this.visIdLow = visIdLow;
        this.visIdType = visIdType;
        this.props = props;
        this.evars = evars;
        this.events = events;
        this.products = products;
        this.geoCountry = geoCountry;
        this.geoRegion = geoRegion;
        this.geoCity = geoCity;
        this.geoZip = geoZip;
        this.geoDMA = geoDMA;
        this.geoLatitude = geoLatitude;
        this.geoLongitude = geoLongitude;
        this.connectionType = connectionType;
        this.topLevelDomain = topLevelDomain;
        this.languageAbbrev = languageAbbrev;
        this.language = language;
        this.searchEngine = searchEngine;
        this.bot = bot;
        this.operatingSystem = operatingSystem;
        this.browserType = browserType;
        this.browser = browser;
        this.javascriptVersion = javascriptVersion;
        this.monitorWidth = monitorWidth;
        this.monitorHeight = monitorHeight;
        this.monitorColorDepth = monitorColorDepth;
        this.mobileDeviceType = mobileDeviceType;
        this.mobileDeviceName = mobileDeviceName;
        this.mobileManufacturer = mobileManufacturer;
        this.mobileScreenWidth = mobileScreenWidth;
        this.mobileScreenHeight = mobileScreenHeight;
        this.mobileCookieSupport = mobileCookieSupport;
        this.mobileColorDepth = mobileColorDepth;
        this.mobileAudioSupport = mobileAudioSupport;
        this.mobileVideoSupport = mobileVideoSupport;
        this.pageURL = pageURL;
        this.pageName = pageName;
        this.usesPersistentCookie = usesPersistentCookie;
        this.homePage = homePage;
        this.browserHeight = browserHeight;
        this.browserWidth = browserWidth;
        this.javaEnabled = javaEnabled;
        this.ip = ip;
        this.isErrorPage = isErrorPage;
        this.purchaseId = purchaseId;
        this.referrer = referrer;
        this.state = state;
        this.userAgent = userAgent;
        this.plugins = plugins;
        this.currency = currency;
        this.hitSource = hitSource;
        this.transactionId = transactionId;
        this.truncated = truncated;
        this.zip = zip;
    }

    /**
     * 
     * @return
     *     The reportSuite
     */
    @JsonProperty("reportSuite")
    public String getReportSuite() {
        return reportSuite;
    }

    /**
     * 
     * @param reportSuite
     *     The reportSuite
     */
    @JsonProperty("reportSuite")
    public void setReportSuite(String reportSuite) {
        this.reportSuite = reportSuite;
    }

    /**
     * 
     * @return
     *     The timeGMT
     */
    @JsonProperty("timeGMT")
    public Integer getTimeGMT() {
        return timeGMT;
    }

    /**
     * 
     * @param timeGMT
     *     The timeGMT
     */
    @JsonProperty("timeGMT")
    public void setTimeGMT(Integer timeGMT) {
        this.timeGMT = timeGMT;
    }

    /**
     * 
     * @return
     *     The receivedTimeGMT
     */
    @JsonProperty("receivedTimeGMT")
    public Integer getReceivedTimeGMT() {
        return receivedTimeGMT;
    }

    /**
     * 
     * @param receivedTimeGMT
     *     The receivedTimeGMT
     */
    @JsonProperty("receivedTimeGMT")
    public void setReceivedTimeGMT(Integer receivedTimeGMT) {
        this.receivedTimeGMT = receivedTimeGMT;
    }

    /**
     * 
     * @return
     *     The hitIdHigh
     */
    @JsonProperty("hitIdHigh")
    public Integer getHitIdHigh() {
        return hitIdHigh;
    }

    /**
     * 
     * @param hitIdHigh
     *     The hitIdHigh
     */
    @JsonProperty("hitIdHigh")
    public void setHitIdHigh(Integer hitIdHigh) {
        this.hitIdHigh = hitIdHigh;
    }

    /**
     * 
     * @return
     *     The hitIdLow
     */
    @JsonProperty("hitIdLow")
    public Integer getHitIdLow() {
        return hitIdLow;
    }

    /**
     * 
     * @param hitIdLow
     *     The hitIdLow
     */
    @JsonProperty("hitIdLow")
    public void setHitIdLow(Integer hitIdLow) {
        this.hitIdLow = hitIdLow;
    }

    /**
     * 
     * @return
     *     The mcVisIdHigh
     */
    @JsonProperty("mcVisIdHigh")
    public Integer getMcVisIdHigh() {
        return mcVisIdHigh;
    }

    /**
     * 
     * @param mcVisIdHigh
     *     The mcVisIdHigh
     */
    @JsonProperty("mcVisIdHigh")
    public void setMcVisIdHigh(Integer mcVisIdHigh) {
        this.mcVisIdHigh = mcVisIdHigh;
    }

    /**
     * 
     * @return
     *     The mcVisIdLow
     */
    @JsonProperty("mcVisIdLow")
    public Integer getMcVisIdLow() {
        return mcVisIdLow;
    }

    /**
     * 
     * @param mcVisIdLow
     *     The mcVisIdLow
     */
    @JsonProperty("mcVisIdLow")
    public void setMcVisIdLow(Integer mcVisIdLow) {
        this.mcVisIdLow = mcVisIdLow;
    }

    /**
     * 
     * @return
     *     The visIdHigh
     */
    @JsonProperty("visIdHigh")
    public Integer getVisIdHigh() {
        return visIdHigh;
    }

    /**
     * 
     * @param visIdHigh
     *     The visIdHigh
     */
    @JsonProperty("visIdHigh")
    public void setVisIdHigh(Integer visIdHigh) {
        this.visIdHigh = visIdHigh;
    }

    /**
     * 
     * @return
     *     The visIdLow
     */
    @JsonProperty("visIdLow")
    public Integer getVisIdLow() {
        return visIdLow;
    }

    /**
     * 
     * @param visIdLow
     *     The visIdLow
     */
    @JsonProperty("visIdLow")
    public void setVisIdLow(Integer visIdLow) {
        this.visIdLow = visIdLow;
    }

    /**
     * 
     * @return
     *     The visIdType
     */
    @JsonProperty("visIdType")
    public Integer getVisIdType() {
        return visIdType;
    }

    /**
     * 
     * @param visIdType
     *     The visIdType
     */
    @JsonProperty("visIdType")
    public void setVisIdType(Integer visIdType) {
        this.visIdType = visIdType;
    }

    /**
     * 
     * @return
     *     The props
     */
    @JsonProperty("props")
    public Props getProps() {
        return props;
    }

    /**
     * 
     * @param props
     *     The props
     */
    @JsonProperty("props")
    public void setProps(Props props) {
        this.props = props;
    }

    /**
     * 
     * @return
     *     The evars
     */
    @JsonProperty("evars")
    public Evars getEvars() {
        return evars;
    }

    /**
     * 
     * @param evars
     *     The evars
     */
    @JsonProperty("evars")
    public void setEvars(Evars evars) {
        this.evars = evars;
    }

    /**
     * 
     * @return
     *     The events
     */
    @JsonProperty("events")
    public Events getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    @JsonProperty("events")
    public void setEvents(Events events) {
        this.events = events;
    }

    /**
     * 
     * @return
     *     The products
     */
    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    /**
     * 
     * @param products
     *     The products
     */
    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * 
     * @return
     *     The geoCountry
     */
    @JsonProperty("geoCountry")
    public String getGeoCountry() {
        return geoCountry;
    }

    /**
     * 
     * @param geoCountry
     *     The geoCountry
     */
    @JsonProperty("geoCountry")
    public void setGeoCountry(String geoCountry) {
        this.geoCountry = geoCountry;
    }

    /**
     * 
     * @return
     *     The geoRegion
     */
    @JsonProperty("geoRegion")
    public String getGeoRegion() {
        return geoRegion;
    }

    /**
     * 
     * @param geoRegion
     *     The geoRegion
     */
    @JsonProperty("geoRegion")
    public void setGeoRegion(String geoRegion) {
        this.geoRegion = geoRegion;
    }

    /**
     * 
     * @return
     *     The geoCity
     */
    @JsonProperty("geoCity")
    public String getGeoCity() {
        return geoCity;
    }

    /**
     * 
     * @param geoCity
     *     The geoCity
     */
    @JsonProperty("geoCity")
    public void setGeoCity(String geoCity) {
        this.geoCity = geoCity;
    }

    /**
     * 
     * @return
     *     The geoZip
     */
    @JsonProperty("geoZip")
    public String getGeoZip() {
        return geoZip;
    }

    /**
     * 
     * @param geoZip
     *     The geoZip
     */
    @JsonProperty("geoZip")
    public void setGeoZip(String geoZip) {
        this.geoZip = geoZip;
    }

    /**
     * 
     * @return
     *     The geoDMA
     */
    @JsonProperty("geoDMA")
    public Integer getGeoDMA() {
        return geoDMA;
    }

    /**
     * 
     * @param geoDMA
     *     The geoDMA
     */
    @JsonProperty("geoDMA")
    public void setGeoDMA(Integer geoDMA) {
        this.geoDMA = geoDMA;
    }

    /**
     * 
     * @return
     *     The geoLatitude
     */
    @JsonProperty("geoLatitude")
    public Double getGeoLatitude() {
        return geoLatitude;
    }

    /**
     * 
     * @param geoLatitude
     *     The geoLatitude
     */
    @JsonProperty("geoLatitude")
    public void setGeoLatitude(Double geoLatitude) {
        this.geoLatitude = geoLatitude;
    }

    /**
     * 
     * @return
     *     The geoLongitude
     */
    @JsonProperty("geoLongitude")
    public Double getGeoLongitude() {
        return geoLongitude;
    }

    /**
     * 
     * @param geoLongitude
     *     The geoLongitude
     */
    @JsonProperty("geoLongitude")
    public void setGeoLongitude(Double geoLongitude) {
        this.geoLongitude = geoLongitude;
    }

    /**
     * 
     * @return
     *     The connectionType
     */
    @JsonProperty("connectionType")
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * 
     * @param connectionType
     *     The connectionType
     */
    @JsonProperty("connectionType")
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * 
     * @return
     *     The topLevelDomain
     */
    @JsonProperty("topLevelDomain")
    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    /**
     * 
     * @param topLevelDomain
     *     The topLevelDomain
     */
    @JsonProperty("topLevelDomain")
    public void setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    /**
     * 
     * @return
     *     The languageAbbrev
     */
    @JsonProperty("languageAbbrev")
    public String getLanguageAbbrev() {
        return languageAbbrev;
    }

    /**
     * 
     * @param languageAbbrev
     *     The languageAbbrev
     */
    @JsonProperty("languageAbbrev")
    public void setLanguageAbbrev(String languageAbbrev) {
        this.languageAbbrev = languageAbbrev;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The searchEngine
     */
    @JsonProperty("searchEngine")
    public String getSearchEngine() {
        return searchEngine;
    }

    /**
     * 
     * @param searchEngine
     *     The searchEngine
     */
    @JsonProperty("searchEngine")
    public void setSearchEngine(String searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * 
     * @return
     *     The bot
     */
    @JsonProperty("bot")
    public String getBot() {
        return bot;
    }

    /**
     * 
     * @param bot
     *     The bot
     */
    @JsonProperty("bot")
    public void setBot(String bot) {
        this.bot = bot;
    }

    /**
     * 
     * @return
     *     The operatingSystem
     */
    @JsonProperty("operatingSystem")
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * 
     * @param operatingSystem
     *     The operatingSystem
     */
    @JsonProperty("operatingSystem")
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * 
     * @return
     *     The browserType
     */
    @JsonProperty("browserType")
    public String getBrowserType() {
        return browserType;
    }

    /**
     * 
     * @param browserType
     *     The browserType
     */
    @JsonProperty("browserType")
    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    /**
     * 
     * @return
     *     The browser
     */
    @JsonProperty("browser")
    public String getBrowser() {
        return browser;
    }

    /**
     * 
     * @param browser
     *     The browser
     */
    @JsonProperty("browser")
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    /**
     * 
     * @return
     *     The javascriptVersion
     */
    @JsonProperty("javascriptVersion")
    public String getJavascriptVersion() {
        return javascriptVersion;
    }

    /**
     * 
     * @param javascriptVersion
     *     The javascriptVersion
     */
    @JsonProperty("javascriptVersion")
    public void setJavascriptVersion(String javascriptVersion) {
        this.javascriptVersion = javascriptVersion;
    }

    /**
     * 
     * @return
     *     The monitorWidth
     */
    @JsonProperty("monitorWidth")
    public Integer getMonitorWidth() {
        return monitorWidth;
    }

    /**
     * 
     * @param monitorWidth
     *     The monitorWidth
     */
    @JsonProperty("monitorWidth")
    public void setMonitorWidth(Integer monitorWidth) {
        this.monitorWidth = monitorWidth;
    }

    /**
     * 
     * @return
     *     The monitorHeight
     */
    @JsonProperty("monitorHeight")
    public Integer getMonitorHeight() {
        return monitorHeight;
    }

    /**
     * 
     * @param monitorHeight
     *     The monitorHeight
     */
    @JsonProperty("monitorHeight")
    public void setMonitorHeight(Integer monitorHeight) {
        this.monitorHeight = monitorHeight;
    }

    /**
     * 
     * @return
     *     The monitorColorDepth
     */
    @JsonProperty("monitorColorDepth")
    public String getMonitorColorDepth() {
        return monitorColorDepth;
    }

    /**
     * 
     * @param monitorColorDepth
     *     The monitorColorDepth
     */
    @JsonProperty("monitorColorDepth")
    public void setMonitorColorDepth(String monitorColorDepth) {
        this.monitorColorDepth = monitorColorDepth;
    }

    /**
     * 
     * @return
     *     The mobileDeviceType
     */
    @JsonProperty("mobileDeviceType")
    public String getMobileDeviceType() {
        return mobileDeviceType;
    }

    /**
     * 
     * @param mobileDeviceType
     *     The mobileDeviceType
     */
    @JsonProperty("mobileDeviceType")
    public void setMobileDeviceType(String mobileDeviceType) {
        this.mobileDeviceType = mobileDeviceType;
    }

    /**
     * 
     * @return
     *     The mobileDeviceName
     */
    @JsonProperty("mobileDeviceName")
    public String getMobileDeviceName() {
        return mobileDeviceName;
    }

    /**
     * 
     * @param mobileDeviceName
     *     The mobileDeviceName
     */
    @JsonProperty("mobileDeviceName")
    public void setMobileDeviceName(String mobileDeviceName) {
        this.mobileDeviceName = mobileDeviceName;
    }

    /**
     * 
     * @return
     *     The mobileManufacturer
     */
    @JsonProperty("mobileManufacturer")
    public String getMobileManufacturer() {
        return mobileManufacturer;
    }

    /**
     * 
     * @param mobileManufacturer
     *     The mobileManufacturer
     */
    @JsonProperty("mobileManufacturer")
    public void setMobileManufacturer(String mobileManufacturer) {
        this.mobileManufacturer = mobileManufacturer;
    }

    /**
     * 
     * @return
     *     The mobileScreenWidth
     */
    @JsonProperty("mobileScreenWidth")
    public Integer getMobileScreenWidth() {
        return mobileScreenWidth;
    }

    /**
     * 
     * @param mobileScreenWidth
     *     The mobileScreenWidth
     */
    @JsonProperty("mobileScreenWidth")
    public void setMobileScreenWidth(Integer mobileScreenWidth) {
        this.mobileScreenWidth = mobileScreenWidth;
    }

    /**
     * 
     * @return
     *     The mobileScreenHeight
     */
    @JsonProperty("mobileScreenHeight")
    public Integer getMobileScreenHeight() {
        return mobileScreenHeight;
    }

    /**
     * 
     * @param mobileScreenHeight
     *     The mobileScreenHeight
     */
    @JsonProperty("mobileScreenHeight")
    public void setMobileScreenHeight(Integer mobileScreenHeight) {
        this.mobileScreenHeight = mobileScreenHeight;
    }

    /**
     * 
     * @return
     *     The mobileCookieSupport
     */
    @JsonProperty("mobileCookieSupport")
    public Boolean getMobileCookieSupport() {
        return mobileCookieSupport;
    }

    /**
     * 
     * @param mobileCookieSupport
     *     The mobileCookieSupport
     */
    @JsonProperty("mobileCookieSupport")
    public void setMobileCookieSupport(Boolean mobileCookieSupport) {
        this.mobileCookieSupport = mobileCookieSupport;
    }

    /**
     * 
     * @return
     *     The mobileColorDepth
     */
    @JsonProperty("mobileColorDepth")
    public String getMobileColorDepth() {
        return mobileColorDepth;
    }

    /**
     * 
     * @param mobileColorDepth
     *     The mobileColorDepth
     */
    @JsonProperty("mobileColorDepth")
    public void setMobileColorDepth(String mobileColorDepth) {
        this.mobileColorDepth = mobileColorDepth;
    }

    /**
     * 
     * @return
     *     The mobileAudioSupport
     */
    @JsonProperty("mobileAudioSupport")
    public String getMobileAudioSupport() {
        return mobileAudioSupport;
    }

    /**
     * 
     * @param mobileAudioSupport
     *     The mobileAudioSupport
     */
    @JsonProperty("mobileAudioSupport")
    public void setMobileAudioSupport(String mobileAudioSupport) {
        this.mobileAudioSupport = mobileAudioSupport;
    }

    /**
     * 
     * @return
     *     The mobileVideoSupport
     */
    @JsonProperty("mobileVideoSupport")
    public String getMobileVideoSupport() {
        return mobileVideoSupport;
    }

    /**
     * 
     * @param mobileVideoSupport
     *     The mobileVideoSupport
     */
    @JsonProperty("mobileVideoSupport")
    public void setMobileVideoSupport(String mobileVideoSupport) {
        this.mobileVideoSupport = mobileVideoSupport;
    }

    /**
     * 
     * @return
     *     The pageURL
     */
    @JsonProperty("pageURL")
    public String getPageURL() {
        return pageURL;
    }

    /**
     * 
     * @param pageURL
     *     The pageURL
     */
    @JsonProperty("pageURL")
    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    /**
     * 
     * @return
     *     The pageName
     */
    @JsonProperty("pageName")
    public String getPageName() {
        return pageName;
    }

    /**
     * 
     * @param pageName
     *     The pageName
     */
    @JsonProperty("pageName")
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    /**
     * 
     * @return
     *     The usesPersistentCookie
     */
    @JsonProperty("usesPersistentCookie")
    public Integer getUsesPersistentCookie() {
        return usesPersistentCookie;
    }

    /**
     * 
     * @param usesPersistentCookie
     *     The usesPersistentCookie
     */
    @JsonProperty("usesPersistentCookie")
    public void setUsesPersistentCookie(Integer usesPersistentCookie) {
        this.usesPersistentCookie = usesPersistentCookie;
    }

    /**
     * 
     * @return
     *     The homePage
     */
    @JsonProperty("homePage")
    public Integer getHomePage() {
        return homePage;
    }

    /**
     * 
     * @param homePage
     *     The homePage
     */
    @JsonProperty("homePage")
    public void setHomePage(Integer homePage) {
        this.homePage = homePage;
    }

    /**
     * 
     * @return
     *     The browserHeight
     */
    @JsonProperty("browserHeight")
    public Integer getBrowserHeight() {
        return browserHeight;
    }

    /**
     * 
     * @param browserHeight
     *     The browserHeight
     */
    @JsonProperty("browserHeight")
    public void setBrowserHeight(Integer browserHeight) {
        this.browserHeight = browserHeight;
    }

    /**
     * 
     * @return
     *     The browserWidth
     */
    @JsonProperty("browserWidth")
    public Integer getBrowserWidth() {
        return browserWidth;
    }

    /**
     * 
     * @param browserWidth
     *     The browserWidth
     */
    @JsonProperty("browserWidth")
    public void setBrowserWidth(Integer browserWidth) {
        this.browserWidth = browserWidth;
    }

    /**
     * 
     * @return
     *     The javaEnabled
     */
    @JsonProperty("javaEnabled")
    public Boolean getJavaEnabled() {
        return javaEnabled;
    }

    /**
     * 
     * @param javaEnabled
     *     The javaEnabled
     */
    @JsonProperty("javaEnabled")
    public void setJavaEnabled(Boolean javaEnabled) {
        this.javaEnabled = javaEnabled;
    }

    /**
     * 
     * @return
     *     The ip
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * 
     * @param ip
     *     The ip
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 
     * @return
     *     The isErrorPage
     */
    @JsonProperty("isErrorPage")
    public Boolean getIsErrorPage() {
        return isErrorPage;
    }

    /**
     * 
     * @param isErrorPage
     *     The isErrorPage
     */
    @JsonProperty("isErrorPage")
    public void setIsErrorPage(Boolean isErrorPage) {
        this.isErrorPage = isErrorPage;
    }

    /**
     * 
     * @return
     *     The purchaseId
     */
    @JsonProperty("purchaseId")
    public String getPurchaseId() {
        return purchaseId;
    }

    /**
     * 
     * @param purchaseId
     *     The purchaseId
     */
    @JsonProperty("purchaseId")
    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    /**
     * 
     * @return
     *     The referrer
     */
    @JsonProperty("referrer")
    public String getReferrer() {
        return referrer;
    }

    /**
     * 
     * @param referrer
     *     The referrer
     */
    @JsonProperty("referrer")
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The userAgent
     */
    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * 
     * @param userAgent
     *     The userAgent
     */
    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * 
     * @return
     *     The plugins
     */
    @JsonProperty("plugins")
    public String getPlugins() {
        return plugins;
    }

    /**
     * 
     * @param plugins
     *     The plugins
     */
    @JsonProperty("plugins")
    public void setPlugins(String plugins) {
        this.plugins = plugins;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The hitSource
     */
    @JsonProperty("hitSource")
    public Integer getHitSource() {
        return hitSource;
    }

    /**
     * 
     * @param hitSource
     *     The hitSource
     */
    @JsonProperty("hitSource")
    public void setHitSource(Integer hitSource) {
        this.hitSource = hitSource;
    }

    /**
     * 
     * @return
     *     The transactionId
     */
    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 
     * @param transactionId
     *     The transactionId
     */
    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 
     * @return
     *     The truncated
     */
    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * 
     * @param truncated
     *     The truncated
     */
    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * 
     * @return
     *     The zip
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * 
     * @param zip
     *     The zip
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
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
        return new HashCodeBuilder().append(reportSuite).append(timeGMT).append(receivedTimeGMT).append(hitIdHigh).append(hitIdLow).append(mcVisIdHigh).append(mcVisIdLow).append(visIdHigh).append(visIdLow).append(visIdType).append(props).append(evars).append(events).append(products).append(geoCountry).append(geoRegion).append(geoCity).append(geoZip).append(geoDMA).append(geoLatitude).append(geoLongitude).append(connectionType).append(topLevelDomain).append(languageAbbrev).append(language).append(searchEngine).append(bot).append(operatingSystem).append(browserType).append(browser).append(javascriptVersion).append(monitorWidth).append(monitorHeight).append(monitorColorDepth).append(mobileDeviceType).append(mobileDeviceName).append(mobileManufacturer).append(mobileScreenWidth).append(mobileScreenHeight).append(mobileCookieSupport).append(mobileColorDepth).append(mobileAudioSupport).append(mobileVideoSupport).append(pageURL).append(pageName).append(usesPersistentCookie).append(homePage).append(browserHeight).append(browserWidth).append(javaEnabled).append(ip).append(isErrorPage).append(purchaseId).append(referrer).append(state).append(userAgent).append(plugins).append(currency).append(hitSource).append(transactionId).append(truncated).append(zip).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Example) == false) {
            return false;
        }
        Example rhs = ((Example) other);
        return new EqualsBuilder().append(reportSuite, rhs.reportSuite).append(timeGMT, rhs.timeGMT).append(receivedTimeGMT, rhs.receivedTimeGMT).append(hitIdHigh, rhs.hitIdHigh).append(hitIdLow, rhs.hitIdLow).append(mcVisIdHigh, rhs.mcVisIdHigh).append(mcVisIdLow, rhs.mcVisIdLow).append(visIdHigh, rhs.visIdHigh).append(visIdLow, rhs.visIdLow).append(visIdType, rhs.visIdType).append(props, rhs.props).append(evars, rhs.evars).append(events, rhs.events).append(products, rhs.products).append(geoCountry, rhs.geoCountry).append(geoRegion, rhs.geoRegion).append(geoCity, rhs.geoCity).append(geoZip, rhs.geoZip).append(geoDMA, rhs.geoDMA).append(geoLatitude, rhs.geoLatitude).append(geoLongitude, rhs.geoLongitude).append(connectionType, rhs.connectionType).append(topLevelDomain, rhs.topLevelDomain).append(languageAbbrev, rhs.languageAbbrev).append(language, rhs.language).append(searchEngine, rhs.searchEngine).append(bot, rhs.bot).append(operatingSystem, rhs.operatingSystem).append(browserType, rhs.browserType).append(browser, rhs.browser).append(javascriptVersion, rhs.javascriptVersion).append(monitorWidth, rhs.monitorWidth).append(monitorHeight, rhs.monitorHeight).append(monitorColorDepth, rhs.monitorColorDepth).append(mobileDeviceType, rhs.mobileDeviceType).append(mobileDeviceName, rhs.mobileDeviceName).append(mobileManufacturer, rhs.mobileManufacturer).append(mobileScreenWidth, rhs.mobileScreenWidth).append(mobileScreenHeight, rhs.mobileScreenHeight).append(mobileCookieSupport, rhs.mobileCookieSupport).append(mobileColorDepth, rhs.mobileColorDepth).append(mobileAudioSupport, rhs.mobileAudioSupport).append(mobileVideoSupport, rhs.mobileVideoSupport).append(pageURL, rhs.pageURL).append(pageName, rhs.pageName).append(usesPersistentCookie, rhs.usesPersistentCookie).append(homePage, rhs.homePage).append(browserHeight, rhs.browserHeight).append(browserWidth, rhs.browserWidth).append(javaEnabled, rhs.javaEnabled).append(ip, rhs.ip).append(isErrorPage, rhs.isErrorPage).append(purchaseId, rhs.purchaseId).append(referrer, rhs.referrer).append(state, rhs.state).append(userAgent, rhs.userAgent).append(plugins, rhs.plugins).append(currency, rhs.currency).append(hitSource, rhs.hitSource).append(transactionId, rhs.transactionId).append(truncated, rhs.truncated).append(zip, rhs.zip).append(additionalProperties, rhs.additionalProperties).isEquals();
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
