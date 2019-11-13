package com.ssmshop.pojo;

public class FriendLink {
    private Short linkId;

    private String linkName;

    private String linkUrl;

    private String linkLogo;

    private Byte orderby;

    private Boolean isShow;

    private Boolean target;

    public FriendLink(Short linkId, String linkName, String linkUrl, String linkLogo, Byte orderby, Boolean isShow, Boolean target) {
        this.linkId = linkId;
        this.linkName = linkName;
        this.linkUrl = linkUrl;
        this.linkLogo = linkLogo;
        this.orderby = orderby;
        this.isShow = isShow;
        this.target = target;
    }

    public FriendLink() {
        super();
    }

    public Short getLinkId() {
        return linkId;
    }

    public void setLinkId(Short linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkLogo() {
        return linkLogo;
    }

    public void setLinkLogo(String linkLogo) {
        this.linkLogo = linkLogo == null ? null : linkLogo.trim();
    }

    public Byte getOrderby() {
        return orderby;
    }

    public void setOrderby(Byte orderby) {
        this.orderby = orderby;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Boolean getTarget() {
        return target;
    }

    public void setTarget(Boolean target) {
        this.target = target;
    }
}