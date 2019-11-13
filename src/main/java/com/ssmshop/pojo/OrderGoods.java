package com.ssmshop.pojo;

import java.math.BigDecimal;

public class OrderGoods {
    private Integer recId;

    private Integer orderId;

    private Integer goodsId;

    private String goodsName;

    private String goodsSn;

    private Short goodsNum;

    private BigDecimal marketPrice;

    private BigDecimal goodsPrice;

    private BigDecimal costPrice;

    private BigDecimal memberGoodsPrice;

    private Integer giveIntegral;

    private String specKey;

    private String specKeyName;

    private String barCode;

    private Boolean isComment;

    private Boolean promType;

    private Integer promId;

    private Boolean isSend;

    private Integer deliveryId;

    private String sku;

    public OrderGoods(Integer recId, Integer orderId, Integer goodsId, String goodsName, String goodsSn, Short goodsNum, BigDecimal marketPrice, BigDecimal goodsPrice, BigDecimal costPrice, BigDecimal memberGoodsPrice, Integer giveIntegral, String specKey, String specKeyName, String barCode, Boolean isComment, Boolean promType, Integer promId, Boolean isSend, Integer deliveryId, String sku) {
        this.recId = recId;
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsSn = goodsSn;
        this.goodsNum = goodsNum;
        this.marketPrice = marketPrice;
        this.goodsPrice = goodsPrice;
        this.costPrice = costPrice;
        this.memberGoodsPrice = memberGoodsPrice;
        this.giveIntegral = giveIntegral;
        this.specKey = specKey;
        this.specKeyName = specKeyName;
        this.barCode = barCode;
        this.isComment = isComment;
        this.promType = promType;
        this.promId = promId;
        this.isSend = isSend;
        this.deliveryId = deliveryId;
        this.sku = sku;
    }

    public OrderGoods() {
        super();
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public Short getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Short goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getMemberGoodsPrice() {
        return memberGoodsPrice;
    }

    public void setMemberGoodsPrice(BigDecimal memberGoodsPrice) {
        this.memberGoodsPrice = memberGoodsPrice;
    }

    public Integer getGiveIntegral() {
        return giveIntegral;
    }

    public void setGiveIntegral(Integer giveIntegral) {
        this.giveIntegral = giveIntegral;
    }

    public String getSpecKey() {
        return specKey;
    }

    public void setSpecKey(String specKey) {
        this.specKey = specKey == null ? null : specKey.trim();
    }

    public String getSpecKeyName() {
        return specKeyName;
    }

    public void setSpecKeyName(String specKeyName) {
        this.specKeyName = specKeyName == null ? null : specKeyName.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public Boolean getIsComment() {
        return isComment;
    }

    public void setIsComment(Boolean isComment) {
        this.isComment = isComment;
    }

    public Boolean getPromType() {
        return promType;
    }

    public void setPromType(Boolean promType) {
        this.promType = promType;
    }

    public Integer getPromId() {
        return promId;
    }

    public void setPromId(Integer promId) {
        this.promId = promId;
    }

    public Boolean getIsSend() {
        return isSend;
    }

    public void setIsSend(Boolean isSend) {
        this.isSend = isSend;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}