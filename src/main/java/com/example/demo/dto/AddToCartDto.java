package com.example.demo.dto;

public class AddToCartDto {
    private String itemId;
    private String itemQuentity;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemQuentity() {
        return itemQuentity;
    }

    public void setItemQuentity(String itemQuentity) {
        this.itemQuentity = itemQuentity;
    }
}
