package com.ssmshop.pojo;

import java.math.BigDecimal;

public class Cart {
    private Integer id;

    private Integer userId;

    private String sessionId;

    private Integer goodsId;

    private String goodsSn;

    private String goodsName;

    private BigDecimal marketPrice;

    private BigDecimal goodsPrice;

    private BigDecimal memberGoodsPrice;

    private Short goodsNum;

    private String specKey;

    private String specKeyName;

    private String barCode;

    private Byte selected;

    private Integer addTime;

    private Byte promType;

    private Integer promId;

    private String sku;

    public Cart(Integer id, Integer userId, String sessionId, Integer goodsId, String goodsSn, String goodsName, BigDecimal marketPrice, BigDecimal goodsPrice, BigDecimal memberGoodsPrice, Short goodsNum, String specKey, String specKeyName, String barCode, Byte selected, Integer addTime, Byte promType, Integer promId, String sku) {
        this.id = id;
        this.userId = userId;
        this.sessionId = sessionId;
        this.goodsId = goodsId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;
        this.marketPrice = marketPrice;
        this.goodsPrice = goodsPrice;
        this.memberGoodsPrice = memberGoodsPrice;
        this.goodsNum = goodsNum;
        this.specKey = specKey;
        this.specKeyName = specKeyName;
        this.barCode = barCode;
        this.selected = selected;
        this.addTime = addTime;
        this.promType = promType;
        this.promId = promId;
        this.sku = sku;
    }

    public Cart() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
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

    public BigDecimal getMemberGoodsPrice() {
        return memberGoodsPrice;
    }

    public void setMemberGoodsPrice(BigDecimal memberGoodsPrice) {
        this.memberGoodsPrice = memberGoodsPrice;
    }

    public Short getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Short goodsNum) {
        this.goodsNum = goodsNum;
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

    public Byte getSelected() {
        return selected;
    }

    public void setSelected(Byte selected) {
        this.selected = selected;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Byte getPromType() {
        return promType;
    }

    public void setPromType(Byte promType) {
        this.promType = promType;
    }

    public Integer getPromId() {
        return promId;
    }

    public void setPromId(Integer promId) {
        this.promId = promId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}