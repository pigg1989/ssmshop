package com.ssmshop.pojo;

public class Shipping {
    private Byte shippingId;

    private String shippingCode;

    private String shippingName;

    private String shippingDesc;

    private String insure;

    private Boolean enabled;

    public Shipping(Byte shippingId, String shippingCode, String shippingName, String shippingDesc, String insure, Boolean enabled) {
        this.shippingId = shippingId;
        this.shippingCode = shippingCode;
        this.shippingName = shippingName;
        this.shippingDesc = shippingDesc;
        this.insure = insure;
        this.enabled = enabled;
    }

    public Shipping() {
        super();
    }

    public Byte getShippingId() {
        return shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
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

    public String getShippingDesc() {
        return shippingDesc;
    }

    public void setShippingDesc(String shippingDesc) {
        this.shippingDesc = shippingDesc == null ? null : shippingDesc.trim();
    }

    public String getInsure() {
        return insure;
    }

    public void setInsure(String insure) {
        this.insure = insure == null ? null : insure.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}