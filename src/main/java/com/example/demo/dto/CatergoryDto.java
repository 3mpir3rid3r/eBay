package com.example.demo.dto;

import java.util.List;

public class CatergoryDto {

    private String catergoryName;
    private String catergoryCount;
    private List<CatergoryDto> subCatergory;

    public String getCatergoryName() {
        return catergoryName;
    }

    public void setCatergoryName(String catergoryName) {
        this.catergoryName = catergoryName;
    }

    public String getCatergoryCount() {
        return catergoryCount;
    }

    public void setCatergoryCount(String catergoryCount) {
        this.catergoryCount = catergoryCount;
    }

    public List<CatergoryDto> getSubCatergory() {
        return subCatergory;
    }

    public void setSubCatergory(List<CatergoryDto> subCatergory) {
        this.subCatergory = subCatergory;
    }
}
