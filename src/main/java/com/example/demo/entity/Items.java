package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Items implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    @NotNull
    private Integer catergorySubId;
    @NotNull
    private String itemName;
    @NotNull
    private Double itemPrice;
    @NotNull
    private String itemCountity;
    private String itemImage;
    private String itemDiscription;
    private String itemDiscriptionSmall;


    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCatergorySubId() {
        return catergorySubId;
    }

    public void setCatergorySubId(Integer catergorySubId) {
        this.catergorySubId = catergorySubId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCountity() {
        return itemCountity;
    }

    public void setItemCountity(String itemCountity) {
        this.itemCountity = itemCountity;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemDiscription() {
        return itemDiscription;
    }

    public void setItemDiscription(String itemDiscription) {
        this.itemDiscription = itemDiscription;
    }

    public String getItemDiscriptionSmall() {
        return itemDiscriptionSmall;
    }

    public void setItemDiscriptionSmall(String itemDiscriptionSmall) {
        this.itemDiscriptionSmall = itemDiscriptionSmall;
    }
}
