package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Catergory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer catergoryId;
    private Integer catergorySubId;
    private String catergoryName;

    public Integer getCatergoryId() {
        return catergoryId;
    }

    public void setCatergoryId(Integer catergoryId) {
        this.catergoryId = catergoryId;
    }

    public Integer getCatergorySubId() {
        return catergorySubId;
    }

    public void setCatergorySubId(Integer catergorySubId) {
        this.catergorySubId = catergorySubId;
    }

    public String getCatergoryName() {
        return catergoryName;
    }

    public void setCatergoryName(String catergoryName) {
        this.catergoryName = catergoryName;
    }
}
