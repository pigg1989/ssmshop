package com.ssmshop.pojo;

public class UserMessage {
    private Integer recId;

    private Integer userId;

    private Integer messageId;

    private Boolean category;

    private Boolean status;

    public UserMessage(Integer recId, Integer userId, Integer messageId, Boolean category, Boolean status) {
        this.recId = recId;
        this.userId = userId;
        this.messageId = messageId;
        this.category = category;
        this.status = status;
    }

    public UserMessage() {
        super();
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Boolean getCategory() {
        return category;
    }

    public void setCategory(Boolean category) {
        this.category = category;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}