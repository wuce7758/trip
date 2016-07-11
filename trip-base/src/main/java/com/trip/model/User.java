package com.trip.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class User implements Serializable {
    /**
     * 用户主键
     */
    @Id
    private Long uid;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登录密码
     */
    @Column(name = "pass_word")
    private String passWord;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 注册日期
     */
    private Date dateline;

    /**
     * 状态
     */
    private Byte state;

    /**
     * 获取用户主键
     *
     * @return uid - 用户主键
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 设置用户主键
     *
     * @param uid 用户主键
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登录密码
     *
     * @return pass_word - 登录密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置登录密码
     *
     * @param passWord 登录密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取注册日期
     *
     * @return dateline - 注册日期
     */
    public Date getDateline() {
        return dateline;
    }

    /**
     * 设置注册日期
     *
     * @param dateline 注册日期
     */
    public void setDateline(Date dateline) {
        this.dateline = dateline;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Byte state) {
        this.state = state;
    }
}