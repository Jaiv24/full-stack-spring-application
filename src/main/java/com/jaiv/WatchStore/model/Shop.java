package com.jaiv.WatchStore.model;

public class Shop {
    public int watchId;
    public String productPicUrl;
    public String name;
    public String price;

    public Shop(int watchId, String productPicUrl, String name, String price) {
        this.watchId = watchId;
        this.productPicUrl = productPicUrl;
        this.name = name;
        this.price = price;
    }

    public int getWatchId() {
        return watchId;
    }

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
