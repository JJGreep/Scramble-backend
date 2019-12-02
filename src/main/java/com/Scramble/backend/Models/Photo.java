package com.Scramble.backend.Models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;


public class Photo {

    String id;

    String url;
    String thumb_url;
    User user;
    int res_id;
    String caption;
    int timestamp;
    String friendly_time;
    int width;
    int height;
    int comments_count;
    int likes_count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getFriendly_time() {
        return friendly_time;
    }

    public void setFriendly_time(String friendly_time) {
        this.friendly_time = friendly_time;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(int likes_count) {
        this.likes_count = likes_count;
    }

    public Photo(){

    }

    public Photo(String id, String url, String thumb_url, User user, int res_id, String caption, int timestamp, String friendly_time, int width, int height, int comments_count, int likes_count) {
        this.id = id;
        this.url = url;
        this.thumb_url = thumb_url;
        this.user = user;
        this.res_id = res_id;
        this.caption = caption;
        this.timestamp = timestamp;
        this.friendly_time = friendly_time;
        this.width = width;
        this.height = height;
        this.comments_count = comments_count;
        this.likes_count = likes_count;
    }
}
