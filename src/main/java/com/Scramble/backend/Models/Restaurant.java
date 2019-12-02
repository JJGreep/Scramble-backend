package com.Scramble.backend.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;


public class Restaurant {

    int id;
    String name;
    String url;
    Location location;
    int average_cost_for_two;
    int price_range;
    String currency;
    String thumb;
    String featured_image;
    String photos_url;
    String menu_url;
    String events_url;
    UserRating user_rating;
    boolean has_online_delivery;
    boolean is_delivering_now;
    boolean has_table_booking;
    String deeplink;
    String cusines;
    int all_reviews_count;
    int photo_count;
    String phone_number;
    ArrayList<Photo> photos;
    ArrayList<Review> all_reviews;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getAverage_cost_for_two() {
        return average_cost_for_two;
    }

    public void setAverage_cost_for_two(int average_cost_for_two) {
        this.average_cost_for_two = average_cost_for_two;
    }

    public int getPrice_range() {
        return price_range;
    }

    public void setPrice_range(int price_range) {
        this.price_range = price_range;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getFeatured_image() {
        return featured_image;
    }

    public void setFeatured_image(String featured_image) {
        this.featured_image = featured_image;
    }

    public String getPhotos_url() {
        return photos_url;
    }

    public void setPhotos_url(String photos_url) {
        this.photos_url = photos_url;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public UserRating getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(UserRating user_rating) {
        this.user_rating = user_rating;
    }

    public boolean isHas_online_delivery() {
        return has_online_delivery;
    }

    public void setHas_online_delivery(boolean has_online_delivery) {
        this.has_online_delivery = has_online_delivery;
    }

    public boolean isIs_delivering_now() {
        return is_delivering_now;
    }

    public void setIs_delivering_now(boolean is_delivering_now) {
        this.is_delivering_now = is_delivering_now;
    }

    public boolean isHas_table_booking() {
        return has_table_booking;
    }

    public void setHas_table_booking(boolean has_table_booking) {
        this.has_table_booking = has_table_booking;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public String getCusines() {
        return cusines;
    }

    public void setCusines(String cusines) {
        this.cusines = cusines;
    }

    public int getAll_reviews_count() {
        return all_reviews_count;
    }

    public void setAll_reviews_count(int all_reviews_count) {
        this.all_reviews_count = all_reviews_count;
    }

    public int getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(int photo_count) {
        this.photo_count = photo_count;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public ArrayList<Review> getAll_reviews() {
        return all_reviews;
    }

    public void setAll_reviews(ArrayList<Review> all_reviews) {
        this.all_reviews = all_reviews;
    }

    public Restaurant(){

    }

    public Restaurant(int id, String name, String url, Location location, int average_cost_for_two, int price_range, String currency, String thumb, String featured_image, String photos_url, String menu_url, String events_url, UserRating user_rating, boolean has_online_delivery, boolean is_delivering_now, boolean has_table_booking, String deeplink, String cusines, int all_reviews_count, int photo_count, String phone_number, ArrayList<Photo> photos, ArrayList<Review> all_reviews) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.location = location;
        this.average_cost_for_two = average_cost_for_two;
        this.price_range = price_range;
        this.currency = currency;
        this.thumb = thumb;
        this.featured_image = featured_image;
        this.photos_url = photos_url;
        this.menu_url = menu_url;
        this.events_url = events_url;
        this.user_rating = user_rating;
        this.has_online_delivery = has_online_delivery;
        this.is_delivering_now = is_delivering_now;
        this.has_table_booking = has_table_booking;
        this.deeplink = deeplink;
        this.cusines = cusines;
        this.all_reviews_count = all_reviews_count;
        this.photo_count = photo_count;
        this.phone_number = phone_number;
        this.photos = photos;
        this.all_reviews = all_reviews;
    }
}
