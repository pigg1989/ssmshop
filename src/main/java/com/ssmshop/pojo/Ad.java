package com.ssmshop.pojo;

public class Ad {
    private Integer adId;

    private Integer pid;

    private Byte mediaType;

    private String adName;

    private String adLink;

    private Integer startTime;

    private Integer endTime;

    private String linkMan;

    private String linkEmail;

    private String linkPhone;

    private Integer clickCount;

    private Byte enabled;

    private Short orderby;

    private Boolean target;

    private String bgcolor;

    private String adCode;

    public Ad(Integer adId, Integer pid, Byte mediaType, String adName, String adLink, Integer startTime, Integer endTime, String linkMan, String linkEmail, String linkPhone, Integer clickCount, Byte enabled, Short orderby, Boolean target, String bgcolor, String adCode) {
        this.adId = adId;
        this.pid = pid;
        this.mediaType = mediaType;
        this.adName = adName;
        this.adLink = adLink;
        this.startTime = startTime;
        this.endTime = endTime;
        this.linkMan = linkMan;
        this.linkEmail = linkEmail;
        this.linkPhone = linkPhone;
        this.clickCount = clickCount;
        this.enabled = enabled;
        this.orderby = orderby;
        this.target = target;
        this.bgcolor = bgcolor;
        this.adCode = adCode;
    }

    public Ad() {
        super();
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getMediaType() {
        return mediaType;
    }

    public void setMediaType(Byte mediaType) {
        this.mediaType = mediaType;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink == null ? null : adLink.trim();
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail == null ? null : linkEmail.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Short getOrderby() {
        return orderby;
    }

    public void setOrderby(Short orderby) {
        this.orderby = orderby;
    }

    public Boolean getTarget() {
        return target;
    }

    public void setTarget(Boolean target) {
        this.target = target;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor == null ? null : bgcolor.trim();
    }

    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode == null ? null : adCode.trim();
    }
}