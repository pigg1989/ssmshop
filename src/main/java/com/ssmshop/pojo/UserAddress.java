package com.ssmshop.pojo;

public class UserAddress {
    private Integer addressId;

    private Integer userId;

    private String consignee;

    private String email;

    private Integer country;

    private Integer province;

    private Integer city;

    private Integer district;

    private Integer twon;

    private String address;

    private String zipcode;

    private String mobile;

    private Boolean isDefault;

    private Boolean isPickup;

    public UserAddress(Integer addressId, Integer userId, String consignee, String email, Integer country, Integer province, Integer city, Integer district, Integer twon, String address, String zipcode, String mobile, Boolean isDefault, Boolean isPickup) {
        this.addressId = addressId;
        this.userId = userId;
        this.consignee = consignee;
        this.email = email;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.twon = twon;
        this.address = address;
        this.zipcode = zipcode;
        this.mobile = mobile;
        this.isDefault = isDefault;
        this.isPickup = isPickup;
    }

    public UserAddress() {
        super();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getTwon() {
        return twon;
    }

    public void setTwon(Integer twon) {
        this.twon = twon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsPickup() {
        return isPickup;
    }

    public void setIsPickup(Boolean isPickup) {
        this.isPickup = isPickup;
    }
}