package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ashish on 13/5/17.
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer userId;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userPassword;
    @Temporal(TemporalType.DATE)
    private Date userBdDay;
    private String userAddFirstName;
    private String userAddLastName;
    private String userAddCompany;
    private String userAddressLine1;
    private String userAddressLine2;
    private String userAddCity;
    private String userAddState;
    private String userAddZipCode;
    private String userAddCountry;
    private String userAdditionl;
    private String userTelephone;
    private String userMobile;
    private String userRoll;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserBdDay() {
        return userBdDay;
    }

    public void setUserBdDay(Date userBdDay) {
        this.userBdDay = userBdDay;
    }

    public String getUserAddFirstName() {
        return userAddFirstName;
    }

    public void setUserAddFirstName(String userAddFirstName) {
        this.userAddFirstName = userAddFirstName;
    }

    public String getUserAddLastName() {
        return userAddLastName;
    }

    public void setUserAddLastName(String userAddLastName) {
        this.userAddLastName = userAddLastName;
    }

    public String getUserAddCompany() {
        return userAddCompany;
    }

    public void setUserAddCompany(String userAddCompany) {
        this.userAddCompany = userAddCompany;
    }

    public String getUserAddressLine1() {
        return userAddressLine1;
    }

    public void setUserAddressLine1(String userAddressLine1) {
        this.userAddressLine1 = userAddressLine1;
    }

    public String getUserAddressLine2() {
        return userAddressLine2;
    }

    public void setUserAddressLine2(String userAddressLine2) {
        this.userAddressLine2 = userAddressLine2;
    }

    public String getUserAddCity() {
        return userAddCity;
    }

    public void setUserAddCity(String userAddCity) {
        this.userAddCity = userAddCity;
    }

    public String getUserAddState() {
        return userAddState;
    }

    public void setUserAddState(String userAddState) {
        this.userAddState = userAddState;
    }

    public String getUserAddZipCode() {
        return userAddZipCode;
    }

    public void setUserAddZipCode(String userAddZipCode) {
        this.userAddZipCode = userAddZipCode;
    }

    public String getUserAddCountry() {
        return userAddCountry;
    }

    public void setUserAddCountry(String userAddCountry) {
        this.userAddCountry = userAddCountry;
    }

    public String getUserAdditionl() {
        return userAdditionl;
    }

    public void setUserAdditionl(String userAdditionl) {
        this.userAdditionl = userAdditionl;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserRoll() {
        return userRoll;
    }

    public void setUserRoll(String userRoll) {
        this.userRoll = userRoll;
    }
}
