/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户消息内容
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S2UserMessagePojo implements Serializable {

    private static final long serialVersionUID = -2032741322;

    private Integer   id;
    private Integer   userId;
    private String    messageTitle;
    private String    messageContent;
    private Timestamp createTime;
    private Timestamp updateTime;

    public S2UserMessagePojo() {}

    public S2UserMessagePojo(S2UserMessagePojo value) {
        this.id = value.id;
        this.userId = value.userId;
        this.messageTitle = value.messageTitle;
        this.messageContent = value.messageContent;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public S2UserMessagePojo(
        Integer   id,
        Integer   userId,
        String    messageTitle,
        String    messageContent,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.userId = userId;
        this.messageTitle = messageTitle;
        this.messageContent = messageContent;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMessageTitle() {
        return this.messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageContent() {
        return this.messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("S2UserMessagePojo (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(messageTitle);
        sb.append(", ").append(messageContent);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}