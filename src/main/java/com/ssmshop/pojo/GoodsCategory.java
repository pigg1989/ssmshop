package com.ssmshop.pojo;

public class GoodsCategory {
    private Short id;

    private String name;

    private String mobileName;

    private Short parentId;

    private String parentIdPath;

    private Boolean level;

    private Boolean sortOrder;

    private Boolean isShow;

    private String image;

    private Boolean isHot;

    private Boolean catGroup;

    private Boolean commissionRate;

    public GoodsCategory(Short id, String name, String mobileName, Short parentId, String parentIdPath, Boolean level, Boolean sortOrder, Boolean isShow, String image, Boolean isHot, Boolean catGroup, Boolean commissionRate) {
        this.id = id;
        this.name = name;
        this.mobileName = mobileName;
        this.parentId = parentId;
        this.parentIdPath = parentIdPath;
        this.level = level;
        this.sortOrder = sortOrder;
        this.isShow = isShow;
        this.image = image;
        this.isHot = isHot;
        this.catGroup = catGroup;
        this.commissionRate = commissionRate;
    }

    public GoodsCategory() {
        super();
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName == null ? null : mobileName.trim();
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public String getParentIdPath() {
        return parentIdPath;
    }

    public void setParentIdPath(String parentIdPath) {
        this.parentIdPath = parentIdPath == null ? null : parentIdPath.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public Boolean getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getCatGroup() {
        return catGroup;
    }

    public void setCatGroup(Boolean catGroup) {
        this.catGroup = catGroup;
    }

    public Boolean getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Boolean commissionRate) {
        this.commissionRate = commissionRate;
    }
}