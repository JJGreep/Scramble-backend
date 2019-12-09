package com.Scramble.backend.Models;


import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "R",
    "apikey",
    "id",
    "name",
    "url",
    "location",
    "switch_to_order_menu",
    "cuisines",
    "timings",
    "average_cost_for_two",
    "price_range",
    "currency",
    "highlights",
    "offers",
    "opentable_support",
    "is_zomato_book_res",
    "mezzo_provider",
    "is_book_form_web_view",
    "book_form_web_view_url",
    "book_again_url",
    "thumb",
    "user_rating",
    "all_reviews_count",
    "photos_url",
    "photo_count",
    "menu_url",
    "featured_image",
    "has_online_delivery",
    "is_delivering_now",
    "include_bogo_offers",
    "deeplink",
    "is_table_reservation_supported",
    "has_table_booking",
    "events_url",
    "phone_numbers",
    "all_reviews",
    "establishment",
    "establishment_types"
})
public class Restaurant_ implements Serializable
{

    @JsonProperty("R")
    @Valid
    private R r;
    @JsonProperty("apikey")
    private String apikey;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("location")
    @Valid
    private Location location;
    @JsonProperty("switch_to_order_menu")
    private Integer switchToOrderMenu;
    @JsonProperty("cuisines")
    private String cuisines;
    @JsonProperty("timings")
    private String timings;
    @JsonProperty("average_cost_for_two")
    private Integer averageCostForTwo;
    @JsonProperty("price_range")
    private Integer priceRange;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("highlights")
    @Valid
    private List<String> highlights = null;
    @JsonProperty("offers")
    @Valid
    private List<Object> offers = null;
    @JsonProperty("opentable_support")
    private Integer opentableSupport;
    @JsonProperty("is_zomato_book_res")
    private Integer isZomatoBookRes;
    @JsonProperty("mezzo_provider")
    private String mezzoProvider;
    @JsonProperty("is_book_form_web_view")
    private Integer isBookFormWebView;
    @JsonProperty("book_form_web_view_url")
    private String bookFormWebViewUrl;
    @JsonProperty("book_again_url")
    private String bookAgainUrl;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("user_rating")
    @Valid
    private UserRating userRating;
    @JsonProperty("all_reviews_count")
    private Integer allReviewsCount;
    @JsonProperty("photos_url")
    private String photosUrl;
    @JsonProperty("photo_count")
    private Integer photoCount;
    @JsonProperty("menu_url")
    private String menuUrl;
    @JsonProperty("featured_image")
    private String featuredImage;
    @JsonProperty("has_online_delivery")
    private Integer hasOnlineDelivery;
    @JsonProperty("is_delivering_now")
    private Integer isDeliveringNow;
    @JsonProperty("include_bogo_offers")
    private Boolean includeBogoOffers;
    @JsonProperty("deeplink")
    private String deeplink;
    @JsonProperty("is_table_reservation_supported")
    private Integer isTableReservationSupported;
    @JsonProperty("has_table_booking")
    private Integer hasTableBooking;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("phone_numbers")
    private String phoneNumbers;
    @JsonProperty("all_reviews")
    @Valid
    private AllReviews allReviews;
    @JsonProperty("establishment")
    @Valid
    private List<Object> establishment = null;
    @JsonProperty("establishment_types")
    @Valid
    private List<Object> establishmentTypes = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5938665735456325266L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Restaurant_() {
    }

    /**
     * 
     * @param allReviews
     * @param opentableSupport
     * @param thumb
     * @param hasTableBooking
     * @param establishmentTypes
     * @param averageCostForTwo
     * @param phoneNumbers
     * @param photoCount
     * @param switchToOrderMenu
     * @param bookAgainUrl
     * @param timings
     * @param currency
     * @param id
     * @param bookFormWebViewUrl
     * @param isBookFormWebView
     * @param isDeliveringNow
     * @param includeBogoOffers
     * @param offers
     * @param isTableReservationSupported
     * @param apikey
     * @param deeplink
     * @param isZomatoBookRes
     * @param establishment
     * @param photosUrl
     * @param url
     * @param userRating
     * @param cuisines
     * @param mezzoProvider
     * @param r
     * @param highlights
     * @param allReviewsCount
     * @param hasOnlineDelivery
     * @param menuUrl
     * @param featuredImage
     * @param name
     * @param location
     * @param eventsUrl
     * @param priceRange
     */
    public Restaurant_(R r, String apikey, String id, String name, String url, Location location, Integer switchToOrderMenu, String cuisines, String timings, Integer averageCostForTwo, Integer priceRange, String currency, List<String> highlights, List<Object> offers, Integer opentableSupport, Integer isZomatoBookRes, String mezzoProvider, Integer isBookFormWebView, String bookFormWebViewUrl, String bookAgainUrl, String thumb, UserRating userRating, Integer allReviewsCount, String photosUrl, Integer photoCount, String menuUrl, String featuredImage, Integer hasOnlineDelivery, Integer isDeliveringNow, Boolean includeBogoOffers, String deeplink, Integer isTableReservationSupported, Integer hasTableBooking, String eventsUrl, String phoneNumbers, AllReviews allReviews, List<Object> establishment, List<Object> establishmentTypes) {
        super();
        this.r = r;
        this.apikey = apikey;
        this.id = id;
        this.name = name;
        this.url = url;
        this.location = location;
        this.switchToOrderMenu = switchToOrderMenu;
        this.cuisines = cuisines;
        this.timings = timings;
        this.averageCostForTwo = averageCostForTwo;
        this.priceRange = priceRange;
        this.currency = currency;
        this.highlights = highlights;
        this.offers = offers;
        this.opentableSupport = opentableSupport;
        this.isZomatoBookRes = isZomatoBookRes;
        this.mezzoProvider = mezzoProvider;
        this.isBookFormWebView = isBookFormWebView;
        this.bookFormWebViewUrl = bookFormWebViewUrl;
        this.bookAgainUrl = bookAgainUrl;
        this.thumb = thumb;
        this.userRating = userRating;
        this.allReviewsCount = allReviewsCount;
        this.photosUrl = photosUrl;
        this.photoCount = photoCount;
        this.menuUrl = menuUrl;
        this.featuredImage = featuredImage;
        this.hasOnlineDelivery = hasOnlineDelivery;
        this.isDeliveringNow = isDeliveringNow;
        this.includeBogoOffers = includeBogoOffers;
        this.deeplink = deeplink;
        this.isTableReservationSupported = isTableReservationSupported;
        this.hasTableBooking = hasTableBooking;
        this.eventsUrl = eventsUrl;
        this.phoneNumbers = phoneNumbers;
        this.allReviews = allReviews;
        this.establishment = establishment;
        this.establishmentTypes = establishmentTypes;
    }

    @JsonProperty("R")
    public R getR() {
        return r;
    }

    @JsonProperty("R")
    public void setR(R r) {
        this.r = r;
    }

    @JsonProperty("apikey")
    public String getApikey() {
        return apikey;
    }

    @JsonProperty("apikey")
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("switch_to_order_menu")
    public Integer getSwitchToOrderMenu() {
        return switchToOrderMenu;
    }

    @JsonProperty("switch_to_order_menu")
    public void setSwitchToOrderMenu(Integer switchToOrderMenu) {
        this.switchToOrderMenu = switchToOrderMenu;
    }

    @JsonProperty("cuisines")
    public String getCuisines() {
        return cuisines;
    }

    @JsonProperty("cuisines")
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    @JsonProperty("timings")
    public String getTimings() {
        return timings;
    }

    @JsonProperty("timings")
    public void setTimings(String timings) {
        this.timings = timings;
    }

    @JsonProperty("average_cost_for_two")
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    @JsonProperty("average_cost_for_two")
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    @JsonProperty("price_range")
    public Integer getPriceRange() {
        return priceRange;
    }

    @JsonProperty("price_range")
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("highlights")
    public List<String> getHighlights() {
        return highlights;
    }

    @JsonProperty("highlights")
    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    @JsonProperty("offers")
    public List<Object> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    @JsonProperty("opentable_support")
    public Integer getOpentableSupport() {
        return opentableSupport;
    }

    @JsonProperty("opentable_support")
    public void setOpentableSupport(Integer opentableSupport) {
        this.opentableSupport = opentableSupport;
    }

    @JsonProperty("is_zomato_book_res")
    public Integer getIsZomatoBookRes() {
        return isZomatoBookRes;
    }

    @JsonProperty("is_zomato_book_res")
    public void setIsZomatoBookRes(Integer isZomatoBookRes) {
        this.isZomatoBookRes = isZomatoBookRes;
    }

    @JsonProperty("mezzo_provider")
    public String getMezzoProvider() {
        return mezzoProvider;
    }

    @JsonProperty("mezzo_provider")
    public void setMezzoProvider(String mezzoProvider) {
        this.mezzoProvider = mezzoProvider;
    }

    @JsonProperty("is_book_form_web_view")
    public Integer getIsBookFormWebView() {
        return isBookFormWebView;
    }

    @JsonProperty("is_book_form_web_view")
    public void setIsBookFormWebView(Integer isBookFormWebView) {
        this.isBookFormWebView = isBookFormWebView;
    }

    @JsonProperty("book_form_web_view_url")
    public String getBookFormWebViewUrl() {
        return bookFormWebViewUrl;
    }

    @JsonProperty("book_form_web_view_url")
    public void setBookFormWebViewUrl(String bookFormWebViewUrl) {
        this.bookFormWebViewUrl = bookFormWebViewUrl;
    }

    @JsonProperty("book_again_url")
    public String getBookAgainUrl() {
        return bookAgainUrl;
    }

    @JsonProperty("book_again_url")
    public void setBookAgainUrl(String bookAgainUrl) {
        this.bookAgainUrl = bookAgainUrl;
    }

    @JsonProperty("thumb")
    public String getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @JsonProperty("user_rating")
    public UserRating getUserRating() {
        return userRating;
    }

    @JsonProperty("user_rating")
    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    @JsonProperty("all_reviews_count")
    public Integer getAllReviewsCount() {
        return allReviewsCount;
    }

    @JsonProperty("all_reviews_count")
    public void setAllReviewsCount(Integer allReviewsCount) {
        this.allReviewsCount = allReviewsCount;
    }

    @JsonProperty("photos_url")
    public String getPhotosUrl() {
        return photosUrl;
    }

    @JsonProperty("photos_url")
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    @JsonProperty("photo_count")
    public Integer getPhotoCount() {
        return photoCount;
    }

    @JsonProperty("photo_count")
    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    @JsonProperty("menu_url")
    public String getMenuUrl() {
        return menuUrl;
    }

    @JsonProperty("menu_url")
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @JsonProperty("featured_image")
    public String getFeaturedImage() {
        return featuredImage;
    }

    @JsonProperty("featured_image")
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    @JsonProperty("has_online_delivery")
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    @JsonProperty("has_online_delivery")
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    @JsonProperty("is_delivering_now")
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    @JsonProperty("is_delivering_now")
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    @JsonProperty("include_bogo_offers")
    public Boolean getIncludeBogoOffers() {
        return includeBogoOffers;
    }

    @JsonProperty("include_bogo_offers")
    public void setIncludeBogoOffers(Boolean includeBogoOffers) {
        this.includeBogoOffers = includeBogoOffers;
    }

    @JsonProperty("deeplink")
    public String getDeeplink() {
        return deeplink;
    }

    @JsonProperty("deeplink")
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    @JsonProperty("is_table_reservation_supported")
    public Integer getIsTableReservationSupported() {
        return isTableReservationSupported;
    }

    @JsonProperty("is_table_reservation_supported")
    public void setIsTableReservationSupported(Integer isTableReservationSupported) {
        this.isTableReservationSupported = isTableReservationSupported;
    }

    @JsonProperty("has_table_booking")
    public Integer getHasTableBooking() {
        return hasTableBooking;
    }

    @JsonProperty("has_table_booking")
    public void setHasTableBooking(Integer hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonProperty("phone_numbers")
    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phone_numbers")
    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @JsonProperty("all_reviews")
    public AllReviews getAllReviews() {
        return allReviews;
    }

    @JsonProperty("all_reviews")
    public void setAllReviews(AllReviews allReviews) {
        this.allReviews = allReviews;
    }

    @JsonProperty("establishment")
    public List<Object> getEstablishment() {
        return establishment;
    }

    @JsonProperty("establishment")
    public void setEstablishment(List<Object> establishment) {
        this.establishment = establishment;
    }

    @JsonProperty("establishment_types")
    public List<Object> getEstablishmentTypes() {
        return establishmentTypes;
    }

    @JsonProperty("establishment_types")
    public void setEstablishmentTypes(List<Object> establishmentTypes) {
        this.establishmentTypes = establishmentTypes;
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
        return new HashCodeBuilder().append(allReviews).append(opentableSupport).append(thumb).append(hasTableBooking).append(establishmentTypes).append(averageCostForTwo).append(phoneNumbers).append(photoCount).append(switchToOrderMenu).append(bookAgainUrl).append(timings).append(currency).append(id).append(bookFormWebViewUrl).append(isBookFormWebView).append(isDeliveringNow).append(includeBogoOffers).append(offers).append(isTableReservationSupported).append(apikey).append(deeplink).append(isZomatoBookRes).append(establishment).append(photosUrl).append(url).append(userRating).append(cuisines).append(mezzoProvider).append(r).append(highlights).append(allReviewsCount).append(hasOnlineDelivery).append(menuUrl).append(featuredImage).append(name).append(location).append(eventsUrl).append(additionalProperties).append(priceRange).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restaurant_) == false) {
            return false;
        }
        Restaurant_ rhs = ((Restaurant_) other);
        return new EqualsBuilder().append(allReviews, rhs.allReviews).append(opentableSupport, rhs.opentableSupport).append(thumb, rhs.thumb).append(hasTableBooking, rhs.hasTableBooking).append(establishmentTypes, rhs.establishmentTypes).append(averageCostForTwo, rhs.averageCostForTwo).append(phoneNumbers, rhs.phoneNumbers).append(photoCount, rhs.photoCount).append(switchToOrderMenu, rhs.switchToOrderMenu).append(bookAgainUrl, rhs.bookAgainUrl).append(timings, rhs.timings).append(currency, rhs.currency).append(id, rhs.id).append(bookFormWebViewUrl, rhs.bookFormWebViewUrl).append(isBookFormWebView, rhs.isBookFormWebView).append(isDeliveringNow, rhs.isDeliveringNow).append(includeBogoOffers, rhs.includeBogoOffers).append(offers, rhs.offers).append(isTableReservationSupported, rhs.isTableReservationSupported).append(apikey, rhs.apikey).append(deeplink, rhs.deeplink).append(isZomatoBookRes, rhs.isZomatoBookRes).append(establishment, rhs.establishment).append(photosUrl, rhs.photosUrl).append(url, rhs.url).append(userRating, rhs.userRating).append(cuisines, rhs.cuisines).append(mezzoProvider, rhs.mezzoProvider).append(r, rhs.r).append(highlights, rhs.highlights).append(allReviewsCount, rhs.allReviewsCount).append(hasOnlineDelivery, rhs.hasOnlineDelivery).append(menuUrl, rhs.menuUrl).append(featuredImage, rhs.featuredImage).append(name, rhs.name).append(location, rhs.location).append(eventsUrl, rhs.eventsUrl).append(additionalProperties, rhs.additionalProperties).append(priceRange, rhs.priceRange).isEquals();
    }

}
