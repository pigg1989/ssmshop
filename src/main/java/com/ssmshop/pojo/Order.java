package com.ssmshop.pojo;

import java.math.BigDecimal;

public class Order {
    private Integer orderId;

    private String orderSn;

    private Integer userId;

    private Boolean orderStatus;

    private Boolean shippingStatus;

    private Boolean payStatus;

    private String consignee;

    private Integer country;

    private Integer province;

    private Integer city;

    private Integer district;

    private Integer twon;

    private String address;

    private String zipcode;

    private String mobile;

    private String email;

    private String shippingCode;

    private String shippingName;

    private String payCode;

    private String payName;

    private String invoiceTitle;

    private BigDecimal goodsPrice;

    private BigDecimal shippingPrice;

    private BigDecimal userMoney;

    private BigDecimal couponPrice;

    private Integer integral;

    private BigDecimal integralMoney;

    private BigDecimal orderAmount;

    private BigDecimal totalAmount;

    private Integer addTime;

    private Integer shippingTime;

    private Integer confirmTime;

    private Integer payTime;

    private Short orderPromId;

    private BigDecimal orderPromAmount;

    private BigDecimal discount;

    private String userNote;

    private String adminNote;

    private String parentSn;

    private Boolean isDistribut;

    public Order(Integer orderId, String orderSn, Integer userId, Boolean orderStatus, Boolean shippingStatus, Boolean payStatus, String consignee, Integer country, Integer province, Integer city, Integer district, Integer twon, String address, String zipcode, String mobile, String email, String shippingCode, String shippingName, String payCode, String payName, String invoiceTitle, BigDecimal goodsPrice, BigDecimal shippingPrice, BigDecimal userMoney, BigDecimal couponPrice, Integer integral, BigDecimal integralMoney, BigDecimal orderAmount, BigDecimal totalAmount, Integer addTime, Integer shippingTime, Integer confirmTime, Integer payTime, Short orderPromId, BigDecimal orderPromAmount, BigDecimal discount, String userNote, String adminNote, String parentSn, Boolean isDistribut) {
        this.orderId = orderId;
        this.orderSn = orderSn;
        this.userId = userId;
        this.orderStatus = orderStatus;
        this.shippingStatus = shippingStatus;
        this.payStatus = payStatus;
        this.consignee = consignee;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.twon = twon;
        this.address = address;
        this.zipcode = zipcode;
        this.mobile = mobile;
        this.email = email;
        this.shippingCode = shippingCode;
        this.shippingName = shippingName;
        this.payCode = payCode;
        this.payName = payName;
        this.invoiceTitle = invoiceTitle;
        this.goodsPrice = goodsPrice;
        this.shippingPrice = shippingPrice;
        this.userMoney = userMoney;
        this.couponPrice = couponPrice;
        this.integral = integral;
        this.integralMoney = integralMoney;
        this.orderAmount = orderAmount;
        this.totalAmount = totalAmount;
        this.addTime = addTime;
        this.shippingTime = shippingTime;
        this.confirmTime = confirmTime;
        this.payTime = payTime;
        this.orderPromId = orderPromId;
        this.orderPromAmount = orderPromAmount;
        this.discount = discount;
        this.userNote = userNote;
        this.adminNote = adminNote;
        this.parentSn = parentSn;
        this.isDistribut = isDistribut;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Boolean shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(BigDecimal shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getIntegralMoney() {
        return integralMoney;
    }

    public void setIntegralMoney(BigDecimal integralMoney) {
        this.integralMoney = integralMoney;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Integer shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Short getOrderPromId() {
        return orderPromId;
    }

    public void setOrderPromId(Short orderPromId) {
        this.orderPromId = orderPromId;
    }

    public BigDecimal getOrderPromAmount() {
        return orderPromAmount;
    }

    public void setOrderPromAmount(BigDecimal orderPromAmount) {
        this.orderPromAmount = orderPromAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote == null ? null : userNote.trim();
    }

    public String getAdminNote() {
        return adminNote;
    }

    public void setAdminNote(String adminNote) {
        this.adminNote = adminNote == null ? null : adminNote.trim();
    }

    public String getParentSn() {
        return parentSn;
    }

    public void setParentSn(String parentSn) {
        this.parentSn = parentSn == null ? null : parentSn.trim();
    }

    public Boolean getIsDistribut() {
        return isDistribut;
    }

    public void setIsDistribut(Boolean isDistribut) {
        this.isDistribut = isDistribut;
    }
}